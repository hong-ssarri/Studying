package day07;

public class SwitchEx {
	public static void main(String[] args) {
		//일년동안 읽은 책수에 따라 멘트를 출력
		int book = 2;
		book = book / 10;
		
		switch(book) {
		//switch(book/10){ 과 같이 식이 들어갈 수도있음`
			case 0:
				System.out.println("조금 더 노력하세요");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기시는 분이네요");
				break;
			case 2:
				System.out.println("책을 사랑하는 분이시네요");
				break;
			default:
				System.out.println("당신은 다독왕입니다");
		}
	}

}
