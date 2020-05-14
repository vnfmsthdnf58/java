/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : nestedFor
 * Version : 1.0
 */
package java0513;

public class ex04_nestedFor {
	public static void main(String[] args) {
		// 중첩for문
		/*
		 *  for(초기화식; 조건식; 증감식){
		 *  	for(초기화식; 조건식; 증감식){
		 *  		실행할 반복문
		 *  }
		 *  }
		 */
		for(int i = 1; i<=2;i++) {
			for(int j = 1; j<=3; j++) {
				// 실행할 반복문
				System.out.println("i값 : "+i);
				System.out.println("\t\t j값:"+j);
			}System.out.println("=======================");
		}
	}
}
