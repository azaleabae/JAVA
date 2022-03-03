package ch13;

// 쓰레드의 상태

 	// NEW 쓰레드가 새성되고 아직 start()가 호출되지 않은 상태
	// RUNNABLE 실행 중 또는 실행 가능한 상태
	// BLOCKED 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
	// WAITING, TIMED_WAITINF 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은 일시정지상태. 
	//							TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
	// TERMINATED 쓰례드의 작업이 종료된 상태
	
// 쓰레드의 실행제어 

	// 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.
	// 이들을 활용해서 보다 효율적인 프로그램을 작성할 수 있다.
	

// sleep() -> static method임 -> 자기자신한테만 동작

	// 현재 쓰레드를 지정된 시간 동안 멈추게 한다.
		// static void sleep(long millis) 천분의 일초
		// static void sleep(long millis, int nanos) 천분의 일초 + 나노초 
	// 예외처리를 해야한다.(interruptedException이 발생하면 깨어남)
	// 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다.

class Thread7 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); th2.start();

		try {
			th1.sleep(2000);	// th1을 2초동안 잠자게?
		} catch(InterruptedException e) {}

		System.out.print("<<main 종료>>");
	} // main
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	} // run()
}