package ch13;

// wait()과 notify()

	// 동기화의 효율을 높이기 위해 wait(), notify()를 사용
	// Object클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있다.
		// wait() - 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다.
		// notify() waiting pool에서 대기중인 쓰레드 중의 하나를 깨운다.
		// notifyAll() - waiting pool에서 대기중인 모든 쓰레드를 깨운다.

// wait()과 notify() 예제
	// 요리사는 table에 음식을 추가. 손님은 table의 음식을 소비
	// 요리사와 손님이 같은 객체(table)을 공유하므로 동기화가 필요

public class Thread13 {

}
