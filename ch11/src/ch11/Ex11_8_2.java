package ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// TreeSet - 주요 생성자와 메서드

	// TreeSet() - 기본 생성자
	
	// TreeSet(collection c) - 주어진 컬렉션을 저장하는 TreeSet을 생성
	
	// TreeSet(Comparator comp) - 주어진 정렬 기준으로 정렬하는 TreeSet을 생성
	
	// Object first() - 정렬된 순서에서 첫 번째 객체를 반환한다.
	
	// Object last() - 정렬된 순서에서 마지막 객체를 반환한다.
	
	// Object ceiling(Object o) - 지정된 객체와 같은 객체를 반환, 없으면 큰 값을 가진 객체중 제일 가까운 값의 객체를 반환, 없으면 null
	
	// Object floor(Object o) - 지정된 객체와 같은 객체를 반환, 없으면 작은 값을 가진 객체중 제일 가까운 값의 객체를 반환, 없으면 null
	
	// Object higher(Object o) - 지정된 객체보다 큰 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null
	
	// Object lower(Object o) - 지정된 객체보다 작은 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null
	
	// SortedSet subSet(Object fromElement, Object toElement) - 범위 검색(fromElement와 toElement사이)의 
	// 													결과를 반환한다.(끝 범위인 toElement는 범위에 포함되지 않음)

	// SortedSet headSet(Object toElement) - 지정된 객체보다 작은 값의 객체들을 반환한다.
	
	// SortedSet tailSet(Object fromElement) - 지정된 객체보다 큰 값의 객체들을 반환한다.
	
public class Ex11_8_2 {
	public static void main(String[] args) {
		Set set = new TreeSet(); // TreeSet 정렬까지 알아서 됨 HashSet은 정렬 따로 해줘야함 sort로 
		
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
//			set.add(new Test()); 
//			set.add(new Test()); 
//			set.add(new Test()); 
//			set.add(new Test()); 
		}
		
		System.out.println(set);
	}
}
//class Test implements Comparable{
//
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return -1;
//	}}
//
//class TestComp implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return -1; // 같은 객체로 중복되어 값이 하나가 나오는걸 막아주는데 이게 왜?
//	}
//	
//}