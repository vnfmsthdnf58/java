/*
 * Data : 2020.05.14
 * Author : 김태석
 * Description : DoWhileEx(up&down게임)
 * Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class ex03_DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3번 안에 맞추면 통과
		// 그 이후에 맞추면 벌칙
		int answer = (int)(Math.random()*45)+1; // 랜덤 주사위
		int input = 0; // 입력할 값
		int count = 0; // 총 횟수
		
		boolean run = true;
		Scanner sc = new Scanner(System.in); 
		System.out.println("up & down Game시작!");
		
		do {
			System.out.println("1부터 45까지 숫자를 말하세요.");
			input = sc.nextInt(); // 맞추어야할 숫자 입력
			count++; // 입력한 횟수 증가
			
			if(answer>input) { // 랜덤 주사위 값이 입력한 숫자보다 클경우 
				System.out.println("up! 더 큰수를 말하세요."); 
			} else if (answer < input) { // 랜덤주사위 값이 입력한 숫자보다 작을경우
				System.out.println("down! 더 작은수를 말하세요.");
			} else { // 위에 해당하는 모든경우가 아닐경우 
				System.out.println("정답입니다." + answer +"입니다.");
				System.out.println("시도한 횟수는"+ count +"번 입니다.");
				run = false; // run = false; 로 만들어 true값을 부정해서 while값 종료
				if(count > 3) {
					System.out.println("횟수 3번을 넘어서 벌칙입니다.");
				} else {
					System.out.println("맞추었습니다 통과.");
				}
			}
		} while(run);
	}

}
