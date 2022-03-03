package ch12;

// 애너테이션 타입 정의하기

	// 애너테이션을 직접 만들어 쓸 수 있다.
		// @interface 애너테이션이름{
			// 타입 요소이름(); // 애너테이션의 요소를 선언한다.
			// ...
		// }

	// 애너테이션의 메서드는 추상 메서드이며, 애너테이션을 적용할 때 지정(순서X)
		// @interface Test{
			// int count();
			// String testedBy();
			// String[] testTools();
		// }

	// 애너테이션의 요소
		// 적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정가능(null제외)
		// 요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
		// 요소의 타입이 배열인 경우, 괄호{}를 사용해야 한다.

	// 모든 애너테이션의 조상 - java.lang.annotation
		// Annotation은 모든 애너테이션의 조상이지만 상속은 불가
		// 사실 Annotation은 인터페이스이다.

	// 마커 애너테이션 - Marker Annotation
		//요소가 하나도 정의되지 않는 애너테이션


// 애너테이션 요소의 규칙
	// 애너테이션의 요소를 선언할 때 아래의 규칙을 반드시 지켜야한다.
		// 요소의 타입은 기본형,String,enum,애너테이션,class만 허용됨
		// 괄호()안에 매개변수를 선언할 수 없다.
		// 예외를 선언할 수 없다.
		// 요소를 타입 매개변수로 정의할수 없다.


public class Annotation3 {

}
