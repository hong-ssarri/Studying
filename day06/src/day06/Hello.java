package day06;

public class Hello {
	public static void main(String[] args) {
		String s = "Hello";
		int i = 3;
		float f= 3.14f;
		double d = 3.14;
		char c = 'a';
		
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer);
		//int가 객체타입이 아니라서 Integer.valueOf로 써야함
		//앞글자가 대문자가 아니면 Class가 아님
		System.out.println(Float.valueOf(f) instanceof Float);
		System.out.println(Double.valueOf(d) instanceof Double);
		System.out.println(Character.valueOf(c) instanceof Character);
	}

}
