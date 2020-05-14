/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : fornumToLnum
 * Version : 1.0
 */
package java0513;

import java.util.Scanner;

public class ex02_forsnumToLnum {
	public static void main(String[] args) {
		// for문 사용해서
		// 두개의 정수(시작값, 끝나는 값)를 입력받아서 총합을 구하는 프로그램을 만들어 보시오.
		
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int num2;
		num2 = sc.nextInt();
		int sum = 0;
		int  i;
		for( i = num; i<= num2; i++) {
			sum = sum +i;
	
			if (i < num2) {
				System.out.print(i+"+");
			}else {
				System.out.println(i);
			}
			
				
		}
		System.out.print("="+sum);
		sc.close();
		}
}
