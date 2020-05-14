/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : reverseStar
 * Version : 1.0
 */
package java0513;

public class ex08_forproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (int i = 1; i <= 4; i++) { // 줄
 		for (int j = 3; j >= i; j--) { // 공백  (int j = 1; j <= 4-i; j++) 이런 식도 가능.
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // 별 
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}

