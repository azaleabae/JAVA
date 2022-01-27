package ch04;

public class Ex4_16 {

	public static void main(String[] args) {
		// break문
		// 자신이 포함된 하나의 반복문을 벗어난다.

		// 무한 반복문 벗어나기 
		
		int sum = 0, i = 0;
		
		while(true) { // 값이 참이므로 무한 반복
			// for문 무한반복
			// for(;;){}
			if(sum > 100)
				break;
			
			++i;
			sum = sum + i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
	}

}
