package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_7_4 {

	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet(); // ������
		HashSet setKyo = new HashSet(); // ������ - ��ġ�� �κ�
		HashSet setCha = new HashSet(); // ������
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
//		// ������
//		Iterator it = setB.iterator();
//		while(it.hasNext()) {
//			Object tmp = it.next();
//			if(setA.contains(tmp)) // �����ϰ� �ִ��� Ȯ���ϴ� �޼��� contains
//				setKyo.add(tmp);
//		}
//		
//		it = setA.iterator();
//		while(it.hasNext()) {
//			setHab.add(it.next()); // A�� ������ �� ����ִ� �޼���
//		}
//		
//		it = setB.iterator();
//		while(it.hasNext()) {
//			setHab.add(it.next()); // B�� ������ �� ����ִ� �޼��� �׷��� set Ư���� ������ �ߺ��� ���� ������ �ߺ��Ȱ� �ϳ��� ��µ�
//		}
		
//		setA.retainAll(setB); // ������. ����ȰŸ� ����� ����
//		setA.addAll(setB); // ������. setB�� ��� ��Ҹ� �߰�
		setA.removeAll(setB); // ������. setB�� ���� ��Ҹ� ����
		System.out.println(setA);
		
		System.out.println("A �� B - " + setKyo);
		System.out.println("A �� B - " + setHab);
		System.out.println("A - B - " + setCha);
		
	}

}
