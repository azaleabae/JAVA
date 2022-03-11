package ch14;

// java.util.function패키지(1/3)

	//자주 사용되는 다양한 함수형 인터페이스를 제공

	//	함수형 인터페이스		 		메서드				설명
	// java.lang.Runnable	void run()			매개변수도 없고, 반환값도 없음.
	// Supplier<T>			T get() 			매개변수는 없고, 반환값만 있음.
	// Consumer<T>			void accept(T t)	Supplier와 반대로 매개변수만 있고, 반환값이 없음
	// Function<T, R>		R apply(T t)		일반적인 함수, 하나의 매개변수를 받아서 결과를 반환
	// Predicate<T>			boolean test(T t)	조건식을 표현하는데 사용됨, 매개변수는 하나, 반환 타입은 boolean


public class Lambda4 {

}
