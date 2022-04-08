package ch14;

import java.util.function.Function;

// 메서드 참조(method reference)

	// 하나의 메서드만 호출하는 람다식은 '메서드 참조'로 간단히 할 수 있다.

	// 	종류						람다									메서드 참조
	// static메서드 참조			(x) -> ClassName.method(x)			ClassName::method
	// 인스턴스메서드 참조 			(obj,x) -> obj.method(x)			ClassName::method
	// 특정 객체 인스턴스메서드 참조		(x)	-> obj.method(x)				obj::method
	
	// static메서드 참조
	
	// Integer method(String s) { // 그저 Interger.parseInt(String s)만 호출
		// return Integer.parseInt(s);
	// }

	// Function<String, Integer> f = Integer::parseInt; // 메서드 참조
	


public class Lambda7 {
	public static void main(String[] args) {
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//		System.out.println(f.apply("100")+200); // 숫자로 바뀜
		
		// 메서드 참조로 바꿔 보기
		Function<String,Integer> f = Integer::parseInt;
		System.out.println(f.apply("100")+200); // 숫자로 바뀜
	
	}
}
