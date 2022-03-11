package ch14;

// 람다식 작성하기
	


// 람다식은 익명 함수? 익명 객체!
	// 람다식은 익명함수가 아니라 익명 클래스의 익명 객체 이다. -? 이해안되면 7장내용 다시 복습
	

	// 람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수의 타입은?



	

public class Lambda2 {
	public static void main(String args[]) {
		
	
// 메서드의 이름과 반환타입을 제거하고 '->'를 블록{} 앞에 추가한다.
//		int max(int a, int b) {
//			return a > b ? a : b;
//		} 이코드를 아래처럼 바꿀 수 있다.
	

//		(int a, int b) -> {
//			return a > b ? a : b;
//		}
		
		


// 반환 값이 있는 경우, 식이나 값만 적고 return문 생략가능(끝에 ';' 안붙임)
//		(int a, int b) -> {
//			return a>b ? a:b
//		}
		

//		(int a, int b) -> a > b ? a : b
		


// 매개변수의 타입이 추론 가능하면 생략가능(대부분의 경우 생략가능)
//		(int a, int b) -> a>b ? a:b

		
//		(a,b) -> a>b ? a:b		
		

// {}안의 문장이 하나이면 {} 생략가능 
// 매개변수가 하나일 때는 () 생략가능 x -> x*x		
	}
}
	
