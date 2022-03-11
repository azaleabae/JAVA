package ch13;

// Suspend(), resume() , stop()
// �������� ������ �Ͻ�����, �簳, �������� ��Ų��.
// void suspend() -> �����带 �Ͻ����� ��Ų��.
// void resume() -> suspend()�� ���� �Ͻ������� �����带 ��������·� �����.
// void stop() -> �����带 ��� �����Ų��.

// suspend(), resume(), stop()�� �������¿� ������ ������ deprecated�Ǿ���.
// class ThreadEx17_1 implements Runnable {
// boolean suspended = false;
// boolean stopped = false;
// public void run() {
// while(!stopped){
// if(!suspended){
// /*�����尡 ������ �ڵ带 �ۼ� */
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
			th1.suspend(); // ������ th1�� ��� �ߴܽ�Ų��.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // ������ th1�� �ٽ� �����ϵ��� �Ѵ�.
			Thread.sleep(3000);
			th1.stop(); // ������ th1�� ���������Ų��.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
		}
	} // main
}

class MyThread implements Runnable {
	volatile boolean stopped = false; // volatile - > ���� �ٲ�� ����
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
