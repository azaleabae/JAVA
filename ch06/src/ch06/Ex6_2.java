package ch06;

class Ex6_2 extends Tv{

	public static void main(String[] args) {
		
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		
		System.out.println("t1 channel: " + t1.channel);
		System.out.println("t2 channel: " + t2.channel);
		
		t1.channel = 7;
		t2 = t1; // ������ t2�� ���̻� �ڽ��� �ν��Ͻ��� ����Ű�� �ʰ� t1�� �ν��Ͻ��� ����Ŵ
		
		System.out.println("�� ������ t1.channel ����: " +t1.channel);
		System.out.println("�� ������ t2.channel ���� t1.channl�� ���� : " +t2.channel);
		
	
		
	}
}
