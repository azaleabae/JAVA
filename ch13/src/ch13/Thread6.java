package ch13;

// ������ �׷�
	// ���� ���õ� �����带 �׷����� ��� �ٷ�� ���� ��
	// ��� ������� �ݵ�� �ϳ��� ������ �׷쿡 ���ԵǾ� �־�� �Ѵ�.
	// ������ �׷��� �������� �ʰ� ������ ������� 'main������ �׷�'�� ���Ѵ�.
	// �ڽ��� ������ ������(�θ� ������)�줿 �׷�� �켱������ ��ӹ޴´�.


// ���� ������(daemon thread)
	// �Ϲ� ������(non-daemon thread)�� �۾��� ���� �������� ������ ����
	// �Ϲ� �����尡 ��� ����Ǹ� �ڵ������� ����ȴ�.
	// �������÷���, �ڵ�����, ȭ�� �ڵ����ŵ ���ȴ�.
	// ���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϴٰ� Ư�������� �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ��Ѵ�.
		// boolean isDaemon() - �����尡 ���� ���������� Ȯ���Ѵ�. ���� �������̸� true�� ��ȯ
		// void setDaemon(boolean on) - �����带 ���� ������� �Ǵ� ����� ������� ���� �Ű����� on�� 
		// true�� �����ϸ� ���� �����尡 �ȴ�.
	// setDaemon(boolean on)�� �ݵ�� start()�� ȣ���ϱ� ���� ����Ǿ�� �Ѵ�.
	// �׷��� ������ illegalThreadStateException�� �߻��Ѵ�.

class Thread6 implements Runnable  {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Thread6()); // Thread(Runnable r)
		t.setDaemon(true);		// �� �κ��� ������ ������� �ʴ´�.
		t.start();

		for(int i=1; i <= 10; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);

			if(i==5) autoSave = true;
		}

		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		while(true) { // ���� ���� ������ ������ ��� �޼��尡 ����Ǹ� �ڵ����� �ȴ�.
			try { 
				Thread.sleep(3 * 1000); // 3�ʸ���
			} catch(InterruptedException e) {}

			// autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�.
			if(autoSave) autoSave();
		}
	}

	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}
}