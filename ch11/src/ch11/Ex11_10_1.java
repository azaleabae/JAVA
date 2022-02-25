package ch11;

import java.util.*;


// Collections - �÷����� ���� �޼���(static)�� ����

	// �÷��� ä���, ����, ����, �˻� - fill(), copy(), sort(), binarySearch() ��
	
	// �÷����� ����ȭ - synchromizedXXX()

		// List syncList = collections.synchronizedList(new ArrayList(.....))
		
		// static Collection synchronizedCollection(Collection c)
		// staitc List synchronizedList(List list)
		// static Set synchronizedSet(Set s)
		// static Map synchronizedMap(map m)
		// static SortedSet synchronizedSortedSet(sortedSet s)
		// static SortedMap synchronizedSortedMap(sortedMap m)

	// ����Ұ�(readOnly) �÷��� ����� - unmodifiableXXX()

		// static Collection unmodifiableCollection(Collection c)
		// static List		 unmodifiableList(List list)
		// static set 		 unmodifiableMap(Map m)
		// static NavigableSet	unmodifiableNavigableSet(SortedSet s)
		// static SortedSet undifiableNavigableMap(NavigableMap m)
		// static navigableMap unmodifiableNavigableMap(NavigableMap m)
		// static SortedMap  unmodifiableSortedMap(SortedMap m)

	// �̱��� �÷��� ����� - SingletonXXX()

		// static List singleton List(Object o)
		// static set singleton(Object o)
		// static Map singletonMap(Object key, Object value)

	// �� ������ ��ü�� �����ϴ� �÷��� ����� - checkedXXX()

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
//		rotate(list, 2);  //  �ݽð� �������� �ι� ȸ��
//		System.out.println(list);
//
//		swap(list, 0, 2); // ù��°�� ����°�� ��ȯ(swap)
//		System.out.println(list);
//
//		shuffle(list);    // ����� ����� ��ġ�� ���Ƿ� ����
//		System.out.println(list);
//
//		sort(list, reverseOrder()); // ���� ���� reverse(list);
//		System.out.println(list);
//		
//		sort(list);       // ����
//		System.out.println(list);
// 
//		int idx = binarySearch(list, 3);  // 3�� ����� ��ġ(index)�� �˻�
//		System.out.println("index of 3 = " + idx);
//		
//		System.out.println("max="+max(list));
//		System.out.println("min="+min(list));
//		System.out.println("min="+max(list, reverseOrder()));
//
//		fill(list, 9); // list�� 9�� ä���
//		System.out.println("list="+list);
//
//		// list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ����Ұ�
//		List newList = nCopies(list.size(), 2); 
//		System.out.println("newList="+newList);
//
//		System.out.println(disjoint(list, newList)); // �����Ұ� ����
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
