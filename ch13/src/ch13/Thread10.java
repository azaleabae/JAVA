package ch13;

// join() 
	// 지정된  시간동안 특정 쓰레드가 작업하는 것을 기다린다.
		// void join() 						// 작업이 모두 끝날 때까지
		// void join(long millis)			// 천분의 일초 동안
		// void join(long millis,int nanos) // 천분의 일초 + 나노초 동안
	
	// 예외처리를 해야한다.(interruptedException이 발생하면 작업 재개) 
		// public static void main(String args[]){
		// ThreadEx19_1 th1 = new ThreadEx19_1();
		// ThreadEx19_2 th2 = new ThreadEx19_2();
		// th1.start();
		// th2.start();
		// startTime = system.currentTimeMillis();
		
		// try{
			 // th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			 // th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
		// } catch(interrupedExcetion e){}
		// System.out.print("소요시간:" + (currentTimeMillis() - ThreadEx19.startTime));

//public class Thread10 {
//
//	
//}
//
//public void run() {
//	while(true) {
//		try {
//			Thread.sleep(10*1000); // 10초를 기다린다.
//		} catch(InterruptedException e) {
//			System.out.println("Awaken by interrupt().");
//		}
//	gc(); // garbage collection을 수행한다. -> 사용하지 않는 객체 제거
//	System.out.prinln("Garbage collected. Free Memory :"+freememory());
//	}
//}
//
//for(int i=0; i<20; i++) {
//	requiredMemory = (int)(Math.random() * 10) * 20;
//	//필요한 메모리가 사용할 수 있는 양보다 적거나 전체 메모리의 60%이상 사용했을 경우 gc를 깨운다.
//	if(fc.freeMemory() < requireMemory || fc.freeMemory() < gc.totalMemory() * 0.4) // 메모리가 무족한 경우 
// {
//		gc.interrupt(); // 잠자고 있는 쓰레드 gc를 깨운다.

//		try{
//			gc.join(100);
//		} catch(InterruptedException e){}
//
//	gc.usedMemory += requireMemory;
//	System.out.println("usedMemory:" + gc.usedMemory);
//	}
//}
