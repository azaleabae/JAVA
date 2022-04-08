package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

// 생성자의 메서드 참조

	// 생성자와 메서드 참조
	
		// 생성자에 매개변수가 없는 경우
		// Supplier<MyClass> s = () -> new Myclass();
		// Supplier<MyClass> s = MyClass::new;

		// 생성자에 매개변수가 있는 경우
		// Function<Integer, MyClass> s = (i) -> new MyClass(i);
		// Function<Integer, MyClass> s = MyClass::new;

		// 생성자에 매개변수가 둘인 경우
		// BiFunction<T,U,R> 쓰면됌
	
	// 배열과 메서드 참조
		
		// Function<Integer, int[]> f = x -> new int[x]; // 람다식
		// Function<Integer, int[]> f2 = int::new; // 메서드 참조
		
public class Lambda8 {

	public static void main(String[] args) {
		// Supplier는 입력x, 출력

//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new;
//		MyClass mc = s.get();
//		System.out.println(mc);
		
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length=" + arr.length);
	}
}

class MyClass {
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
}
