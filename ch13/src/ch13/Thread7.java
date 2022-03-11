package ch13;

// �������� ����

 	// NEW �����尡 �����ǰ� ���� start()�� ȣ����� ���� ����
	// RUNNABLE ���� �� �Ǵ� ���� ������ ����
	// BLOCKED ����ȭ���� ���ؼ� �Ͻ������� ����(lock�� Ǯ�� ������ ��ٸ��� ����)
	// WAITING, TIMED_WAITINF �������� �۾��� ��������� �ʾ����� ���డ������ ���� �Ͻ���������. 
	//							TIMED_WAITING�� �Ͻ������ð��� ������ ��츦 �ǹ�
	// TERMINATED ���ʵ��� �۾��� ����� ����
	
// �������� �������� 

	// �������� ������ ������ �� �ִ� �޼��尡 �����ȴ�.
	// �̵��� Ȱ���ؼ� ���� ȿ������ ���α׷��� �ۼ��� �� �ִ�.
	

// sleep() -> static method�� -> �ڱ��ڽ����׸� ����

	// ���� �����带 ������ �ð� ���� ���߰� �Ѵ�.
		// static void sleep(long millis) õ���� ����
		// static void sleep(long millis, int nanos) õ���� ���� + ������ 
	// ����ó���� �ؾ��Ѵ�.(interruptedException�� �߻��ϸ� ���)
	// Ư�� �����带 �����ؼ� ���߰� �ϴ� ���� �Ұ����ϴ�.

class Thread7 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); 
		th2.start();

//		try {
//			Thread.sleep(2000);	// th1�� 2�ʵ��� ���ڰ�? th1.�� ���°� �ƴ϶� Thread�� ���� �� ���⼭��(main)
//		} catch(InterruptedException e) {} // �߻��ϸ� ��� ������ �ִ°� �ƴ϶� ������ �Ǽ� ����ó�� ���ذ� 
		
		delay(2*1000);
		System.out.print("<<main ����>>");
	} // main
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);	// th1�� 2�ʵ��� ���ڰ�? th1.�� ���°� �ƴ϶� Thread�� ���� �� ���⼭��(main)
		} catch(InterruptedException e) {} // �߻��ϸ� ���. ������ �ִ°� �ƴ϶� ������ �Ǽ� ����ó�� ���ذ� 
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 ����>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 ����>>");
	} // run()
}