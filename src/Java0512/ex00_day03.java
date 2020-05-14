/*
 * Date : 2020.05.13
 * Author : 김태석	
 * Description : day03 정리
 * Version : 1.0
 */
package Java0512;

public class ex00_day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 랜덤메소드 : 0보다 크거나 같고, 1보다 작은 수를 무작위로 발생시킨다.
		// 0.0000000 ~ 0.999999....
		int rNum = (int)(Math.random()*10) + 1;
		// 1부터 10까지의 숫자중 랜덤으로 발생
		// (int)(Math.random()* N) + S
		// 시작값 : S, 끝나는 값 : N
		double dNum = Math.random();
		System.out.println(dNum);
		// 0.04576 =>> 0.4576 =>> 0 =>> 1
		// 0.57795 =>> 5.7795 =>> 5 =>> 6
		// 0.51887 =>> 5.1887 =>> 5 =>> 6
		
		// 2. 조건문 switch - case
		/*
		 * switch(조건변수){
		 * case 변수값 1 :
		 *		해당 조건이 참일때 실행
		 *		break;
		 * case 변수값 2 : 
		 * 		해당 조건이 참일때 실행
		 * 		break;
		 * case 변수값 3 :
		 * 		해당 조건이 참일때 실행
		 * 		break;
		 * ~~~~~~~
		 * default:
		 * 		case에서 어떤 조건도 맞지 않을때 실행
		 * 		break;
		 * }
		*/
		
		// break;가 실행될때까지 다음 case문을 실행한다.
		
		// 3. 반복문 For
		
		/*
		 * for(초기화식; 조건식; 증감식){ 
		 * 	반복할 수행문
		 * }
		 * 
			 */
	}

}
