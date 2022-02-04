package ch06;

class Ex6_7_4{
	// 참조변수 this 
	// 생성자 this와는 아예 다르니까 떼어놓고 생각할 것
	
	// 인스턴스 자신을 가리키는 참조변수
	// 인스턴스 메서드(생성자 포함)에서 사용가능
	// 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용

}

class Car1{
	
	String color;
	String gear;
	int door;
	
//	Car1(String c, String g, int d){
//		
//
//		color는 iv(인스턴스 변수), c는 lv(지역변수)
//		color = c;
//		gear = g;
//		door = d;
//
//	}
	
	Car1(String color, String gear, int door){
		//this.color는 iv, color는 lv
		this.color = color;
		this.gear = gear;
		this.door = door;
		// iv와 lv를 구별하기 위해서 this사용
	}

}