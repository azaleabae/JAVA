package ch14;

import java.util.function.Function;

// �޼��� ����(method reference)

	// �ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� '�޼��� ����'�� ������ �� �� �ִ�.

	// 	����						����									�޼��� ����
	// static�޼��� ����			(x) -> ClassName.method(x)			ClassName::method
	// �ν��Ͻ��޼��� ���� 			(obj,x) -> obj.method(x)			ClassName::method
	// Ư�� ��ü �ν��Ͻ��޼��� ����		(x)	-> obj.method(x)				obj::method
	
	// static�޼��� ����
	
	// Integer method(String s) { // ���� Interger.parseInt(String s)�� ȣ��
		// return Integer.parseInt(s);
	// }

	// Function<String, Integer> f = Integer::parseInt; // �޼��� ����
	


public class Lambda7 {
	public static void main(String[] args) {
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//		System.out.println(f.apply("100")+200); // ���ڷ� �ٲ�
		
		// �޼��� ������ �ٲ� ����
		Function<String,Integer> f = Integer::parseInt;
		System.out.println(f.apply("100")+200); // ���ڷ� �ٲ�
	
	}
}
