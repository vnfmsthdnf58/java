/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : whileEx
 * Version : 1.0
 */
package java0513;

public class ex10_whileEx {
	public static void main(String[] args) {
		// while문을 이용해서 주사위를 던졌을때 5가 나오면 종료하는 프로그램을 만드시오.
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			 int dics = (int)(Math.random()*6)+1;
			 cnt++;
			 System.out.println (dics);
			 if (dics == 5) {
				 run = false;
		 } 	
		 }System.out.println("\n 던진 횟수 : "+cnt);
}
}
// Kpoint!
// run = true 일때 반복문 실행
// run = false 일때 반복문 종료