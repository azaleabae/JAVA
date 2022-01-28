package ch05;

public class Ex5_9_1 {

	public static void main(String[] args) {
		// 2차원 배열 돌려보기

		
//		형식화된 출력 - printf()
//
//
//		기본 출력문은 println()은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
//
//		반면에 printf()는 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력할 수 있다.
//
//
//
//		printf()
//
//		System.out.printf("출력 서식",출력할 내용);
//
//		출력 후 줄바꿈을 하지 않는다. 줄바꿈을 하려면 지시자 '%n'을 넣어줘야 한다.
//		출력하려는 값의 수만큼 지시자도 사용해야 한다.
//		출력될 값과 지시자의 순서는 일치해야 한다.
//		지시자를 제외한 문자는 입력한 그대로 출력된
// 		%s = 문자열 출력지시
//		%d = 정수 출력지시
//		%n = 개행 지시	
// 		%5.1f% = 앞의 %5는 문자를 5개 까지만 출력 한다는 뜻 가령 가나다라마바사 가있으면 가나다라마 까지만 출력됨 
// 		뒤에 .1f 는 소수점 첫번째자리 까지만 표현하겠다는 뜻
		
		int [][]score = {
				{1,2,3},
				{4,5,6,13},
				{7,8,9},
				{10,11,12}
		};
		int sum = 0;
		
		for(int row = 0; row < score.length; row++) {
			for(int col = 0; col < score[row].length; col++) {
				System.out.printf("score[%d][%d]= %d%n", row,col, score[row][col]);
				sum += score[row][col];
			}
		}
		System.out.println("총합: " + sum);

	}

}
