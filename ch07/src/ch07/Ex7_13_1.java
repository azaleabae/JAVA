package ch07;

//인터페이스

	// 추상메서드 집합
	// 구현된 것이 전혀 없는 설계도. 껍데기(모든멤버가 public)
	// 추상클래스는 일반 클래스인데 추상 메서드를 가지고 있는 것
	// 인터페이스는 완전히 아무것도 없이 추상 메서드만을 가지고 있는 것

	
	// interface 인터페이스이름{
	// public static final 타입 상수이름 = 값;
	// public abstract 메서드이름(매개변수목록);
	// }
	
	// 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
	// 다중 상속이 가능.(추상메서드는 충돋ㄹ해도 문제 없음)
	
//인터페이스의 구현
	
	// 인터페이스에 정의된 추상 메서드를 완성하는 것
	
	// class 클래스이름 implements 인터페이스 이름{
		// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
	//}

	//class Woodelf implements Archer {
	//	public void move(int x, int y) {}
	//	public void attack(rangeA) {}
	//}




