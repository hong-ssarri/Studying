package day09;

public abstract class For1 {
	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + "�� ��ǻ�� ����");
//		}

//		for(int j=10; j<=1; j--) {
//			System.out.println(j+"�� �����մϴ�");
//		}
		
//		¦���� ��ǻ�͸� �ѷ��� �� ��		
//		for (int i = 1; i<=10; i++) {
//			if(i%2 == 0) {
//				System.out.println(i+"�� ��ǻ�� ����");
//			}
//		}
		
//		Ȧ���� ��ǻ�͸� �ѷ��� �� �� //���ǽĿ������� ����� �� ����
		for (int i = 1; i<=10; i+=2) {
			if(i%2 == 0) {
				System.out.println(i+"�� ��ǻ�� ����");
			}
		}
		
	}
}
