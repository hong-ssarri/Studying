package day07;

import java.util.Scanner; //ctrl + shift + O //자동으로 import시켜주는 방법

public class If_elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이");
		age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다");
		}else if(age > 13) {
			System.out.println("청소년입니다");
		}
		else if(age > 8) {
			System.out.println("어린이입니다");
		}
		else {
			System.out.println("유아입니다");
		}
		System.out.println("결제를 진행합니담");
	}

}
