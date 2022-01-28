package ch06;

class Ex6_2 extends Tv{

	public static void main(String[] args) {
		
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		
		System.out.println("t1 channel: " + t1.channel);
		System.out.println("t2 channel: " + t2.channel);
		
		t1.channel = 7;
		t2 = t1; // 리모콘 t2가 더이상 자신의 인스턴스를 가르키지 않고 t1의 인스턴스를 가르킴
		
		System.out.println("값 변경후 t1.channel 값은: " +t1.channel);
		System.out.println("값 변경후 t2.channel 값은 t1.channl과 동일 : " +t2.channel);
		
	
		
	}
}
