package ch09;

public class Ex9_8_3 {

	public static void main(String[] args) {

//		for(double d = 0.0; d<=2; d+=0.1) {
//			double d1 = Math.round(d);
//			double d2 = Math.rint(d);
//			
//			System.out.printf("%4.1f %4.1f % 4.1f%n", d, d1, d2);
//								 0.0  0.0  0.0
//								 0.1  0.0  0.0
//								 0.2  0.0  0.0
//								 0.3  0.0  0.0
//								 0.4  0.0  0.0
//								 0.5  1.0  0.0
//								 0.6  1.0  1.0
//								 0.7  1.0  1.0
//								 0.8  1.0  1.0
//								 0.9  1.0  1.0
//								 1.0  1.0  1.0
//								 1.1  1.0  1.0
//								 1.2  1.0  1.0
//								 1.3  1.0  1.0
//								 1.4  1.0  1.0
//								 1.5  2.0  2.0
//								 1.6  2.0  2.0
//								 1.7  2.0  2.0
//								 1.8  2.0  2.0
//								 1.9  2.0  2.0
// }
		
		// 0.5 들의 결과만 출력해서 확인해보기
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 1.5; d<=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f % 4.1f%n", d, d1, d2);
			
			sum += d;
			sum += d1;
			sum += d2;
		}
			System.out.println("-----------");
			System.out.printf("%4.1f %4.1f % 4.1f%n", sum, sum1, sum2);
			
	}

}
