package ch04;

public class Ex4_8_1 {

	public static void main(String[] args) {
		//for문
		
		// 1부터 10중에 홀수번째인 것만 출력
		for(int i = 1; i <= 10; i = i+2) {
			// i = 1,3,5,7,9 총 다섯번 출력 됨 
			System.out.print(i+ " ");
		}
		System.out.println();
		// 변수 두개 같이 찍어보기
		// 변수 두개는 같은 타입이어야 같이 선언해줄 수 있다.
		for(int a = 1, b = 9; a <= 5; a++ , b-- ) {
			System.out.print("a값은" + a + " b값은" + b + "//  ");
		}
		System.out.println();
		
		//블럭 밖에서 변수 쓰려면 for문 밖에서 변수를 선언 해주면 됨

		int cavalry;
		
		
		for(cavalry = 1; cavalry <= 3; cavalry++) {
			System.out.println("for문안의cavalry " + cavalry);
		}
		
		System.out.println("밖에 있는 " + cavalry);
		
	}

}
