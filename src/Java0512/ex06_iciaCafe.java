
/*

 * Date: 2020. 05 12

 * Author : hm

 * Description: ���ǹ� switchCaseExample1

 * Version : 1.0

 */

package Java0512;

 

import java.util.Scanner;

 

public class ex06_iciaCafe {

 

	public static void main(String[] agrs) {

		// Ű����ũ : ���ΰ��� �ý��� 

		// �Ƹ޸�ī��(4,000��)

		// �ٴҶ��(4,500��)

		// �ڸ���Ϻ�Ƽ(5,000��)

		// �ٴҶ�����Ĩ��ī(5,500��)

		

		Scanner sc =new Scanner(System.in);

		int num;

		int price = 0;

		String menu = "";

		

		System.out.println("ICIA Cafe�� ���Ű��� ȯ���մϴ�.");

		System.out.println("�ֹ��� ���͵帮�ڽ��ϴ�.\n");

		// \n�ǹ�  : ���� ����

		// \t�ǹ� :         

		System.out.println("1.�Ƹ޸�ī��\t\t2.�ٴҶ��");

		System.out.println("3.�ڸ���Ϻ�Ƽ\t\t4.�ٴҶ�����Ĩ��ī");

		

		System.out.println("�޴��� ������ �ּ���.>>");

		num= sc.nextInt();

		

		switch(num) {

		case 1:

			menu="�Ƹ޸�ī��";

			price=4000;

			break;

		case 2:

			menu="�ٴҶ��";

			price=4500;

			break;

		case 3:

			menu="�ڸ���Ϻ�Ƽ";

			price=5000;

			break;

		case 4:

			menu="�ٴҶ�����Ĩ��ī";

			price=5500;

			break;

	    default:

	    	System.out.println("�ش� �޴��� �����ϴ�!");

		}

		if(num >=1 && num <=4) {

			System.out.println("\n�ֹ��Ͻ� �޴���" + menu);

			System.out.println("������"+ price + "�� �Դϴ�.");

		} System.out.println("�̿��� �ּż� �����մϴ�.");

	} 

}

