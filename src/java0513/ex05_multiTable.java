/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : multiTable
 * Version : 1.0
 */
package java0513;

public class ex05_multiTable {
	public static void main(String[] args) {
		// 중첩 for문을 이용하여 구구단을 작성해라
		// 2단부터 9단까지!

		int sum;
//		for(int i = 2; i<= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				sum = i*j;
//				System.out.print(i+"x"+j+"="+sum);
//			} System.out.print("==============================");
//		}
		// 응용문제
		// 홀수단 만 출력하기!
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				sum = i*j;
				if(j%2 == 0) {
					continue;
					}System.out.println(i+"x"+j+"="+sum);
				}
			
		}
	}
}
