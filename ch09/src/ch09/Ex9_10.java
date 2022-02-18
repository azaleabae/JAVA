package ch09;

//문자열을 숫자로 변환하기

	// 문자열을 숫자로 반환하는 다양한 방법

		// int i = new Integer("100").intValue();  // floatValue().longValue(),...
		// int i2 = Integer.parseInt("100"); // 주로 이 방법을 많이 사용.
		// int i3 = Integer.valueOf("100");
public class Ex9_10 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt("100");
		
		System.out.println("i=" +i);
		System.out.println("i=" + Integer.parseInt("100"));
		System.out.println("i=" + Integer.parseInt("100",10)); // 위와 동일
		System.out.println("i=" + Integer.parseInt("100",2)); // 2진수
		System.out.println("i=" + Integer.parseInt("FF",16)); // 2진수
		
	}
}
