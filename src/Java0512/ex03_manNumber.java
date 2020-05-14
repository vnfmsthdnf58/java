/*
 * Date : 2020.05.12
 * Author : ���¼�
 * Description : maxNumber
 * Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex03_manNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �μ��� �Է¹޾� ū���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int num1, num2, max;
		System.out.println("ù��° ���� >>");
		num1 = sc.nextInt();
		System.out.println("�ι�° ���� >>");
		num2 = sc.nextInt();
	
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		System.out.println("�ִ밪 :"+ max);
	
		// ���� 3���� �Է¹޾Ƽ� �ִ밪 ���ϱ�
		//Scanner sc = new Scanner(System.in);
		int num3;
		
		System.out.println("ù��° �� :");
		num1 = sc.nextInt();
		System.out.println("�ι�° �� :");
		num2 = sc.nextInt();
		System.out.println("����° �� :");
		num3 = sc.nextInt();
		
		if (num1 > num2) {
			max = num1;
			if (num2>num3) {
				max = num2;
		} 		if (num1>num3) {
					max = num1;
		}  
		} else if (num2>num3){
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
		
//		if(num1>num2 && num1>num3) {
//			max = num1;
//		} else if(num2>num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
//		System.out.println(max);
			
	
	
	
	}

}
