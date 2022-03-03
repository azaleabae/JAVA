package ch13;

// 쓰레드의 실행 - start()

	//쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다.
		// Thread1_1 t1 = new Thread1_1(); // 쓰레드 t1을 생성한다.
		// Thread1_2 t2 = new Thread1_2(); // 쓰레드 t2을 생성한다.

		// t1.strat(); // 쓰레드 t1을 실행 시킨다.
		// t2.strat(); // 쓰레드 t2을 실행 시킨다.


	// strat()와 run()
		// start() -> 새로운 호출스택 생성
		// run() -> start가 호출한 새로운 스택에서 run으로 실핼 


// main쓰레드
	// main메서드의 코드를 수행하는 쓰레드
	// 쓰레드는 '사용자 쓰레드'와 '데몬 쓰레드' 두종류가 있다. -> 데몬쓰레드 = 보조 쓰레드
	// 실행 중인 사용자 쓰레드가 하나도 없을때 프로그램은 종료된다.

public class Thread2 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}

		System.out.print("소요시간:" + (System.currentTimeMillis() - Thread2.startTime));
	} // main

}

class ThreadEx11_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	} // run()
}

class ThreadEx11_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}
