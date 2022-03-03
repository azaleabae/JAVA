package ch13;

// 쓰레드의 구현과 실행

// Thread클래스를 상속
// Runnable인터페이스를 구현

public class Thread1 {

	public static void main(String[] args) {
		Thread1_1 t1 = new Thread1_1();

		Runnable r = new Thread1_2();
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)

		t1.start();
		t2.start();
	}
}

class Thread1_1 extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
	public void run() { // 쓰레드가 수행할 작업을 작성
		for (int i = 0; i < 20; i++) {
			System.out.println(getName());
		}
	}
}

class Thread1_2 implements Runnable { // Runnable 인터페이스를 구현해서 쓰레드를 구현
	public void run() { // 쓰레드가 수행할 작업을 작성
		for (int i = 0; i < 20; i++) {
			// Thread.currentThread() - 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
