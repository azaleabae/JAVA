package ch07;

public class Ex7_7_1 {
	
// 다형성
	
	// 여러가지 형태를 가질 수 있는 능력
	// 조상 타입 참조 변수로 자손 타입객체를 다루는 것
		
	// Tv t = new Tv(); 처럼 타입 통일 시키는게 아니라
	// Tv t = new SmartTv(); 처럼 조상 타입 참조 변수로 자손 타입 객체를 다룬다.
	
	
	// 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
		
		// SmartTv s = new TV(); 이렇게는 쓸수 없음.
		// Tv t = new SmartTv(); 가능
		

	
}
