package ch13;

// Suspend(), resume() , stop()
// 쓰레드의 실행을 일시정지, 재개, 완전정지 시킨다.
// void suspend() -> 쓰레드를 일시정지 시킨다.
// void resume() -> suspend()에 의해 일시정지된 쓰레드를 실행대기상태로 만든다.
// void stop() -> 쓰레드를 즉시 종료시킨다.

// suspend(), resume(), stop()은 교착상태에 빠지기 쉬워서 deprecated되었다.
// class ThreadEx17_1 implements Runnable {
// boolean suspended = false;
// boolean stopped = false;
// public void run() {
// while(!stopped){
// if(!suspended){
// /*쓰레드가 수행할 코드를 작성 */
// }
// }
// }
// public void suspend() { suspended = true; }
// public void resume() { suspended = false; }
// public void stop() { stopped = true; }

public class Thread9 {
	public static void main(String args[]) {

		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop(); // 쓰레드 th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
		}
	} // main
}

class MyThread implements Runnable {
	volatile boolean stopped = false; // volatile - > 쉽게 바뀌는 변수
	volatile boolean suspended = false;

	Thread th;

	MyThread(String name) {
		th = new Thread(this, name); // Thread(Runaable r , String name)
	}

	void start() {
		th.start();
	}

	void stop() {
		stopped = true;
	}

	void suspend() {
		suspended = true;
	}

	void resume() {
		suspended = false;
	}

	public void run() {
		while (!stopped) {
			if (!suspended) {

				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	} // run()
}
