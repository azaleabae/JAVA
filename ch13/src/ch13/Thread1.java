package ch13;

// �������� ������ ����

// ThreadŬ������ ���
// Runnable�������̽��� ����

public class Thread1 {

	public static void main(String[] args) {
		Thread1_1 t1 = new Thread1_1();

		Runnable r = new Thread1_2();
		Thread t2 = new Thread(r); // ������ Thread(Runnable target)

		t1.start();
		t2.start();
	}
}

class Thread1_1 extends Thread { // ThreadŬ������ ����ؼ� �����带 ����
	public void run() { // �����尡 ������ �۾��� �ۼ�
		for (int i = 0; i < 20; i++) {
			System.out.println(getName());
		}
	}
}

class Thread1_2 implements Runnable { // Runnable �������̽��� �����ؼ� �����带 ����
	public void run() { // �����尡 ������ �۾��� �ۼ�
		for (int i = 0; i < 20; i++) {
			// Thread.currentThread() - �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
