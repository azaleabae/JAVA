package ch05;

public class Ex5_2_4 {

	public static void main(String[] args) {
		// �迭�� ��� �ջ�� ��ճ���
		
		int sum = 0; //����
		float average = 0f; //����
		
		int[]score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];  // sum = sum + score[i];
		}
		average = sum/(float)score.length; // ������� float�� ���� �Ǵϱ�
		System.out.println("���� : "+ sum);
		System.out.println("��� : "+ average);
	}

}
