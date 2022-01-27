package ch05;

public class Ex5_1_tmp {

	public static void main(String[] args) {

//		int[]score; -> 참조 변수 선언 
//		score = new int[5];  ->배열의 생성 (int저장공간 * 5)
		
		int[] score = new int[5]; // 위 두줄의 코드를 하나로.
		score[3] = 100;
		
		System.out.println("score[0]= " + score[0]);
		System.out.println("score[1]= " + score[1]);
		System.out.println("score[2]= " + score[2]);
		System.out.println("score[3]= " + score[3]);
		System.out.println("score[4]= " + score[4]);
	}

}
