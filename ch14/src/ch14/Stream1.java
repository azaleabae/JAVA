package ch14;

// �پ��� ������ �ҽ��� ǥ��ȭ�� ������� �ٷ�� ���� ��(�������� �������� �帧)

	// List<Integer> list = ArrayList.asList(1,2,3,4,5);
	// Stream<Integer> intStream = list.stream(); // �÷���.
	// Stream<String> strStream = strStream.of(new String[]{"a","b","c"}); // �迭
	// Stream<Integer> evenStream = Stream.iterate(0, n->n+2); // 0,2,4,6, ...
	// Stream<Double> randomStream = Stream.generate(Math::random); // ���ٽ�
	// IntStream	intStream = new Random().ints(5); // ���� ��Ʈ��(ũ�Ⱑ 5)


// ��Ʈ��(Stream)

// ��Ʈ���� Ư¡ 1/3
	// ��Ʈ���� �����ϴ� ��� - �߰� ����� ���� ����
		// �߰� ���� - �������� ��Ʈ���� ����. �ݺ������� ���밡��
		// ���� ���� - �������� ��Ʈ���� �ƴ� ����. �� �ѹ��� ���밡��(��Ʈ���� ��Ҹ� �Ҹ�)
		// Stream.distince().limit(5).sorted().forEach(System.out::println)
		//			�߰�����	 �߰�����	   �߰�����	forEach���� ���� ����


	// ��Ʈ���� ������ �ҽ��κ��� �����͸� �б⸸�� �� �������� �ʴ´�.(read only)
		// List<Integer> list = Arrays.asList(3,1,5,4,2);
		// List<Integer> sortedList = list.stream().sorted() 				// list�� �����ؼ�
		//								  .collect(Collectors.toList());	// ���ο� list�� ����
		// System.out.println(list);						 // [3, 1, 5, 4, 2]
		// System.out.println(sortedList);					 // [1, 2, 3, 4, 5]
		
	// ��Ʈ���� Iteratoró�� ��ȸ���̴�.(�ʿ��ϸ� �ٽ� ��Ʈ���� �����ؾ� ��) -> ���������ϸ� ��Ʈ���� ����
		// strStream.forEach(System.out::println); // ��� ��Ҹ� ȭ�鿡 ���(��������)
		// int numOfstr = strStream.count();	   // ����. ��Ʈ���� �̹� ������.

	// ���� ���� ������ �߰������� ������� �ʴ´�. - ������ ����
		// IntStream intStream = new Random().ints(1, 46);	// 1~45������ ���� ��Ʈ��
		// intStream.distinct().limit(6).sorted()			// �߰� ����
		// 			.forEach(i->System.out.print(i+","))	// ���� ����



// ��Ʈ���� Ư¡ 2/3

	// ��Ʈ���� �۾��� ���� �ݺ����� ó���Ѵ�.
		// for(String str : strList)) -> stream.forEach(System.out::println);
		// 	System.out.println(str);


		// void forEach(Consumer<? super T) action){
		// 		Objects.requredNonNull(action); // �Ű����� �� üũ
			
		// 		for(T t : src)	// ���� �ݺ�(for���� �޼��� ������ ����)
		// 			action.accept(T);
		// }


// ��Ʈ��(Stream)�� Ư¡(3/3)

	// ��Ʈ���� �۾��� ���ķ� ó�� - ���Ľ�Ʈ��
		// Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		// int sum = strStream.parallel() // ���� ��Ʈ������ ��ȯ(�Ӽ��� ����)
		//					  .mapToInt(s -> s.length()).sum(); // ��� ���ڿ��� ������ ��)
	
	// �⺻�� ��Ʈ�� - IntStream, LongStream, DoubleStream(�۾��ϴµ� ���� ������ �ʿ��� ��)
		// ����ڽ�&��ڽ��� ��ȿ���� ���ŵ�(Stream<Integer>��� intStream���)
		// ���ڿ� ���õ� ������ �޼��带 Stream<T>���� �� ���� ����

	
public class Stream1 {

}
