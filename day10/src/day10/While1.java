package day10;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";//�켱�� while���� ����ǵ��� �ʱⰪ�� "��"�� �� �������� �־��ش�
		
		int count = 0;
		while(answer.contentEquals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�?");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("������ %d������߽��ϴ�.\n", ++count);
			}
		}
		System.out.println("�������");
	}

}
