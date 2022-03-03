package ch12;

// 지네릭 메서드 - 와일드 카드 안될 때 자주 씀
	// 지네릭 타입이 선언된 메서드(타입 변수는 메서드 내에서만 유효)
		//static<T> void sort(List<T> list, Comparator<? super T> c)

	// 클래스의 타입 매개변수<T>와 메서드의 타입 매개변수 <T>는 별개

		// class FruitBox<T>{ 지네릭 클래스
				// ...
			// static <T> void sort(List<T> list, comparator<? super T> c) {
				// ...
			// }
		// }

	// 메서드를 호출할 때마다 타입을 대입해야(대부분 생략 가능)
	// 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가
		
public class GenecricMethod {

}
