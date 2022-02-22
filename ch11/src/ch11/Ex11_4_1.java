package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// Iterator, ListIterator, Enumeration

	// 컬렉션에 저장된 데이터를 접근(읽어오기)하는데 사용되는 인터페이스
	// Enumeration은 Iterator의 구버전
	// ListIterator는 Iterator의 접근성을 향상시킨 것(단방향 -> 양방향)

		// Iterator 메서드
			// boolean hasNext() - 읽어 올 요소가 남아있는지 확인한다. 있으면 true 없으면 false를 반환한다.
		
			// Object next() - 다음요소를 읽어온다. next()를 호출하기 전에 hasNext()를 호출해서 
			// 읽어 올 요소가 있는지 확인하는 것이 안전


		// Enumeration
			//boolean hasMoreElements() - 읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.
			//Iterator의 hasNext()와 같다.
		
			// Object NextElements() - 다음요소를 읽어온다. nextElement()를 호출하기 전에 hasMoreElements()를 호출해서 읽어올 
			// 요소가 남아있는지 확인하는것이 안전. Iterator의 next()와 같다.


	// 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것


public class Ex11_4_1 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		Collection c = new TreeSet(); // set은 collection의 자손 Collection으로 써주면 더 유연한 코드가 된다. 
//		Collection 하위의 인터페이스들 끼리 코드의 겈토없이 사용할수 있기 때문에

//		Collection c = new HashSet(); // set은 collection의 자손
		
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) { // 데이터의 마지막번째에 다음에는 데이터가 없기때문에 false가 뜸
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		// iterator는 1회용이라 다쓰고 나면 다시 얻어와야 한다. 이렇게 다시 얻어 오지 않으면 아래 while문은 출력되지 않음
//		it = list.iterator(); // 새로운 iterator객체를 얻는다.
//		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		for(int i = 0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}

	}

}
