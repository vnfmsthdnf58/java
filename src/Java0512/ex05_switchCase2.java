/*
 * Date : 2020.05.12
 * Author : ���¼�
 * Description : ���ǹ�switchcase2
 * Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex05_switchCase2 {
		public static void main(String[] args) {
		// switch - case�� ����ؼ� ���� ��¥ ����ϱ�
		
			int month;
			int day =0;
			int NE;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�� �� �Է��ϼ��� >>");
			month = sc.nextInt();
			
			
			switch(month) { 
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				day = 31;
				break;
			case 2 :
				day = 28;
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				day = 30;
			default :
				
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
				//break;
			}
				
		if(month>= 1 && month <=12) {
		System.out.println("�Է��Ͻ�"+ month+ "����"+day+"�ϱ��� �Դϴ�.");
			} else {
				System.out.println("");
			}
		}
}

