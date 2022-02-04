package ch06;

public class Ex6_6_2 {
	public static void main(String[] args) {
		Math m = new Math();
		System.out.println("m.add(3, 3) 결과:" + m.add(3,3));
		System.out.println("m.add(3L, 3) 결과:" + m.add(3L,3));
		System.out.println("m.add(3, 3L) 결과:" + m.add(3,3L));
		System.out.println("m.add(3L, 3L) 결과:" + m.add(3L,3L));
		
//		int[] a = {100,200,300};
//		System.out.println("m.add(a) 결과: " + m.add(a));
	}
	
}

class Math{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	

	long add(int a, long b) {
		System.out.print("long add(int a, int b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long add(int a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(int a, int b) - ");
		return a+b;
	}
	
}
