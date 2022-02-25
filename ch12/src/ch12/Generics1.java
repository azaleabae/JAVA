package ch12;

import java.util.ArrayList;

// 지네릭스(Generics)란?

	// 컴파일시 타입을 체크해 주는 기능(compile-time type check) = jdk1.5
	// 객체의 타입 안정성을 노핑고 형변환의 번거로움을 줄여줌

	// Tv객체만 저장할 수 있는 ArrayList를 생성
	
	// ArrayList<Tv> tvlist = new ArrayList<Tv>();

	// tvList.add(new Tv()); // OK
	// tvList.add(new Audio()); // 컴파일 에러. Tv 외에 다른 타입은 저장 불가

	
	// 지네릭스의 장점
		
		// 1. 타입 안정성을 제공한다. (형변환 잘못하면 나오는 예외 Class castException을 막을수 있다.)
		// 2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.
	

public class Generics1 {
	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30); 
		list.add("40"); // 타입 체크가 강화됨. 지네릭스 덕분에 
		// String을 추가하고 싶으면 ArrayList<Object> 라고 해주면 된다. 
		
//		Integer i = (Integer) list.get(2); // 컴파일 OK 
//		Integer i = list.get(2); //  ArrayList에 Integer를 제네릭스로 선언했기 때문에 형변환 생략 가능
		String i = (String)list.get(3); //  ArrayList에 Integer를 제네릭스로 선언했기 때문에 형변환 생략 가능
		
		System.out.println(list);
	}

}
