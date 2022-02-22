package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet - ����x,�ߺ�x 

	// HashSet
		// Set�������̽��� ������ ��ǥ���� �÷��� Ŭ����
		// ������ �����Ϸ���, LinkedHashSetŬ������ ����ϸ� �ȴ�.

	// TreeSet
		// ���� �˻��� ���Ŀ� ������ �÷��� Ŭ���� 
		// HashSet���� ������ �߰�, ������ �ð��� �� �ɸ� 



// HashSet �ֿ� �޼���

	// HashSet()
	// HashSet(Collection c)
	// HashSet(int initialCapacity) // �ʱ�뷮 ���� x2 ���̾�
	// HashSet(int initailCapacity, float loadFactor) // loadFactor -> ����?

	// boolean add(object o)
	// boolean addAll(Collection c) -> ������
	// boolean remove(Object o)
	// boolean removeAll(Collection c) -> ������
	// boolean retainAll(Collection c) - > ���Ǻ� ����(������)
	// void clear() -> ��� ����

	// boolean contains(object o) -> set�� �� ��ü�� �����ϰ� �ִ��� 
	// boolean containsAll(Collection c) -> collection�� ��� ������ü�� ��� ���ԵǾ� �ִ���
	// Iterator iterator() - collection�� ��Ҹ� �о�� ��

	// boolean isEmpty() - �������
	// int size() - ����� ��ü�� ����
	// Object[] toArray() - set�� ����Ǿ� �ִ� ��ü�� ��ü�迭�� ��ȯ
	// Object[] toArray(Object[] a) - set�� ����Ǿ� �ִ� ��ü�� ��ü�迭�� ��ȯ
	 

public class Ex11_7_1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); // �ؽ����̶� �ߺ���Ҵ� �� ���� 1�� �ϳ��� ���ڿ��̰� �ϳ��� Integer��ü�̱� ������ �ΰ� ���
		
		for(int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]); // HashSet�� objArr�� ��ҵ��� �����Ѵ�.
			System.out.println(objArr[i] + "=" + set.add(objArr[i]));
		}
		
		// HashSet�� ����� ��ҵ��� ����Ѵ�.
		System.out.println(set);
		
		// HashSet�� ����� ��ҵ��� ����Ѵ�.(Iterator�̿�)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
