package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_7_2 {

	public static void main(String[] args) {
		System.out.println("�λ� ����");
		Set set = new HashSet();

		for (int i = 0; set.size() < 7; i++) {
			int num = (int) (Math.random() * 45) + 1;
//			set.add(new Integer(num)); �Ʒ��ٰ� ����
			set.add(num);

		}

		List list = new LinkedList(set); // LinkedList(Collection c) 
		// set�� Ư���� ������ �Ұ����ϱ� ������ set�� list�� �Ű��༭ �����Ѵ�
		Collections.sort(list); // Collections.sort(List list) ����
		
		System.out.print(list.get(0) + " " + list.get(1) + " " + list.get(2)+ " " + list.get(3) + " " + 
						 list.get(4) + " " + list.get(5) + " ");

		System.out.println(" ���ʽ� ���� " + list.get(6) + "�Դϴ�.");

	}

}
