package day09;

public abstract class For1 {
	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + "번 컴퓨터 켜줘");
//		}

//		for(int j=10; j<=1; j--) {
//			System.out.println(j+"가 감소합니다");
//		}
		
//		짝수번 컴퓨터를 켜려고 할 때		
//		for (int i = 1; i<=10; i++) {
//			if(i%2 == 0) {
//				System.out.println(i+"번 컴퓨터 켜줘");
//			}
//		}
		
//		홀수번 컴퓨터를 켜려고 할 때 //조건식에서부터 적어둘 수 있음
		for (int i = 1; i<=10; i+=2) {
			if(i%2 == 0) {
				System.out.println(i+"번 컴퓨터 켜줘");
			}
		}
		
	}
}
