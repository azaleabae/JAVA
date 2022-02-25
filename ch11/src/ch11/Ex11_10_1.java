package ch11;

import java.util.*;


// Collections - 컬렉션을 위한 메서드(static)을 제공

	// 컬렉션 채우기, 복사, 정렬, 검색 - fill(), copy(), sort(), binarySearch() 등
	
	// 컬렉션의 동기화 - synchromizedXXX()

		// List syncList = collections.synchronizedList(new ArrayList(.....))
		
		// static Collection synchronizedCollection(Collection c)
		// staitc List synchronizedList(List list)
		// static Set synchronizedSet(Set s)
		// static Map synchronizedMap(map m)
		// static SortedSet synchronizedSortedSet(sortedSet s)
		// static SortedMap synchronizedSortedMap(sortedMap m)

	// 변경불가(readOnly) 컬렉션 만들기 - unmodifiableXXX()

		// static Collection unmodifiableCollection(Collection c)
		// static List		 unmodifiableList(List list)
		// static set 		 unmodifiableMap(Map m)
		// static NavigableSet	unmodifiableNavigableSet(SortedSet s)
		// static SortedSet undifiableNavigableMap(NavigableMap m)
		// static navigableMap unmodifiableNavigableMap(NavigableMap m)
		// static SortedMap  unmodifiableSortedMap(SortedMap m)

	// 싱글톤 컬렉션 만들기 - SingletonXXX()

		// static List singleton List(Object o)
		// static set singleton(Object o)
		// static Map singletonMap(Object key, Object value)

	// 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()

		// static Collection checkedCollection(collection c, class type)
		// static List 		 checkedList(List list, class type)
		// static Set		 checkedSet(set s, class type)
		// static Map  		 checkedMap(Map m, Class keytype, Class valueType)
		// static Queue		 checkedQueue(Que queue, Class type)
		// static NavigableSet checkedNavigableSet(NavigableSet s,Class type)
		// static SortedSet  checkedSortedSet(SortedSet s, class type)
		// static NavigableMap checkedNavigableMap(NavigableMap m, Class keytype, Class valueType)
		// static SortedMap	 checkedSortedMap(SortedMap m, Class keyType, Class valueType)



public class Ex11_10_1 {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		System.out.println(list);
//
//		addAll(list, 1,2,3,4,5); 
//		System.out.println(list);
//		
//		rotate(list, 2);  //  반시계 방향으로 두번 회전
//		System.out.println(list);
//
//		swap(list, 0, 2); // 첫번째와 세번째를 교환(swap)
//		System.out.println(list);
//
//		shuffle(list);    // 저장된 요소의 위치를 임의로 변경
//		System.out.println(list);
//
//		sort(list, reverseOrder()); // 역순 정렬 reverse(list);
//		System.out.println(list);
//		
//		sort(list);       // 정렬
//		System.out.println(list);
// 
//		int idx = binarySearch(list, 3);  // 3이 저장된 위치(index)를 검색
//		System.out.println("index of 3 = " + idx);
//		
//		System.out.println("max="+max(list));
//		System.out.println("min="+min(list));
//		System.out.println("min="+max(list, reverseOrder()));
//
//		fill(list, 9); // list를 9로 채운다
//		System.out.println("list="+list);
//
//		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
//		List newList = nCopies(list.size(), 2); 
//		System.out.println("newList="+newList);
//
//		System.out.println(disjoint(list, newList)); // 공통요소가 없으
//
//		copy(list, newList); 
//		System.out.println("newList="+newList);
//		System.out.println("list="+list);
//
//		replaceAll(list, 2, 1); 
//		System.out.println("list="+list);
//
//		Enumeration e = enumeration(list);
//		ArrayList list2 = list(e); 
//
//		System.out.println("list2="+list2);
	}

}
