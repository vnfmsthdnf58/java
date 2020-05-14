/*
 * Data : 2020.05.14
 * Author : 김태석
 * Description : whileEX
 * Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class ex01_whileEX {
		public static void main(String[] atgs) {
			 int account= 0; // 통장만들기 0원
			 int balance; // 
			Scanner sc = new Scanner(System.in);
			 boolean run = true; // whuile문 사용하기 위해서 run(조건변수)선언, true초기화
			 
		
			// while문 사용
			while(run) {
			System.out.println("----------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("----------------------------------");
			System.out.println("선택 >>");
			int menu = sc.nextInt(); // menu 변수선언, 입력
			
			// swutch-case문 사용
			
			switch(menu) {
			case   1:
				System.out.print("예금액 >>"); 
				// int a = sc.nextInt();
				// account += a;
				account += sc.nextInt(); // 예금액 입력		
				break; // switch문 탈출
			case   2:
				System.out.print("출금액 >>");
				account -= sc.nextInt();
				break;
			case   3:
				System.out.print("잔고액 >>"+ account);
				break;
			case   4:
				run = false; // 4 입력시 run값이 false로 변한다.
				
				//break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			} // switch문 종료
			} // while문 종료
			System.out.println("프로그램을 종료합니다.");
		}
}
