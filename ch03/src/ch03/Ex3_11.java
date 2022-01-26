package ch03;

public class Ex3_11 {

	public static void main(String[] args) {

		
		// 반올림
		// Math.round() 메서드를 사용하여 실수를 소수점 첫 째자리에서 반올림 시킴
		long result = Math.round(1.53);
		
		System.out.println(result);
		
		double pi = 3.141592;
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		
//										int	    int		
		System.out.println(Math.round(pi*1000)/1000);
		
//										int    더블이나 플로트				
		System.out.println(Math.round(pi*1000)/1000.0);
		
		
//		반올림 없이 계산하기
		System.out.println(pi*1000);
		System.out.println((int)pi*1000/1000.0);
		
		
		
	}

}
