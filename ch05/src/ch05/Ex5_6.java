package ch05;

public class Ex5_6 {

	public static void main(String[] args) {
		// 2차원 배열
		// 테이블 형태의 데이터를 저장하기 위한 배열
		
		// 선언하기
		// int[][] score = new int [4][3];
		// 위와 같이 선언하면 4행 3열의 테이블 모양의 배열이 생성됨
		// 세로로 4 가로로 3 총 12개의 배열이 생성됨
		// 각각의 배열은 행index와 열index 값을 가짐
		// 1행1열의 경우 score[0][0]이 된다.
		
		int[][]score = new int [4][3];
		score[0][0] = 1004;
		System.out.println(score[0][0]);
		
		// 2차원 배열의 초기화
		// int[][]arr = {
		//				{1,2,3},
		// 				{4,5,6}
		// 				};
	}

}
