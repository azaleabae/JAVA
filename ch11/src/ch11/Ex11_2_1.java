package ch11;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList

	// ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일 
	// ArrayList와 달리 Vector는 자체적으로 동기화처리가 되어 있다.

	// List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
	// 데이터의 저장공간으로 배열을 사용한다.(배열기반)

// ArrayList의 메서드

	// 생성자
		// ArrayList()
		// ArrayList(collection c)
		// ArrayList(int initialCapacity)

	// 추가(저장)
		// boolean add(Object o)
		// void add(int dindex, Object element)
		// boolean addAll(Collection c)
		// boolean addAll(int index, Collection c)

	// 삭제
		// boolean remove(Object o)
		// Object remove(int index)
		// boolean removeAll(Collection c)
		// void clear()  - 모든 객체 삭제

	// 검색
		// int indexOf(Object o) - 못찾으면 -1 반환
		// int lastIndexOf(Object o)
		// boolean contains(Object o)
		// Object get(int index)
		// Object set(int index, Object element)
		// List subList(int fromIndex, int toIndex)
		// Object[] toArray() - ArrayList의 객체배열을 반환
		// Object[] toArray(Object[] a)
		// boolean isEmpty() - 비어있는지
		// void trimToSize() - 빈공간 제거
		// int size() - 저장된 객체의 갯수
		

public class Ex11_2_1 {
	public static void main(String[] args) {
		
		// 기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		
		// ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(5));
		
//		ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1의 일부분을 뽑아서 새로운 arraylist를 만든다.
		print(list1, list2);
		
		Collections.sort(list1); // list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collection.sort(List 1)
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // 포함되어있는지 확인 (list1이 list2의 모든 요소를 포함하고 있는지)
		System.out.println("");
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1"); // 배열의 0 번째 위치에 문자열 1을 집어넣는다 기존의 값들을 한칸씩 뒤로 밀려난다.
		System.out.println("index=" + list1.indexOf("1")); // 문자열 1의 위치는 어디인가
		System.out.println("index=" + list1.indexOf(1)); // 숫자 1의 위치는 어디인가
		
		list1.remove(0); //배열 위치 기준으로 삭제 
		list1.remove(new Integer(1)); // 속성기준으로 삭제(숫자)
		print(list1, list2);
		
		
		// list1 과 list2가 겹치는 부분을 제외한 나머지를 삭제
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}

}
