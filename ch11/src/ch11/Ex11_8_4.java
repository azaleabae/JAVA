package ch11;

// �˸� ���� �� - Ʈ�� ��ȸ

	// ���� Ʈ���� ��� ��带 �ѹ��� �д� ���� Ʈ�� ��ȸ��� �Ѵ�.

import java.util.TreeSet;

public class Ex11_8_4 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int [] score = {8,4,5,1,2,3,10,15,12,19,22};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("10���� ���� �� : " + set.headSet(10));
		System.out.println("10���� ū ��: " + set.tailSet(10));
		System.out.println("8�� 15������ �� : " + set.subSet(8, 19)); // 19�� ���Ծȵ�
		
	}

}
