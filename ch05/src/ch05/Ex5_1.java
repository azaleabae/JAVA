package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// �迭�� ����� ����
		// �迭�� ���� - �迭�� �ٷ�� ���� ���������� ����
		
		// ������ ��
		// int[]score;
		// String[]name;
		
		//Ÿ��[] �����̸�;	-> �迭�� ����(�迭�� �ٷ�� ���� �������� ����)
		//int[]score;
		
		// �����̸� = new Ÿ��[����]; -> �迭�� ����(���� ��������� ����)
		// score = new int[5];	-> int Ÿ���� �� 5���� ������ �� �ִ� �迭 ����
		
		int[]score;
		score = new int[10]; // 0���� 9���� 0 1 2 3 4 5 6 7 8 9
		
		
		score[3] = 100;
		System.out.println(score[3]); // 100
		
		int value = score[3];
		System.out.println(value); // 100

	}

}
