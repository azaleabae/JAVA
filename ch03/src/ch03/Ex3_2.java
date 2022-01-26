package ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a++ + 2;
		// a가 b에 대입되고 + 2를 하기 때문에 a는 그대로 2
		
		int c = 2;
		int d = ++c + 2;
		// c에 1을 더하고 다시 2를 더한뒤에 d 에 대입
		
		
		
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
		
		
	}

}