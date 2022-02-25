package ch12;

import java.util.ArrayList;

// 타입 변수 

	// 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.
		// public class ArrayList<E> extends AbstractList<E>{
		// private transient E[] elementData;
		// public boolean add(E o){/* 내용생략 */}
		// public E get(int index){/* 내용생략 */}
		// ...
		// }



// 타입 변수에 대입하기
	
	// 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정 (대입)
		
		// 타입 변수 E 대신에 실제 타입 Tv를 대입
		// ArrayList<Tv> tvList = new ArrayList<Tv>();
		// public class ArrayList<E> extends AbstractList<E> { // 일부생략
		// private transient Tv[] elementData;
		// public boolean add(Tv o){/* 내용생략 */}
		// public boolean add(Tv o){/* 내용생략 */} // Object가 아닌 Tv를 반환
		// ...
		// }

	// 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능


class Tv{}
class Audio{}

public class Generics2 {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>(); // tv타입의 객체만 저장가능
		list.add(new Tv());
//		list.add(new Audio);
		
//		Tv t = (Tv)list.get(0); //list의 첫번째 요소를 꺼낸다.
		Tv t = list.get(0); //list의 첫번째 요소를 꺼낸다. 형변환 불필요
		
		System.out.println(t);
		
	}

}
