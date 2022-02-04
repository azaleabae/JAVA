package ch06;

public class Ex6_8_2 {
	// 멤버변수의 초기화
}

//1. 명시적 초기화( = )

//class Car{
//	int door = 4; // 기본형(primitive type) 변수의 초기화
//	Engine e = new Engine(); // 참조형(reference type) 변수의 초기화
//}

// 2. 초기화 블럭
	// 인스턴스 초기화 블럭: {}
	// 클래스 초기화 블럭: static {}

	
// 3. 생성자
	// 자동 초기화
	// 간단 초기화
	// 복잡 초기화  - 생성자는 여기 포함됨
	// cv 초기화 - static {}
	// iv 초기화 - 생성자

//	Car(String color, String gear, int door){ // 매개변수있는 생성자
//		this.color = color;
//		this.gear = gear;
//		this.door = door;
//	}