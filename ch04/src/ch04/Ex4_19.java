package ch04;

public class Ex4_19 {

	public static void main(String[] args) {
		
		// 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날수 있다.
		// 구구단 예제로 2단에서 2*7 까지만 찍고 빠져나가기
		
		loop1 : for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num<=9; num++ ) {
				if(num==8)
					break loop1;
				System.out.println(dan + "x" + num + "= " + (dan*num));
			}
			System.out.println();
		}
	}

}
