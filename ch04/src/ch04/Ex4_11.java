package ch04;

public class Ex4_11 {

	public static void main(String[] args) {
		// 중첩 for문으로 별찍어보기
		
		for(int i = 1; i <=10; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
