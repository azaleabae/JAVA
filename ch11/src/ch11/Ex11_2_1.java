package ch11;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList

	// ArrayList�� ������ Vector�� ������ ������ ���������� ��������� ���� 
	// ArrayList�� �޸� Vector�� ��ü������ ����ȭó���� �Ǿ� �ִ�.

	// List�������̽��� �����ϹǷ�, ��������� �����ǰ� �ߺ��� ����Ѵ�.
	// �������� ����������� �迭�� ����Ѵ�.(�迭���)

// ArrayList�� �޼���

	// ������
		// ArrayList()
		// ArrayList(collection c)
		// ArrayList(int initialCapacity)

	// �߰�(����)
		// boolean add(Object o)
		// void add(int dindex, Object element)
		// boolean addAll(Collection c)
		// boolean addAll(int index, Collection c)

	// ����
		// boolean remove(Object o)
		// Object remove(int index)
		// boolean removeAll(Collection c)
		// void clear()  - ��� ��ü ����

	// �˻�
		// int indexOf(Object o) - ��ã���� -1 ��ȯ
		// int lastIndexOf(Object o)
		// boolean contains(Object o)
		// Object get(int index)
		// Object set(int index, Object element)
		// List subList(int fromIndex, int toIndex)
		// Object[] toArray() - ArrayList�� ��ü�迭�� ��ȯ
		// Object[] toArray(Object[] a)
		// boolean isEmpty() - ����ִ���
		// void trimToSize() - ����� ����
		// int size() - ����� ��ü�� ����
		

public class Ex11_2_1 {
	public static void main(String[] args) {
		
		// �⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		
		// ArrayList���� ��ü�� ���尡��
		// autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(5));
		
//		ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1�� �Ϻκ��� �̾Ƽ� ���ο� arraylist�� �����.
		print(list1, list2);
		
		Collections.sort(list1); // list1�� list2�� �����Ѵ�.
		Collections.sort(list2);	// Collection.sort(List 1)
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // ���ԵǾ��ִ��� Ȯ�� (list1�� list2�� ��� ��Ҹ� �����ϰ� �ִ���)
		System.out.println("");
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1"); // �迭�� 0 ��° ��ġ�� ���ڿ� 1�� ����ִ´� ������ ������ ��ĭ�� �ڷ� �з�����.
		System.out.println("index=" + list1.indexOf("1")); // ���ڿ� 1�� ��ġ�� ����ΰ�
		System.out.println("index=" + list1.indexOf(1)); // ���� 1�� ��ġ�� ����ΰ�
		
		list1.remove(0); //�迭 ��ġ �������� ���� 
		list1.remove(new Integer(1)); // �Ӽ��������� ����(����)
		print(list1, list2);
		
		
		// list1 �� list2�� ��ġ�� �κ��� ������ �������� ����
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
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
