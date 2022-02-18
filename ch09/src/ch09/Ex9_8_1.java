package ch09;

// StringBuilder 
	
	// StringBuilder는 동기화되어 있지 않다.
	// StringBuffer는 동기화되어 있다. 멀티 쓰레드에 안전(thread-safe)
		// 싱글 쓰레드 : 한번에 하나 작업
		// 멀티 쓰레드 : 한번에 여러개 작업

	// 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하
	// 이럴 땐 StringBuffer대신 STringBuilder를 사용하면 성능 향상
		

		//멀티 쓰레드
			// StringBuffer sb;
			// sb = new StringBuffer();
			// sb.append("abc"); 
		// 싱글 쓰레드
			// StringBuilder sb;
			// sb = new StringBuilder();
			// sb.append("abc");

//


public class Ex9_8_1 {

}
