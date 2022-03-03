package ch13;

// �������� ���� - start()

	//�����带 ������ �Ŀ� start()�� ȣ���ؾ� �����尡 �۾��� �����Ѵ�.
		// Thread1_1 t1 = new Thread1_1(); // ������ t1�� �����Ѵ�.
		// Thread1_2 t2 = new Thread1_2(); // ������ t2�� �����Ѵ�.

		// t1.strat(); // ������ t1�� ���� ��Ų��.
		// t2.strat(); // ������ t2�� ���� ��Ų��.


	// strat()�� run()
		// start() -> ���ο� ȣ�⽺�� ����
		// run() -> start�� ȣ���� ���ο� ���ÿ��� run���� ���� 


// main������
	// main�޼����� �ڵ带 �����ϴ� ������
	// ������� '����� ������'�� '���� ������' �������� �ִ�. -> ���󾲷��� = ���� ������
	// ���� ���� ����� �����尡 �ϳ��� ������ ���α׷��� ����ȴ�.

public class Thread2 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main�����尡 th1�� �۾��� ���� ������ ��ٸ���.
			th2.join();	// main�����尡 th2�� �۾��� ���� ������ ��ٸ���.
		} catch(InterruptedException e) {}

		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis() - Thread2.startTime));
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
