package ch07;


// 참조변수의 형변환
	
	// 사용할 수 있는 멤버의 갯수를 조절하는 것
	// 값 자체가 바뀌는게 아님
	// 조상 자손 관계의 참조변수는 서로 형변환 가능
	// 부모 자식간에는 가능하지만 형제관계에서는 불가능

		class Car {}
		class FireEngine extends Car{}
		class Ambulance extends Car{}
	
		class CarTest1{
		FireEngine f = new FireEngine();
		
		Car c = (Car)f; // 조상인 Car타입으로 형변환(생략가능)
		FireEngine f2 = (FireEngine)c; // 자손인 FireEngine타입으로 형변환(생략불가)
		//Ambulance a = (Ambulance)f; // 에러. 상속관계가 아닌 클래스 간의 형변환 불가 (형제)
		}
		

