package ch09;

import java.util.ArrayList;

// ����ڽ� & ��ڽ�
	
	// int��� �⺻���� wrapper Ŭ������ Integer�� �ٲ���°� ����ڽ�
	// �ݴ�� ��ڽ�

public class Ex9_11 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(new Integer(100)); // list���� ��ü�� �߰����� �׷��� �̷��� ����ȯ�� ����� �ߴµ� 
		// jdk 1.5 ���ķ� �Ʒ��� �ڵ�ó�� ���ϰ� ���� �ֵ��� �ٲ����.
		list.add(100); // JDK 1.5 �������� ����.
		
//		Integer i = list.get(0); // list�� ����� ù��° 
//		int i = list.get(0).intValue(0); // intValue()�� Integer�� int�� ��ȯ
		int i = list.get(0); // intValue()fh Integer�� int�� ��ȯ
	}

}
