package ch14;

// 스트림 만들기 - 컬렉션

	// Collection 인터페이스의 stream()으로 컬렉션을 스트림으로 변환
		// Stream<E> stream() // Collection 인터페이스의 메서드

	// List<Integer> list = Arrays.asList(1,2,3,4,5);
	// Stream<Integer> intStream = list.Stream(); // list를 스트림으로 변환

	// 스트림의 모든 요소를 출력
	// intStream.forEach(System.out::print) // 12345
	// intStream.forEach(System.out::print) // 에러. 스트림이 이미 닫혔다.

public class Stream2 {

}
