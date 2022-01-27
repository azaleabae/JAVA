package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// 배열의 선언과 생성
		// 배열의 선언 - 배열을 다루기 위한 참조변수의 선언
		
		// 선언의 예
		// int[]score;
		// String[]name;
		
		//타입[] 변수이름;	-> 배열을 선언(배열을 다루기 위한 참조변수 선언)
		//int[]score;
		
		// 변수이름 = new 타입[길이]; -> 배열을 생성(실제 저장공간을 생성)
		// score = new int[5];	-> int 타입의 값 5개를 저장할 수 있는 배열 생성
		
		int[]score;
		score = new int[10]; // 0부터 9까지 0 1 2 3 4 5 6 7 8 9
		
		
		score[3] = 100;
		System.out.println(score[3]); // 100
		
		int value = score[3];
		System.out.println(value); // 100

	}

}
