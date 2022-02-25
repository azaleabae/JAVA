package ch12;

import java.util.ArrayList;

// 지네릭스 용어

	// Box<T> 지네릭 클래스. "T의 Box'또는 'T Box'라고 읽는다.
	// T 타입 변수 또는 타입 매개변수.(T는 타입 문자)
	// Box 원시타입 (raw type) 일반 클래스 -> 지네릭클래스 

	// 원시타입
		// class Box<T>{}

	// 대입된 타입(매개변수화된 타입, parameterized type)
		// Box<String> b = new Box<String>();


// 지네릭 타입과 다형성

	// 참조변수와 생성자의 대입된 타입은 일치해야 한다.
		// class product{ } 
		// class Tv extends Product{ }
		// class Audio extends Product{ }
		// ArrayList<Tv>	list = new ArrayList<tv>(); // 일치
		// ArrayList<product>	list = new ArrayList<tv>(); // 자손과 조상관계여도 타입이 불일치하면 에러 

	// 지네릭 클래스간의 다형성은 성립.(여전히 대입된 타입은 일치해야 함)
		// List<Tv> list = new ArrayList<Tv>(); // 다형성. ArrayList가 List를 구현
		// List<Tv> list = new LinkedList<Tv>(); // 다형성 LinkedList가 List를 구현

	// 매개변수의 다형성도 성립
		// ArrayList<product()>; list = newArrayList<Product>();
		// list.add(new Product());
		// list.add(new Tv());	// OK.
		// list.add(new Audio()); // OK.

class Product{}		
class Tv2 extends Product{}
class Audio2 extends Product{}


public class Generics3 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv2>      tvList = new ArrayList<Tv2>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러.
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성

		productList.add(new Tv2());
		productList.add(new Audio2());

		tvList.add(new Tv2());
		tvList.add(new Tv2());

		printAll(productList);
		// printAll(tvList); // 컴파일 에러가 발생한다.
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}

