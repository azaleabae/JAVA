package ch13;

// join() 
	// ������  �ð����� Ư�� �����尡 �۾��ϴ� ���� ��ٸ���.
		// void join() 						// �۾��� ��� ���� ������
		// void join(long millis)			// õ���� ���� ����
		// void join(long millis,int nanos) // õ���� ���� + ������ ����
	
	// ����ó���� �ؾ��Ѵ�.(interruptedException�� �߻��ϸ� �۾� �簳) 
		// public static void main(String args[]){
		// ThreadEx19_1 th1 = new ThreadEx19_1();
		// ThreadEx19_2 th2 = new ThreadEx19_2();
		// th1.start();
		// th2.start();
		// startTime = system.currentTimeMillis();
		
		// try{
			 // th1.join(); // main�����尡 th1�� �۾��� ���� ������ ��ٸ���.
			 // th1.join(); // main�����尡 th1�� �۾��� ���� ������ ��ٸ���.
		// } catch(interrupedExcetion e){}
		// System.out.print("�ҿ�ð�:" + (currentTimeMillis() - ThreadEx19.startTime));

//public class Thread10 {
//
//	
//}
//
//public void run() {
//	while(true) {
//		try {
//			Thread.sleep(10*1000); // 10�ʸ� ��ٸ���.
//		} catch(InterruptedException e) {
//			System.out.println("Awaken by interrupt().");
//		}
//	gc(); // garbage collection�� �����Ѵ�. -> ������� �ʴ� ��ü ����
//	System.out.prinln("Garbage collected. Free Memory :"+freememory());
//	}
//}
//
//for(int i=0; i<20; i++) {
//	requiredMemory = (int)(Math.random() * 10) * 20;
//	//�ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ���ų� ��ü �޸��� 60%�̻� ������� ��� gc�� �����.
//	if(fc.freeMemory() < requireMemory || fc.freeMemory() < gc.totalMemory() * 0.4) // �޸𸮰� ������ ��� 
// {
//		gc.interrupt(); // ���ڰ� �ִ� ������ gc�� �����.

//		try{
//			gc.join(100);
//		} catch(InterruptedException e){}
//
//	gc.usedMemory += requireMemory;
//	System.out.println("usedMemory:" + gc.usedMemory);
//	}
//}
