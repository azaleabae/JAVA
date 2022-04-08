package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


// java.util.function패키지(1/3)

	//자주 사용되는 다양한 함수형 인터페이스를 제공

	//	함수형 인터페이스		 		메서드				설명
	// java.lang.Runnable	void run()			매개변수도 없고, 반환값도 없음.
	// Supplier<T>			T get() 			매개변수는 없고, 반환값만 있음.(공급자)
	// Consumer<T>			void accept(T t)	Supplier와 반대로 매개변수만 있고, 반환값이 없음
	// Function<T, R>		R apply(T t)		일반적인 함수, 하나의 매개변수를 받아서 결과를 반환
	// Predicate<T>			boolean test(T t)	조건식을 표현하는데 사용됨, 매개변수는 하나, 반환 타입은 boolean



//  java.util.function패키지(2/3)

	// 매개변수가 2개인 함수형 인터페이스

	// 함수형 인터페이스		 		메서드					설명
	// (T.U는 입력 R은 출력)

	// BiConsumer<T.U>		void accept(T t, U u) 	두개의 매개변수만 있고, 반환값이 없음
	// BiPredicate<T.U>		boolean test(T t, U u) 	조건식을 표현하는데 사용됨
	// BiFunctior<T.U.R>	R apply(T t, U u) 		두개의 매개변수를 받아서 하나의 결과를 반환




//java.util.function패키지(3/3)

	// 매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스

	// 함수형 인터페이스		 		메서드					설명
	// UnaryOperator<T>		T apply(T t)			Function의 자손, Function과 달리 매개변수와 결과의 타입이 같다.
	// BinaryOperator<T>	T apply(T t, T t)		BiFunction의 자손, BiFunction과 달리 매개변수와 결과의 타입이 같다.



public class Lambda4 {

	public static void main(String[] args) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1; // 1~100난수
		Consumer<Integer> c = i -> System.out.print(i+ ", ");
		Predicate<Integer> p = i -> i%2==0; // 짝수인지 검사
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다.
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s,list);	// list를 랜덤한 수로 채운다.
		System.out.println(list);
		printEvenNum(p, c, list); // 짝수를 출력
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	private static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
//	Consumer<Integer> c = i -> System.out.print(I + ",");
//	predicate<Integer> p = i -> i%2==; // 짝수인지 검사
	

	static <T> void
	printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))// 짝수인지 검사
				c.accept(i); // i -> System.out.print(i + ", "); 화면에 i출력
		}
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());
		}
	}
}
