package ch06;

public class Ex6_1_3 {
	
	public static void main(String[] args) {
		// 객체의 생성과 사용
		// 1. 객체의 생성
		// 클래스명 변수명;
		// 변수명 = new 클래스명(); 
		
		class Tv{
			String color;
			boolean power;
			int channel;
			
			void power() {power = !power;}
			void channelUp() {channel++;}
			void channelDown() {channel--;}
		
		}
		Tv t; // Tv 클래스 타입의 참조변수 t 를 선언
	
		t = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
		
		t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		
		t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
		
		System.out.println("현재채널은 " + t.channel + "입니다."); 
		//6이 나오는데 왜 6이냐면 위에 선언한 channel은 7인데 내가 channeldown메서드로 채널을 하나 내렸기 때문에 6이 나옴 
		
	}
}
