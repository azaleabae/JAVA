package ch13;

import javax.swing.JOptionPane;

//interrupt()
// 대기상태(Waiting)인 쓰레드를 실행대기 상태(Runnable)로 만든다.
// void interrupt() 			-> 쓰레드의 interrupted상태를 false에서 true로 변경.
// boolean isInterrupted()  	-> 쓰레드의 interrupted 상태를 변환.
// static boolean interrupted() -> 현재 쓰레드의 interrupted상태를 알려주고, false로 초기화
class Thread8 {
	public static void main(String[] args) throws Exception {
		ThreadEx99_1 th1 = new ThreadEx99_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + "입니다.");
		th1.interrupt(); // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterruted():" + th1.isInterrupted()); // true
		
		// interrupted - > static 메서드
	}
}

class ThreadEx99_1 extends Thread {
	public void run() {

		int i = 10;

		while (i!= 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++);// 시간지연

		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
