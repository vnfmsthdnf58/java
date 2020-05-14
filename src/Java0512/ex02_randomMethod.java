/*
 * Date : 2020.05.12
 * Author : 김태석
 * Description : randomMethood
 * Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex02_randomMethod {
		public static void main(String[] args) {
		// 랜덤메소드 : 특정 범위내에서 숫자 하나를 출력해주는 메소드
		// Math.random() ==> 0보다 크거나 같고, 1보다 작은 숫자를 무작위로 발생
		
		/*
		 * double ranNum = Math.random(); 
		 * System.out.println("ranNum" + ranNum);
		 */
		
		// 1~10사이의 숫자 출력
		
//		ranNum = (int)(Math.random()*10)+1;
//		System.out.println(ranNum);
//		// (int)(Math.random() * N) + S;
//		// S: 시작, N : 끝
		
		// 주사위 예제
		int dice = (int)(Math.random()* 6) + 1;
		System.out.println(dice);
		
		// 로또 번호
			
		Scanner sc = new Scanner(System.in);
		
		int num2;
		
		num2 = sc.nextInt();
		
		String drink="";
		switch(num2) {
		case 1 :
			drink = "소주";
		case 2 :
			drink = "맥주";
		case 3 :
			drink = "와인";
		case 4 :
			drink = "막걸리";
		}
		
		int num;
		int ranDice = (int)(Math.random()*2) + 1 ;
		System.out.println(ranDice);
		num = ranDice;
		String food ="";
		switch(ranDice) { 
		case 1 :
			food = "삼겹살";
		case 2 :
			food = "갈비";
		
		default :
			}
		System.out.println(food);
		
	}
}
