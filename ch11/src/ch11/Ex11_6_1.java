package ch11;

// Comparator�� comparable

	// ��ü ���Ŀ� �ʿ��� �޼���(���ı��� ����)�� ������ �������̽�
		// Comparable �⺻ ���ı����� �����ϴµ� ���.
		// Comparator �⺻ ���ı��� �ܿ� �ٸ� �������� �����ϰ����� �� ���
		

		//	public interface Comparator{
		//		int compare(Object o1, Object o2); // o1,o2 �� ��ü�� ��
		//		boolean equals(Object obj); // equals�� �������̵��϶�� ��
		//	}
		//	public interface Comparable{
		//		int compareTo(Object o); // �־��� ��ü(o)�� �ڽŰ� ��
		//	}


	// compare()�� compareTo()�� �� ��ü�� �񱳰���� ��ȯ�ϵ��� �ۼ�
		

		// public final class integer extends Number implements Comparable{
		//		...
		//		public in t compareTo(Integer anotherInteger) {
		//			int v1 = this.intValue();
		//			int v2 = anotherInteger.value;
		//			// ������ 0, ������ ���� ũ�� -1, ������ 1�� ��ȯ
		//			return(v1 < v2 ? -1 : (v1 ==v2? 0 : 1)); // ���� ������ ��ø
		//		}
		// 		...
		// }