package day10;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int user = 101;
		int num = random.nextInt(100) +1;
		

		while(user != num) {
			System.out.print("숫자 입력");
			user = sc.nextInt();
			
			if(user < num) {//user < num => up
				System.out.println("up");
			}else if(user > num) {//user > num => down
				System.out.println("down");
			}else {//user == num
				System.out.println("정답");
			}
			
		}
	}

}
