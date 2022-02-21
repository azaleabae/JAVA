package ch11;

// Collection 인터페이스의 메서드

	// 가볍게 추가 검색 삭제정도가 있다는 것만 알아둘 것


// List인터페이스 - 순서 o ,중복 o 

	// 추가 - 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을 추가한다.
		// void add(Int index, Object element)
		// boolean addAll(Int index, Collection c)

	// 검색 - 지정된 객체의 위치(index)를 반환한다.
		// int indexOf(Object o) - List의 첫번째 요소부터 순방향으로
		// int lastIndexOf(Object o) - List의 마지막 요소부터 역방향으로

	// 삭제 - List의 객체에 접근할 수 있는 Listlterator를 반환한다.
		// Object remove(int index) 

	// 읽기 - 지정된 위치(index)에있는 객체를 반환한다.
		// Object get(int index)

	// 변경 - 지정된 위치에 객체(element)를 저장한다.
		// Object set(int index, Object element)


public class Ex11_1_3 {

	public static void main(String[] args) {

	}

}
