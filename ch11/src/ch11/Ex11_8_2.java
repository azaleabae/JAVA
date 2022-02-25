package ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// TreeSet - �ֿ� �����ڿ� �޼���

	// TreeSet() - �⺻ ������
	
	// TreeSet(collection c) - �־��� �÷����� �����ϴ� TreeSet�� ����
	
	// TreeSet(Comparator comp) - �־��� ���� �������� �����ϴ� TreeSet�� ����
	
	// Object first() - ���ĵ� �������� ù ��° ��ü�� ��ȯ�Ѵ�.
	
	// Object last() - ���ĵ� �������� ������ ��ü�� ��ȯ�Ѵ�.
	
	// Object ceiling(Object o) - ������ ��ü�� ���� ��ü�� ��ȯ, ������ ū ���� ���� ��ü�� ���� ����� ���� ��ü�� ��ȯ, ������ null
	
	// Object floor(Object o) - ������ ��ü�� ���� ��ü�� ��ȯ, ������ ���� ���� ���� ��ü�� ���� ����� ���� ��ü�� ��ȯ, ������ null
	
	// Object higher(Object o) - ������ ��ü���� ū ���� ���� ��ü �� ���� ����� ���� ��ü�� ��ȯ. ������ null
	
	// Object lower(Object o) - ������ ��ü���� ���� ���� ���� ��ü �� ���� ����� ���� ��ü�� ��ȯ. ������ null
	
	// SortedSet subSet(Object fromElement, Object toElement) - ���� �˻�(fromElement�� toElement����)�� 
	// 													����� ��ȯ�Ѵ�.(�� ������ toElement�� ������ ���Ե��� ����)

	// SortedSet headSet(Object toElement) - ������ ��ü���� ���� ���� ��ü���� ��ȯ�Ѵ�.
	
	// SortedSet tailSet(Object fromElement) - ������ ��ü���� ū ���� ��ü���� ��ȯ�Ѵ�.
	
public class Ex11_8_2 {
	public static void main(String[] args) {
		Set set = new TreeSet(); // TreeSet ���ı��� �˾Ƽ� �� HashSet�� ���� ���� ������� sort�� 
		
		
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
//		return -1; // ���� ��ü�� �ߺ��Ǿ� ���� �ϳ��� �����°� �����ִµ� �̰� ��?
//	}
//	
//}