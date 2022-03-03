package ch13;

// 싱글쓰레드와 멀티쓰레드

public class Thread4 {
		// 멀티 쓰레드 동시에 실행됨 
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
