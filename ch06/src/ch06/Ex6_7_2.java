package ch06;

	// 기본 생성자
	// 모든 객체에는 생성자가 하나이상 존재해야 한다.
	// 기존에 쓰던 객체에 생성자를 입력하지 않은 것은 컴파일러가 자동으로 추가 해줬기 때문.
	// 생성자가 하나도 없을때만, 컴파일러가 기본 생성자 자동 추가
		
	//		Classname(){} -> 기본생성자
	//		Point(){} ->  Point 클래스의 기본 생성자

class Data_1 {
	int value;
}

class Data_2{
	int value;
	
	Data_2(int x){ // 매개 변수가 있는 생성자 
		value = x;
	}				// Data_2는 생성자를 하나 만들어 줬기 때문에 자동으로 생성되지 않음 
	
	Data_2(){} // 기본 생성자 - 오류해결을 위해 만들어둠 Data_1은 생성자가 전무하기 때문에 컴파일러가 스스로 생성한다.

}
class Ex6_7_2 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // class Data_2에 기본 생성자를 생성해주지 않으면 오류가 난다.
		
	}
	
}