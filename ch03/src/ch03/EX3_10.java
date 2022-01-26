package ch03;

public class EX3_10 {

	public static void main(String[] args) {

		
		// 산술 변환
		// 연산 전에 피연산자의 타입을 일치시키는 것.
		
		// 1.값 손실을 최소화 하기 위해서 값을 큰쪽으로 변환시킨다.
		// long + int -> long + long = long
		// float + int -> float + float = float
		
		//2.int보다 작은 타입이면 int로 변환된다.
		// byte + short -> int + int = int
		// char + short -> int + int = int
		
		int a = 1_000_000;
		int b = 2_000_000;
		
//		long c = a * b; 
		// long으로 받을 수는 있으나 a와 b 자체가 int이기 때문에 계산 결과가 int타입으로 출력됨 그래서 long으로 받질 못함
		// 결과적으로 a나 b를 long으로 형 변환 해줘야 된다. 그럼 둘중에 하나는 자동으로 long으로 형 변환 되니까.
		long c = (long)a * b; 
		
		System.out.println(c);
	}

}
