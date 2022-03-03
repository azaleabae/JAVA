package ch13;

// 프로세스와 쓰레드 

	// 프로세스: 실행 중인 프로그램, 자원(resources)과 쓰레드로 구성
	// 쓰레드: 프로세스 내에서 실제 작업을 수행. 모든 프로세스는 최소한 하나의 쓰레드를 가지고 있다.
		// 프로세스 : 쓰레드 = 공장 : 일꾼

	// 하나의 새로운 프로세스를 생성하는 것보다, 하나의 새로운 쓰레드를 생성하는 것이 더 적은 비용이 든다.

	// 멀티쓰레드의 장단점
		// 대부분의 프로그램이 멀티쓰레드로 작성되어 있다.
		// 그러나, 멀티쓰레드 프로그래밍이 장점만 있는 것은 아니다.
		
		// 장점
			// 시스템 자원을 보다 효율적으로 사용할 수 있다.
			// 사용자에 대한 응답성이 향상된다.
			// 작업이 분리되어 코드가 간결해 진다.

		// 단점
			// 동기화에 주의해야 한다.
			// 교착상태가 발생하지 않도록 주의해야 한다.
			// 각 쓰레드가 효율적으로 고르게 실행될 수 있게 해야한다.
public class ProcessThread {

}
