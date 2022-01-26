package ch02;

public class Varex3 {

	public static void main(String[] args) {
		final int score = 100;
		boolean power = true;
		
		byte b = 127; // -128 ~127
		
		int oct = 010; //8진수, 10진수로 8	
		int hex =  0x10; // 16진수, 10진수로 16
		long l = 10_000_000_000L; 
		
		float f = 3.14f;
		double d = 3.14;
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		System.out.println("---------------------------------------------------------------");
		
		char ch = 'A';
		int i = 'A';
		
		String str = ""; // 문자 없어도 상간없음
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(str4);
		}
}
