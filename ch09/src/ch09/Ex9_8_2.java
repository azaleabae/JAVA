package ch09;

//MathŬ������ �޼���

	// static double abs(double a)
	// static float abs(float f)
	// static int abs(int f)
	// static long abs(long f) -> �־��� ���� ���밪�� ��ȯ�Ѵ�.

		// int i = Math.abs(-10);
		// double d = Math.abs(-10.0); 
		// i = 10	
		// d = 10.0

 	
	// static double ceil(double a) ->  �־��� ���� �ø��Ͽ� ��ȯ�Ѵ�.
		
		// double d = Math.ceil(10.1);
		// double d2 = Math.ceil(-10.1);
		// double d3 = Math.ceil(10.000015); 
		// d = 11.0
		// d2 = -10.0
		// d3 = 11.0

	
	// static double floor(double a)  -> �־��� ���� �����Ͽ� ��ȯ�Ѵ�.
		
		// double d = Math.floor(10.8);
		// double d2 = Math.floor(-10.8);
		// d = 10.0
		// d2 = -11.0

	// static double max(double a, double b)   
	// static float max(float a, float b)
	// static int max(int a, int b)
	// static long max(long a, long b) ->  �־��� �� �� ���Ͽ� ū ���� ��ȯ�Ѵ�.
	
		// double d = Math.max(9.5 , 9.50001);
		// i = Math.max(0, -1));
		// d = 9.50001
		// i = 0;
	
	
	// static double min(double a, double b)   
	// static float min(float a, float b)
	// static int min(int a, int b)
	// static long min(long a, long b) ->  �־��� �� �� ���Ͽ� ���� ���� ��ȯ�Ѵ�.

		//double d = Math.min(9.5 , 9.50001);
		// i = Math.min(0, -1));
		// d = 9.5
		// i = -1;

	
	//static double random() ->   0.0 ~ 1.0������ ������ double���� ��ȯ�Ѵ�. (1.0�� ������ ���Ե��� �ʴ´�.)

		// double d = Math.random();
		// int i = (int)(Math.random()*10)+1 
		// 0.0 <= d < 1.0
		// 1 <= i < 11
		
	
	//statoc long rint(double a)  ->  �־��� double���� ���� ����� �������� double������ ��ȯ�Ѵ�. -> ¦�� �ݿø�
	// ��, �� ������ ����� �ִ� ��(1.5, 2.5, 3.5 ��)�� ¦���� ��ȯ.
	
		// double d = Math.rint(1.2);
		// double d2 = Math.rint(2.6);
		// double d3 = Math.rint(3.5);
		// double d4 = Math.rint(4.5);
		// d = 1.0
		// d2 = 3.0
		// d3 = 4.0
		// d4 = 4.0
	

	// static long round(double a)
	// static long round(float a)  -> �Ҽ��� ù°�ڸ����� �ݿø��� ������(long)�� ��ȯ�Ѵ�.   -> �ݿø�
	// �� ������ �� ��� �ִ� ���� �׻� ū ������ ��ȯ.(rint()�� ����� ��)
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
