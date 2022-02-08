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
		t.setHour(100); // 위의 조건식에 100을 대입하면 23보다 큰수가 됨으로 식을 or식의 규칙에 따라 if(true)가 된다. 
		// 그러므로 조건식을 빠져나오고 return 되어서 this.hour = hour; 까지 가지 않음
		System.out.println(t.getHour());
	}
	
	

}
