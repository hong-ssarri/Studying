package day07;

import java.util.Scanner; //ctrl + shift + O //�ڵ����� import�����ִ� ���

public class If_elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("����");
		age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("�����Դϴ�");
		}else if(age > 13) {
			System.out.println("û�ҳ��Դϴ�");
		}
		else if(age > 8) {
			System.out.println("����Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
		System.out.println("������ �����մϴ�");
	}

}
