package ch05;

public class Ex5_9_2 {

	public static void main(String[] args) {
		// 2차원 배열로 총합과 평균 구하기
		
		int [][] score = {
				{50,60,80},
				{40,30,20},
				{100,40,30}
		};
		
		int kor=0, eng=0, math=0;
		
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("===========================");
		
		for(int row=0;row < score.length;row++) {
			int sum =0; // 개인별 총점 
			float avg = 0.00f; // 개인별 평균
			
			kor += score[row][0];
			eng += score[row][1];
			math += score[row][2];
			
			System.out.printf("%3d", row+1);
			// score[row].length = 국 영 수
			// score.length =  번호
			
			for(int col=0; col < score[row].length; col++) { // 개인별 합계 
				sum += score[row][col];
				System.out.printf("%5d", score[row][col]);
			}
			avg = sum/(float)score[row].length;
			System.out.printf("%5d %3.1f%n", sum, avg); 
			
			
		}
		System.out.println("===========================");
		System.out.println("총점: " + kor+ "  " + eng+ "  " + math);
	}

}
