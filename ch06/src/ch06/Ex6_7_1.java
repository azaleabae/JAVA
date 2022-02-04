package ch06;

public class Ex6_7_1 {

	public static void main(String[] args) {
		// 생성자
		
		// 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
		// 인스턴스 생성시 수행할 작업(iv 초기화)에 사용
		
		
		
//		Time t = new Time();
//		t.hour = 12;
//		t.minute = 34;
//		t.second = 56;
		
//		Time t = new Time(12, 34, 56);
		
		}
	
	// constructor = iv 초기화 메서드 
	// 생성자의 이름은 클래스 이름과 같아야 한다.
	// 모든 클래스는 반드시 생성자를 가져야 한다.
	// Card c = new Card();     ->  여기서 Card(); 가 생성자
	
class Card {
	Card(){ // 매개변수 없는 생성자.
		// 인스턴스 초기화 작업
	}
	
	Card(String kind, int number){ // 매개변수 있는 생성자
		// 인스턴스 초기화 작업
	}
	
}

}
