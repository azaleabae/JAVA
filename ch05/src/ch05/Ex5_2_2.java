package ch05;

public class Ex5_2_2 {

	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ
		// �迭�� �� ��ҿ� ó������ ���� �����ϴ� ��
		
//		�⺻��
//		int[] score = new int[5];
//		score[0] = 50;
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
//		���� ���� ���
//		int[]score = {50, 60, 70, 80, 90};
		
//		for������ �迭[0]�� ���� 50�� �迭�� ��� ��Ҹ� �ʱ�ȭ �غ���
		
		int[]score = new int[10];
		
		for(int i=0;i<score.length;i++) {
			score[i] = i * 10 + 50;
			System.out.println(score[i]);
		}

	}

}
