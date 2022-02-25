package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_9_3 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("�޸�", new Integer(90));
		map.put("�����", new Integer(100));
		map.put("����", new Integer(100));
		map.put("Ű������", new Integer(80));
		map.put("�ɼ���", new Integer(90));
		
		Set set = map.entrySet(); // entrySet -> ��ü���(key,value)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); // Map �������̽��ȿ� �ִ� Entry��� �������̽�
			System.out.println("�̸�: " + e.getKey() + ", ����: " + e.getValue());
		} // ��Ʈ�� ���� �̿��ؼ� �ʿ� ����� �����͸� �о���� ����� �����ִ� �ڵ�
		
		set = map.keySet(); // �̸��� �����ö� key���� ��������
		System.out.println("������ ���: " + set);
		
		Collection values = map.values(); // ���鸸 �������� 
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i; // ���������ͼ� �� ���ϸ� ����
		}
		
		System.out.println("����: " + total);
		System.out.println("���: " + (float)total/set.size()); // ����̴ϱ� float�� ����ȯ
		System.out.println("�ְ����� : " + Collections.max(values)); // values ���� ū���� ��ȯ�ϴ� �޼���
		System.out.println("�ְ����� : " + Collections.min(values)); // ���� ���� ���� ��ȯ�ϴ� �޼���
	}

}
