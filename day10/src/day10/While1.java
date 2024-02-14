package day10;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";//우선은 while문이 실행되도록 초기값을 "참"이 될 조건으로 넣어준다
		
		int count = 0;
		while(answer.contentEquals("Y")) {
			System.out.println("음악을 재생하시겠습니까?");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번재생했습니다.\n", ++count);
			}
		}
		System.out.println("재생종료");
	}

}
