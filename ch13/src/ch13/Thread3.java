package ch13;

// 싱글쓰레드와 멀티쓰레드

public class Thread3 {
		// 싱글쓰레드 작업이 겹치지 않고 순차적으로 실행된다.
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간1:" + (System.currentTimeMillis() - startTime));
		
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
	}
}
