package ch05;

public class EX5_10 {

	public static void main(String[] args) {
		// String 클래스
		// 1. String클래스는 char[]와 메서드(기능)를 결합한 것
		// 	  String클래스 = char[] + 메서드(기능)
		// 2. String 클래스는 내용을 변경할 수 없다.(read only)
		
		String str = "워해머토탈워3";
		char ch = str.charAt(6);
		
		String str2 = str.substring(0,3); // (~부터 , ~까지(근데이건 포함안됨))
		String str3 = str.substring(1); // 1만 쓰면  1부터 끝까지 출력
		String str4 = str.substring(0,str.length()); // 0~4

		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

}
