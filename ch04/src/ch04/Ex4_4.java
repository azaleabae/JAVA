package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		// 임의의 难数 만들기
		
		//괄호{} 안의 내용을 반복

		
		for(int i=1; i<=6; i++) {
//			System.out.println(Math.random());   
			// 0.0 <= x < 1.0
//			System.out.println(Math.random()*10);
			// 0.0 <= x 10.0
//			System.out.println((int)(Math.random()*10));
			// 0 <= x < 10,  0~9
//			System.out.println((int)(Math.random()*10)+1);
			// 1 <= x < 11,  1~10

			// -5 부터 5 구하기
			System.out.println((int)(Math.random()*11)-5);
			// -5 <= x < 6,   -5~5( 0 포함하면 11개라서 11곱함)
		}
	}

}
