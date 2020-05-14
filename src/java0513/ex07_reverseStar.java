/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : reverseStar
 * Version : 1.0
 */
package java0513;

public class ex07_reverseStar {
	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		for(int i = 1; i <= 5; i++) { // 줄갯수
			for (int j = 5; i <= j; j--) { // 별갯수 
				System.out.print("*");
			}System.out.println("   ");
		}
	}
}
