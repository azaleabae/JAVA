package ch13;

// �̱۾������ ��Ƽ������

public class Thread4 {
		// ��Ƽ ������ ���ÿ� ����� 
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();
	}
}

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
	}//run()
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
	}//run()
}
