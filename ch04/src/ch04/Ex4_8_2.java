package ch04;

public class Ex4_8_2 {

	public static void main(String[] args) {
		// for문의 조건식을 모두 생략하면 무한 반복문이 된다.
		// 조건식을 모두 true라고 간주하기 때문.		
		
		int a = 1;
		for(;;) {
			System.out.println(a);
		}

	}

}
