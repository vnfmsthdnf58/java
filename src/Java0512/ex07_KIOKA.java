
/*

  Date : 2020.05.12

  Author : 김태석, 오은희, 윤희영, 임형민

  Description : 알콜과 안주 자판기

  Version : 1.0

 */

package Java0512;

 

import java.util.Scanner;

 

public class ex07_KIOKA {

 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int num;

		String food="";

		String drink="";

		int price='0';

		int sum='0';

		int ranNum='0';

		

		System.out.println("환\t영\t합\t니\t다.");

		System.out.println("\n메뉴판\n");

		System.out.println("1. 소주 \t\t\t2. 맥주\n3. 보드카(양주)\t\t4. 와인\n5. 막걸리\n");

		System.out.println("\t* 모든 안주는 5000원 입니다.\n");

		

		System.out.print("원하시는 술을 골라주세요.  >>  ");

		num=sc.nextInt();

		

		ranNum=(int)(Math.random()*10)+1;

		

		switch(ranNum) {

		case 1:

			food="삼겹살";

			break;

		case 2:

			food="매운탕";

			break;

		case 3:

			food="치킨";

			break;

		case 4:

			food="감자튀김";

			break;

		case 5:

			food="카나페";

			break;

		case 6:

			food="나쵸";

			break;

		case 7:

			food="스테이크";

			break;

		case 8:

			food="파스타";

			break;

		case 9:

			food="골뱅이소면";

			break;

		case 10:

			food="도토리묵";

			break;

			

		}

		

		

		switch(num) {

		case 1:

			drink="소주";

			price=4000;

			break;

			

		case 2:

			drink="맥주";

			price=5000;

			break;

			

		case 3:

			drink="보드카(양주)";

			price=6000;

			break;

			

		case 4:

			drink="와인";

			price=4500;

			break;

			

		case 5:

			drink="막걸리";

			price=4000;

			break;

			

		}

		

		sum=price+5000;

		System.out.println("주문하신 술 종류는 "+drink+"이고 안주는 "+food+"입니다.");

		System.out.println("총 결제 금액은 "+sum+"원 입니다.");

		

		

 

	}

 

}
