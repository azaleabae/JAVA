package ch13;

import javax.swing.JOptionPane;

//interrupt()
// ������(Waiting)�� �����带 ������ ����(Runnable)�� �����.
// void interrupt() 			-> �������� interrupted���¸� false���� true�� ����.
// boolean isInterrupted()  	-> �������� interrupted ���¸� ��ȯ.
// static boolean interrupted() -> ���� �������� interrupted���¸� �˷��ְ�, false�� �ʱ�ȭ
class Thread8 {
	public static void main(String[] args) throws Exception {
		ThreadEx99_1 th1 = new ThreadEx99_1();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�.");
		th1.interrupt(); // interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterruted():" + th1.isInterrupted()); // true
		
		// interrupted - > static �޼���
	}
}

class ThreadEx99_1 extends Thread {
	public void run() {

		int i = 10;

		while (i!= 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++);// �ð�����

		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
