package ch07;

public class Ex7_8_1 {

// instanceof 연산자
	
	// 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true로 반환
	// 형변환 전에 반드시 instanceof로 확인해야 함
	
	// 형변환을 하는 이유는 인스턴스의 원래 기능을 모두 사용하려고 하기 때문인데 
	// 전 코드에서 쓴거같이 부모 클래스인 car는 water기능을 사용할 수 없기 때문에 
	// 아래의 코드에서 c라는 리모콘을 FireEngine 타입으로 바꿔준다. 
	
	void doWork(Car c) {
		if(c instanceof FireEngine) {  // 형변환이 가능한지 확인
			
			FireEngine fe = (FireEngine)c;  // 형변환
			fe.water();
			
			System.out.println(fe instanceof Object); //true
			System.out.println(fe instanceof Car);// true
			System.out.println(fe instanceof FireEngine);// ture
			
			
		}
		
	}
	
}
