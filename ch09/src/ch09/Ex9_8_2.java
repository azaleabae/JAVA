package ch09;

//Math클래스의 메서드

	// static double abs(double a)
	// static float abs(float f)
	// static int abs(int f)
	// static long abs(long f) -> 주어진 값의 절대값을 반환한다.

		// int i = Math.abs(-10);
		// double d = Math.abs(-10.0); 
		// i = 10	
		// d = 10.0

 	
	// static double ceil(double a) ->  주어진 값을 올림하여 반환한다.
		
		// double d = Math.ceil(10.1);
		// double d2 = Math.ceil(-10.1);
		// double d3 = Math.ceil(10.000015); 
		// d = 11.0
		// d2 = -10.0
		// d3 = 11.0

	
	// static double floor(double a)  -> 주어진 값을 버림하여 반환한다.
		
		// double d = Math.floor(10.8);
		// double d2 = Math.floor(-10.8);
		// d = 10.0
		// d2 = -11.0

	// static double max(double a, double b)   
	// static float max(float a, float b)
	// static int max(int a, int b)
	// static long max(long a, long b) ->  주어진 두 값 비교하여 큰 쪽을 반환한다.
	
		// double d = Math.max(9.5 , 9.50001);
		// i = Math.max(0, -1));
		// d = 9.50001
		// i = 0;
	
	
	// static double min(double a, double b)   
	// static float min(float a, float b)
	// static int min(int a, int b)
	// static long min(long a, long b) ->  주어진 두 값 비교하여 작은 쪽을 반환한다.

		//double d = Math.min(9.5 , 9.50001);
		// i = Math.min(0, -1));
		// d = 9.5
		// i = -1;

	
	//static double random() ->   0.0 ~ 1.0범위의 임의의 double값을 반환한다. (1.0은 범위에 포함되지 않는다.)

		// double d = Math.random();
		// int i = (int)(Math.random()*10)+1 
		// 0.0 <= d < 1.0
		// 1 <= i < 11
		
	
	//statoc long rint(double a)  ->  주어진 double값과 가장 가까운 정수값을 double형으로 반환한다. -> 짝수 반올림
	// 단, 두 정수의 정가운데 있는 값(1.5, 2.5, 3.5 등)은 짝수를 반환.
	
		// double d = Math.rint(1.2);
		// double d2 = Math.rint(2.6);
		// double d3 = Math.rint(3.5);
		// double d4 = Math.rint(4.5);
		// d = 1.0
		// d2 = 3.0
		// d3 = 4.0
		// d4 = 4.0
	

	// static long round(double a)
	// static long round(float a)  -> 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다.   -> 반올림
	// 두 정수의 정 가운데 있는 값은 항상 큰 정수를 반환.(rint()의 결과와 비교)
		// long l = math.round(1.2);
		// long l = math.round(2.6);
		// long l = math.round(3.5);
		// long l = math.round(4.5);
		// double d = 90.7552;
		// double d2 = Math.round(d*100)/100.0;
		// l = 1
		// l2 = 3
		// l3 = 4
		// l4 = 5
		// d = 90.7552
		// d2 = 90.76

	

		
		
public class Ex9_8_2 {

}
