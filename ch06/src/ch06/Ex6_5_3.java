package ch06;

class Ex6_5_3 {
	
	// 인스턴스 메서드
	// 인스턴스 생성 후,'참조변수.메서드이름()'으로 호출
	// 인스턴스 멤버(iv,im)와 관련된 작업 하는 메서드
	// 메서드 내에서 인스턴스 변수(iv) 사용가능
	
	
	// static 메서드(클래스메서드)
	// 객체 생성없이 '클래스이름.메서드이름()'으로 호출    ex) math.random() 
	// 인스턴스 멤버(iv, im(instance method))와 관련없는 작업을 하는 메서드
	// 메서드 내에서 인스턴스 변수(iv) 사용 불가
	
	
	long a, b;
	
	long add() { // 인스턴스 메서드
		return a + b;
	}
	
	static long add(long a, long b) {  // 클래스 메서드(static 메서드)
		return a+b;
	}
	
	//  static은 언제 사용하는가
	// 변수중 공통적인 속성들에게 사용
	// iv(인스턴스 변수),im(인스턴스 메서드)을 사용하지 않는 것들에게 사용
	

}
