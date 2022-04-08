package ch14;

// 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것(데이터의 연속적인 흐름)

	// List<Integer> list = ArrayList.asList(1,2,3,4,5);
	// Stream<Integer> intStream = list.stream(); // 컬렉션.
	// Stream<String> strStream = strStream.of(new String[]{"a","b","c"}); // 배열
	// Stream<Integer> evenStream = Stream.iterate(0, n->n+2); // 0,2,4,6, ...
	// Stream<Double> randomStream = Stream.generate(Math::random); // 람다식
	// IntStream	intStream = new Random().ints(5); // 난수 스트림(크기가 5)


// 스트림(Stream)

// 스트림의 특징 1/3
	// 스트림이 제공하는 기능 - 중간 연산과 최종 연산
		// 중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
		// 최종 연산 - 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)
		// Stream.distince().limit(5).sorted().forEach(System.out::println)
		//			중간연산	 중간연산	   중간연산	forEach부터 최종 연산


	// 스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않는다.(read only)
		// List<Integer> list = Arrays.asList(3,1,5,4,2);
		// List<Integer> sortedList = list.stream().sorted() 				// list를 정렬해서
		//								  .collect(Collectors.toList());	// 새로운 list에 저장
		// System.out.println(list);						 // [3, 1, 5, 4, 2]
		// System.out.println(sortedList);					 // [1, 2, 3, 4, 5]
		
	// 스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야 함) -> 최종연산하면 스트림이 닫힘
		// strStream.forEach(System.out::println); // 모든 요소를 화면에 출력(최종연산)
		// int numOfstr = strStream.count();	   // 에러. 스트림이 이미 닫혔음.

	// 최종 연산 전까지 중간연산이 수행되지 않는다. - 지연된 연산
		// IntStream intStream = new Random().ints(1, 46);	// 1~45범위의 무한 스트림
		// intStream.distinct().limit(6).sorted()			// 중간 연산
		// 			.forEach(i->System.out.print(i+","))	// 최종 연산



// 스트림의 특징 2/3

	// 스트림은 작업을 내부 반복으로 처리한다.
		// for(String str : strList)) -> stream.forEach(System.out::println);
		// 	System.out.println(str);


		// void forEach(Consumer<? super T) action){
		// 		Objects.requredNonNull(action); // 매개변수 널 체크
			
		// 		for(T t : src)	// 내부 반복(for문을 메서드 안으로 넣음)
		// 			action.accept(T);
		// }


// 스트림(Stream)의 특징(3/3)

	// 스트림의 작업을 병렬로 처리 - 병렬스트림
		// Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		// int sum = strStream.parallel() // 병렬 스트림으로 전환(속성만 변경)
		//					  .mapToInt(s -> s.length()).sum(); // 모든 문자열의 길이의 합)
	
	// 기본형 스트림 - IntStream, LongStream, DoubleStream(작업하는데 성능 개선이 필요할 때)
		// 오토박싱&언박싱의 비효율이 제거됨(Stream<Integer>대신 intStream사용)
		// 숫자와 관련된 유용한 메서드를 Stream<T>보다 더 많이 제공

	
public class Stream1 {

}
