package ch12;

import java.util.ArrayList;

// Ÿ�� ���� 

	// Ŭ������ �ۼ��� ��, ObjectŸ�� ��� Ÿ�� ����(E)�� �����ؼ� ���.
		// public class ArrayList<E> extends AbstractList<E>{
		// private transient E[] elementData;
		// public boolean add(E o){/* ������� */}
		// public E get(int index){/* ������� */}
		// ...
		// }



// Ÿ�� ������ �����ϱ�
	
	// ��ü�� ������, Ÿ�� ����(E) ��� ���� Ÿ��(Tv)�� ���� (����)
		
		// Ÿ�� ���� E ��ſ� ���� Ÿ�� Tv�� ����
		// ArrayList<Tv> tvList = new ArrayList<Tv>();
		// public class ArrayList<E> extends AbstractList<E> { // �Ϻλ���
		// private transient Tv[] elementData;
		// public boolean add(Tv o){/* ������� */}
		// public boolean add(Tv o){/* ������� */} // Object�� �ƴ� Tv�� ��ȯ
		// ...
		// }

	// Ÿ�� ���� ��� ���� Ÿ���� �����Ǹ�, ����ȯ ��������


class Tv{}
class Audio{}

public class Generics2 {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>(); // tvŸ���� ��ü�� ���尡��
		list.add(new Tv());
//		list.add(new Audio);
		
//		Tv t = (Tv)list.get(0); //list�� ù��° ��Ҹ� ������.
		Tv t = list.get(0); //list�� ù��° ��Ҹ� ������. ����ȯ ���ʿ�
		
		System.out.println(t);
		
	}

}
