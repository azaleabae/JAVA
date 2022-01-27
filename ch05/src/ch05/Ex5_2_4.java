package ch05;

public class Ex5_2_4 {

	public static void main(String[] args) {
		// 배열의 요소 합산과 평균내기
		
		int sum = 0; //총점
		float average = 0f; //변수
		
		int[]score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];  // sum = sum + score[i];
		}
		average = sum/(float)score.length; // 계산결과를 float로 얻어야 되니까
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ average);
	}

}
