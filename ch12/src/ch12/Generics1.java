package ch12;

import java.util.ArrayList;

// ���׸���(Generics)��?

	// �����Ͻ� Ÿ���� üũ�� �ִ� ���(compile-time type check) = jdk1.5
	// ��ü�� Ÿ�� �������� ���ΰ� ����ȯ�� ���ŷο��� �ٿ���

	// Tv��ü�� ������ �� �ִ� ArrayList�� ����
	
	// ArrayList<Tv> tvlist = new ArrayList<Tv>();

	// tvList.add(new Tv()); // OK
	// tvList.add(new Audio()); // ������ ����. Tv �ܿ� �ٸ� Ÿ���� ���� �Ұ�

	
	// ���׸����� ����
		
		// 1. Ÿ�� �������� �����Ѵ�. (����ȯ �߸��ϸ� ������ ���� Class castException�� ������ �ִ�.)
		// 2. Ÿ��üũ�� ����ȯ�� ������ �� �����Ƿ� �ڵ尡 ������ ����.
	

public class Generics1 {
	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30); 
		list.add("40"); // Ÿ�� üũ�� ��ȭ��. ���׸��� ���п� 
		// String�� �߰��ϰ� ������ ArrayList<Object> ��� ���ָ� �ȴ�. 
		
//		Integer i = (Integer) list.get(2); // ������ OK 
//		Integer i = list.get(2); //  ArrayList�� Integer�� ���׸����� �����߱� ������ ����ȯ ���� ����
		String i = (String)list.get(3); //  ArrayList�� Integer�� ���׸����� �����߱� ������ ����ȯ ���� ����
		
		System.out.println(list);
	}

}
