package ch05;

public class Ex5_2_2 {

	public static void main(String[] args) {
		// 배열의 초기화
		// 배열의 각 요소에 처음으로 값을 저장하는 것
		
//		기본형
//		int[] score = new int[5];
//		score[0] = 50;
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
//		보통 쓰는 방법
//		int[]score = {50, 60, 70, 80, 90};
		
//		for문으로 배열[0]의 값이 50인 배열의 모든 요소를 초기화 해보기
		
		int[]score = new int[10];
		
		for(int i=0;i<score.length;i++) {
			score[i] = i * 10 + 50;
			System.out.println(score[i]);
		}

	}

}
