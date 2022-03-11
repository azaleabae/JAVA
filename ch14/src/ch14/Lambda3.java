package ch14;

// 함수형 인터페이스 타입의 매개변수

public class Lambda3 {

	void aMethod(MyFunction f) {
//		f.myMethod(); // MyFunction에 정의된 메서드 호출 
//		aMethod(() -> System.out.println("myMethod()"));
	}
	
}

//@FunctionalInterface
//interface MyFunction {
//	void myMethod();
//}


// 함수형 인터페이스 타입의 반환타입

// MyFunction myMethod() {
//	 MyFunction f = () -> {};
//	 return f;
// }  줄여쓰면


// MyFunction myMethod(){
// 		return () -> {};
// }