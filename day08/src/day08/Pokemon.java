package day08;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("���ϸ�");
		System.out.println("1. ��ī��");
		System.out.println("2. ���α�");
		System.out.println("3. �̻��ؾ�");
		
		int mypokemon = random.nextInt(3)+1; //0~2
		
		System.out.println("���õ� ��ȣ:" + mypokemon);
		switch(mypokemon) {
		case 1:
			System.out.println("��ī��");
			break;
		case 2:
			System.out.println("���α�");
			break;
		case 3:
			System.out.println("�̻��ؾ�");
			break;
		}
	}

}
