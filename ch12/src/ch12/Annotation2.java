package ch12;

// 표준 애노테이션
	// @Override
		// 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
		// 오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.
		// 오버라이딩할 때는 메서드 선언부 앞에 @Override를 붙이자.

	// @Deprecated
		// 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
		// @Deprecated의 사용 예, Date클래스의 getDate()
		// @Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 나타나는 메시지
			// AnnotationEx.java:21: warning: [deprecation] oldField in NewClass has been drprecated
			// nc.oldField = 10;

	// @Functionalinterface(함수형 인터페이스)
		// 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
		// 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음

	// @SuppressWarnings
		// 컴파일러의 경고메시지가 나타나지 않게 억제한다.
		// 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정
		// 둘 이상의 경고를 동시에 억제하려면 다음과 같이 한다.
		// '-Xlint'옵션으로 컴파일하면, 경고메시지를 확인할 수 있다.
		// 괄호[]안이 경고의 종류. 아래의 경우 rawtypes
			// AnnotationTest.java:15:warning: [rawtypes] found raw type: List


// 메타 애너테이션
	// 메타 애니테이션은 '애너테이션을 위한 애너테이션'
	// 메타 애너테이션은 java.lang.annotation패키지에 포함

	// @Taget
		// 애너테이션을 정의할 때, 적용대상 지정에 사용
	
	// @Retention
		// 애너테이션이 유지(retention)되는 기간을 지정하는데 사용
		// 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다
		// 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME이다.

	// @Documented, @Inherited
		// javadoc으로 작성한 문서에 포함시키려면 @Documented를 붙인다.
		// 애너테이션을 자손 클래스에 상속하고자 할 때, @Inherited를 붙인다.

	// @Repeatable 
		// 반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
		// @Repeatable 이 붙은 애너테이션은 반복해서 붙일 수 있다.
		// @Repeatable인 @ToDo를 하나로 묶을 컨테이너 애너테이션도 정의해야 함

	


class Annotation2 {
	
}
