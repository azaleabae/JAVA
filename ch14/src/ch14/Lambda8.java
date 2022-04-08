package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

// �������� �޼��� ����

	// �����ڿ� �޼��� ����
	
		// �����ڿ� �Ű������� ���� ���
		// Supplier<MyClass> s = () -> new Myclass();
		// Supplier<MyClass> s = MyClass::new;

		// �����ڿ� �Ű������� �ִ� ���
		// Function<Integer, MyClass> s = (i) -> new MyClass(i);
		// Function<Integer, MyClass> s = MyClass::new;

		// �����ڿ� �Ű������� ���� ���
		// BiFunction<T,U,R> �����
	
	// �迭�� �޼��� ����
		
		// Function<Integer, int[]> f = x -> new int[x]; // ���ٽ�
		// Function<Integer, int[]> f2 = int::new; // �޼��� ����
		
public class Lambda8 {

	public static void main(String[] args) {
		// Supplier�� �Է�x, ���

//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new;
//		MyClass mc = s.get();
//		System.out.println(mc);
		
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new; // �޼��� ����
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length=" + arr.length);
	}
}

class MyClass {
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
}
