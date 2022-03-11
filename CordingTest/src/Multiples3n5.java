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



// 다른 사람이 풀어 놓은거 
//import java.util.stream.IntStream;
//public static void main(String[] args) {
//    System.out.println(String.format("정답: %d", foo(1000)));
//}
//
//private static int foo(int end) {
//    return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
//}
