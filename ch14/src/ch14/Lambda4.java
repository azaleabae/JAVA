package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


// java.util.function��Ű��(1/3)

	//���� ���Ǵ� �پ��� �Լ��� �������̽��� ����

	//	�Լ��� �������̽�		 		�޼���				����
	// java.lang.Runnable	void run()			�Ű������� ����, ��ȯ���� ����.
	// Supplier<T>			T get() 			�Ű������� ����, ��ȯ���� ����.(������)
	// Consumer<T>			void accept(T t)	Supplier�� �ݴ�� �Ű������� �ְ�, ��ȯ���� ����
	// Function<T, R>		R apply(T t)		�Ϲ����� �Լ�, �ϳ��� �Ű������� �޾Ƽ� ����� ��ȯ
	// Predicate<T>			boolean test(T t)	���ǽ��� ǥ���ϴµ� ����, �Ű������� �ϳ�, ��ȯ Ÿ���� boolean



//  java.util.function��Ű��(2/3)

	// �Ű������� 2���� �Լ��� �������̽�

	// �Լ��� �������̽�		 		�޼���					����
	// (T.U�� �Է� R�� ���)

	// BiConsumer<T.U>		void accept(T t, U u) 	�ΰ��� �Ű������� �ְ�, ��ȯ���� ����
	// BiPredicate<T.U>		boolean test(T t, U u) 	���ǽ��� ǥ���ϴµ� ����
	// BiFunctior<T.U.R>	R apply(T t, U u) 		�ΰ��� �Ű������� �޾Ƽ� �ϳ��� ����� ��ȯ




//java.util.function��Ű��(3/3)

	// �Ű������� Ÿ�԰� ��ȯŸ���� ��ġ�ϴ� �Լ��� �������̽�

	// �Լ��� �������̽�		 		�޼���					����
	// UnaryOperator<T>		T apply(T t)			Function�� �ڼ�, Function�� �޸� �Ű������� ����� Ÿ���� ����.
	// BinaryOperator<T>	T apply(T t, T t)		BiFunction�� �ڼ�, BiFunction�� �޸� �Ű������� ����� Ÿ���� ����.



public class Lambda4 {

	public static void main(String[] args) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1; // 1~100����
		Consumer<Integer> c = i -> System.out.print(i+ ", ");
		Predicate<Integer> p = i -> i%2==0; // ¦������ �˻�
		Function<Integer, Integer> f = i -> i/10*10; // i�� ���� �ڸ��� ���ش�.
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s,list);	// list�� ������ ���� ä���.
		System.out.println(list);
		printEvenNum(p, c, list); // ¦���� ���
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	private static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
//	Consumer<Integer> c = i -> System.out.print(I + ",");
//	predicate<Integer> p = i -> i%2==; // ¦������ �˻�
	

	static <T> void
	printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))// ¦������ �˻�
				c.accept(i); // i -> System.out.print(i + ", "); ȭ�鿡 i���
		}
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());
		}
	}
}
