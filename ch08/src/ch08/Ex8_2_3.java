package ch08;

public class Ex8_2_3 {

// 예외 발생시키기
	
	// 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
		// Exception e = new Exception("고의로 발생시켰음);
	
	// 2. 키워드 throw를 이용해서 예외를 발생시킨다.
		// throw e; 
	public static void main(String[] args) {

		try {
			Exception e = new Exception("고의로 발생시켰음"); // ()안은 message
			throw e; // 예외를 발생시킴
		// throw new Exception("고의로 발생시켰음.");	  -> 위 두줄을 한줄로 표현한것.
		
		}catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage()); // e.getMessage는 고의로 발생시켰음을 가르킴
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
