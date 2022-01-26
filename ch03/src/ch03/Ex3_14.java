package ch03;

public class Ex3_14 {

	public static void main(String[] args) {

		//문자열 비교에는 == 대신 equals()를 사용해야 한다.
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}

}
