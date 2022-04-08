// 1000이하의 3과 5의 배수를 구해서 모두 더하기 

public class Multiples3n5 {
	
	public static void main(String[] args) {

		int i = 0, sum = 0;
		
		for(i = 0; i<1000; i++) {
			if( i % 3 == 0 || i % 5 == 0) {
//				sum = sum + i;
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
