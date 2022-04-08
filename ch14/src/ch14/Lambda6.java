package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//�÷��� �����ӿ��� �Լ��� �������̽�

	// �Լ��� �������̽��� ����ϴ� �÷��� �����ӿ��� �޼���(���ϵ� ī�� ����)

	// �������̽�			�޼���											����
	// Collection		boolean removeIf(Predicate<E> filter)			���ǿ� �´� ��Ҹ� ����
	// List				void replaceAll(UnaryOperator<E> operator)		��� ��Ҹ� ��ȯ�Ͽ� ��ü
	// Iterable			void forEach(Consumer<T> action)				��� ��ҿ� �۾� action�� ����
	// Map				V compute(K key, BiFunction(K.V.V)f)			������ Ű�� ���� �۾� f�� ����
	// Map				V computeIfAbsent(K key. Function(K.V)f)		Ű�� ������. �۾� f ���� �� �߰�
	// Map				V computeIfPresent(K key. BiFunction<K.V.V>f)	������ Ű�� ���� ��. �۾� f ����
	// Map				V merge(K key. V value. BiFunction)(V.V.V)f)	��� ��ҿ� �����۾� f�� ����
	// Map				void forEach(BiConsumer<K.v> action)			������ Ű�� ���� �۾� f�� ����
	// Map				void replaceAll(BiFunction<K.V.V>f)				��� ��ҿ� ġȯ�۾� f�� ����
	

public class Lambda6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		//list�� ��� ��Ҹ� ���
		list.forEach(i -> System.out.print(i +","));
		System.out.println();
		
		//list���� 2 �Ǵ� 3�� ����� �����Ѵ�.
		list.removeIf(x-> x%2==0 || x%3==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10); // list�� �� ��ҿ� 10�� ���Ѵ�.
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map�� ��� ��Ҹ�{k,v}�� �������� ����Ѵ�.
		map.forEach((k,v)-> System.out.print("{" + k + "," + v + "},"));
		System.out.println();
	}
}
