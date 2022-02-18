package ch09;

// String 클래스

	// String클래스 = 데이터(cha[]) + 메서드(문자열 관련)
	// 문자배열을 가지고 있음
	// 내용을 변경할 수 없는 불변(immutable)클래스

	// 덧셈 연산자 (+)를 이용한 문자열 결합은 성능이 떨어짐.
	// 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용
	// StringBuffer는 내용변경이 가능

// 문자열 비교

	// String str = "abs";와 STring str = new String("abc"); 의 비교
	// String str1 = "abc"; -> 문자열 리터럴 "abc"의 주소가 str1에 저장됨
	// String str2 = "abc"; -> 문자열 리터럴 "abc"의 주소가 str2에 저장됨
	// String str3 = new String("abc"); -> 새로운 String인스턴스를 생성
	// String str4 = new String("abc"); -> 새로운 String인스턴스를 생성 


// 문자열 리터럴

	// 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)


// 빈 문자열("", empty string)
	
	//내용이 없는 열  ,크기가 0인 char형 배열을 저장하는 문자열
	// 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
		
		//char[] chArr = new char[]; // 길이가 0인 배열
		// int[] iArr = {};


//문자와 문자열(String)의 초기화
	
	// String str1 = "";
	// String str2 = "";
	

public class Ex9_5_1 {

}
