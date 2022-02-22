package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// Iterator, ListIterator, Enumeration

	// �÷��ǿ� ����� �����͸� ����(�о����)�ϴµ� ���Ǵ� �������̽�
	// Enumeration�� Iterator�� ������
	// ListIterator�� Iterator�� ���ټ��� ����Ų ��(�ܹ��� -> �����)

		// Iterator �޼���
			// boolean hasNext() - �о� �� ��Ұ� �����ִ��� Ȯ���Ѵ�. ������ true ������ false�� ��ȯ�Ѵ�.
		
			// Object next() - ������Ҹ� �о�´�. next()�� ȣ���ϱ� ���� hasNext()�� ȣ���ؼ� 
			// �о� �� ��Ұ� �ִ��� Ȯ���ϴ� ���� ����


		// Enumeration
			//boolean hasMoreElements() - �о� �� ��Ұ� �����ִ��� Ȯ���Ѵ�. ������ true, ������ false�� ��ȯ�Ѵ�.
			//Iterator�� hasNext()�� ����.
		
			// Object NextElements() - ������Ҹ� �о�´�. nextElement()�� ȣ���ϱ� ���� hasMoreElements()�� ȣ���ؼ� �о�� 
			// ��Ұ� �����ִ��� Ȯ���ϴ°��� ����. Iterator�� next()�� ����.


	// �÷��ǿ� ����� ��ҵ��� �о���� ����� ǥ��ȭ�� ��


public class Ex11_4_1 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		Collection c = new TreeSet(); // set�� collection�� �ڼ� Collection���� ���ָ� �� ������ �ڵ尡 �ȴ�. 
//		Collection ������ �������̽��� ���� �ڵ��� ������� ����Ҽ� �ֱ� ������

//		Collection c = new HashSet(); // set�� collection�� �ڼ�
		
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) { // �������� ��������°�� �������� �����Ͱ� ���⶧���� false�� ��
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		// iterator�� 1ȸ���̶� �پ��� ���� �ٽ� ���;� �Ѵ�. �̷��� �ٽ� ��� ���� ������ �Ʒ� while���� ��µ��� ����
//		it = list.iterator(); // ���ο� iterator��ü�� ��´�.
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
