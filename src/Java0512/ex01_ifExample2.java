/*
 * Date : 2020.05.12
 * Author : ���¼�
 * Description : if���ǹ�(Example)
 * Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�ʸ� ����ؼ� ����, ����, ���������� �Է¹޾Ƽ� ����, ����� ���Ͻÿ�.
		// ��������� �̿��Ͽ� A+, A, B+, B, C+, C, D+, D, F
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int num2;
		int num3;
		double score;
		double Age;
		
		String grade="";
		
		num = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		score = num + num2 + num3;
		
		System.out.println("���� :"+ score);
		
		Age = score / 3;
		
		System.out.println("��� :"+ Age);
		
		
		if(Age > 100) {
			System.out.println("������ �ѱ���� �����ϴ�.");
		} else if(Age >= 95) {
			grade =  "A+";
		} else if(Age >= 90) {
			grade = "A";
		} else if(Age >= 85) {
			grade = "B+";
		} else if(Age >= 80) {
			grade = "B";
		} else if(Age >= 75) {
			grade = "C+";
		} else if(Age >= 70) {
			grade = "C";
		} else if(Age >= 65) {
			grade = "D+";
		} else if(Age >= 60) {
			grade = "D";
		} else {
			grade = "F";
		} 
		
		System.out.println(grade);
	} 

}
