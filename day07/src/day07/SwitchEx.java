package day07;

public class SwitchEx {
	public static void main(String[] args) {
		//�ϳ⵿�� ���� å���� ���� ��Ʈ�� ���
		int book = 2;
		book = book / 10;
		
		switch(book) {
		//switch(book/10){ �� ���� ���� �� ��������`
			case 0:
				System.out.println("���� �� ����ϼ���");
				break;
			case 1:
				System.out.println("å �д� ���� ���ô� ���̳׿�");
				break;
			case 2:
				System.out.println("å�� ����ϴ� ���̽ó׿�");
				break;
			default:
				System.out.println("����� �ٵ����Դϴ�");
		}
	}

}
