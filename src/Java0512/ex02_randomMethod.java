/*
 * Date : 2020.05.12
 * Author : ���¼�
 * Description : randomMethood
 * Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex02_randomMethod {
		public static void main(String[] args) {
		// �����޼ҵ� : Ư�� ���������� ���� �ϳ��� ������ִ� �޼ҵ�
		// Math.random() ==> 0���� ũ�ų� ����, 1���� ���� ���ڸ� �������� �߻�
		
		/*
		 * double ranNum = Math.random(); 
		 * System.out.println("ranNum" + ranNum);
		 */
		
		// 1~10������ ���� ���
		
//		ranNum = (int)(Math.random()*10)+1;
//		System.out.println(ranNum);
//		// (int)(Math.random() * N) + S;
//		// S: ����, N : ��
		
		// �ֻ��� ����
		int dice = (int)(Math.random()* 6) + 1;
		System.out.println(dice);
		
		// �ζ� ��ȣ
			
		Scanner sc = new Scanner(System.in);
		
		int num2;
		
		num2 = sc.nextInt();
		
		String drink="";
		switch(num2) {
		case 1 :
			drink = "����";
		case 2 :
			drink = "����";
		case 3 :
			drink = "����";
		case 4 :
			drink = "���ɸ�";
		}
		
		int num;
		int ranDice = (int)(Math.random()*2) + 1 ;
		System.out.println(ranDice);
		num = ranDice;
		String food ="";
		switch(ranDice) { 
		case 1 :
			food = "����";
		case 2 :
			food = "����";
		
		default :
			}
		System.out.println(food);
		
	}
}
