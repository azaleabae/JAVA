package ch05;

public class Ex5_9_2 {

	public static void main(String[] args) {
		// 2���� �迭�� ���հ� ��� ���ϱ�
		
		int [][] score = {
				{50,60,80},
				{40,30,20},
				{100,40,30}
		};
		
		int kor=0, eng=0, math=0;
		
		System.out.println(" ��ȣ  ����  ����  ����  ����  ���");
		System.out.println("===========================");
		
		for(int row=0;row < score.length;row++) {
			int sum =0; // ���κ� ���� 
			float avg = 0.00f; // ���κ� ���
			
			kor += score[row][0];
			eng += score[row][1];
			math += score[row][2];
			
			System.out.printf("%3d", row+1);
			// score[row].length = �� �� ��
			// score.length =  ��ȣ
			
			for(int col=0; col < score[row].length; col++) { // ���κ� �հ� 
				sum += score[row][col];
				System.out.printf("%5d", score[row][col]);
			}
			avg = sum/(float)score[row].length;
			System.out.printf("%5d %3.1f%n", sum, avg); 
			
			
		}
		System.out.println("===========================");
		System.out.println("����: " + kor+ "  " + eng+ "  " + math);
	}

}
