package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet - 순서x,중복x 

	// HashSet
		// Set인터페이스를 구현한 대표적인 컬렉션 클래스
		// 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.

	// TreeSet
		// 범위 검색과 정렬에 유리한 컬렉션 클래스 
		// HashSet보다 데이터 추가, 삭제에 시간이 더 걸림 



// HashSet 주요 메서드

	// HashSet()
	// HashSet(Collection c)
	// HashSet(int initialCapacity) // 초기용량 보통 x2 많이씀
	// HashSet(int initailCapacity, float loadFactor) // loadFactor -> 언제?

	// boolean add(object o)
	// boolean addAll(Collection c) -> 합집합
	// boolean remove(Object o)
	// boolean removeAll(Collection c) -> 교집합
	// boolean retainAll(Collection c) - > 조건부 삭제(차집합)
	// void clear() -> 모두 삭제

	// boolean contains(object o) -> set이 이 객체를 포함하고 있는지 
	// boolean containsAll(Collection c) -> collection에 담긴 여러객체가 모두 포함되어 있는지
	// Iterator iterator() - collection의 요소를 읽어올 때

	// boolean isEmpty() - 비었는지
	// int size() - 저장된 객체의 갯수
	// Object[] toArray() - set에 저장되어 있는 객체를 객체배열로 반환
	// Object[] toArray(Object[] a) - set에 저장되어 있는 객체를 객체배열로 반환
	 

public class Ex11_7_1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); // 해쉬셋이라 중복요소는 다 빠짐 1은 하나는 문자열이고 하나는 Integer객체이기 때문에 두개 출력
		
		for(int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
			System.out.println(objArr[i] + "=" + set.add(objArr[i]));
		}
		
		// HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);
		
		// HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
