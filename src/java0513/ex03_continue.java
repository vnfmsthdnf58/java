/*
 * Data : 2020.05.13
 * Author : 김태석
 * Description : continue
 * Version : 1.0
 */
package java0513;

public class ex03_continue {
	public static void main(String[] args) {
		//continue 문은 반복문과 함께 사용
		// 반복문 안에서 continue 문을 만나면 이후 문장은 수행하지 않고 
		// for 문의 증감식을 수행한다.
		
		/*
		 *  for (초기화식; 조건식; 증감식){
		 *  	특정조건
		 *  	continue;
		 *  
		 *  	반복문 수행;
		 *  
		 */
//		for(int i = 1; i <= 10; i++) 
//			if( i % 2 == 0 ) {
//				continue;
//			}
//			System.out.println(i);
			
			int sum = 0;
			
			for(int i=1; i<= 100; i++) {
				//짝수만 구하는 조건
				if(i%2==1) {
					continue;
					// 홀수값은 실행되지 않는다.
				}
				sum += i;
				
			}System.out.println(sum);
			             
			
		}
	}

