package ch07;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || 23 < hour)
			return;
		
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
}

class Ex7_6_2 {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100); // ���� ���ǽĿ� 100�� �����ϸ� 23���� ū���� ������ ���� or���� ��Ģ�� ���� if(true)�� �ȴ�. 
		// �׷��Ƿ� ���ǽ��� ���������� return �Ǿ this.hour = hour; ���� ���� ����
		System.out.println(t.getHour());
	}
	
	

}
