package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//컬렉션 프레임웍과 함수형 인터페이스

	// 함수형 인터페이스를 사용하는 컬렉션 프레임웍의 메서드(와일드 카드 생략)

	// 인터페이스			메서드											설명
	// Collection		boolean removeIf(Predicate<E> filter)			조건에 맞는 요소를 삭제
	// List				void replaceAll(UnaryOperator<E> operator)		모든 요소를 변환하여 대체
	// Iterable			void forEach(Consumer<T> action)				모든 요소에 작업 action을 수행
	// Map				V compute(K key, BiFunction(K.V.V)f)			지정된 키의 값에 작업 f를 수행
	// Map				V computeIfAbsent(K key. Function(K.V)f)		키가 없으면. 작업 f 수행 후 추가
	// Map				V computeIfPresent(K key. BiFunction<K.V.V>f)	지정된 키가 있을 때. 작업 f 수행
	// Map				V merge(K key. V value. BiFunction)(V.V.V)f)	모든 요소에 병합작업 f를 수행
	// Map				void forEach(BiConsumer<K.v> action)			지정된 키의 값에 작업 f를 수행
	// Map				void replaceAll(BiFunction<K.V.V>f)				모든 요소에 치환작업 f를 수행
	

public class Lambda6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		//list의 모든 요소를 출력
		list.forEach(i -> System.out.print(i +","));
		System.out.println();
		
		//list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x-> x%2==0 || x%3==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10); // list의 각 요소에 10을 곱한다.
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를{k,v}의 형식으로 출력한다.
		map.forEach((k,v)-> System.out.print("{" + k + "," + v + "},"));
		System.out.println();
	}
}
