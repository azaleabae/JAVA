package ch04;

public class Ex4_8_1 {

	public static void main(String[] args) {
		//for��
		
		// 1���� 10�߿� Ȧ����°�� �͸� ���
		for(int i = 1; i <= 10; i = i+2) {
			// i = 1,3,5,7,9 �� �ټ��� ��� �� 
			System.out.print(i+ " ");
		}
		System.out.println();
		// ���� �ΰ� ���� ����
		// ���� �ΰ��� ���� Ÿ���̾�� ���� �������� �� �ִ�.
		for(int a = 1, b = 9; a <= 5; a++ , b-- ) {
			System.out.print("a����" + a + " b����" + b + "//  ");
		}
		System.out.println();
		
		//�� �ۿ��� ���� ������ for�� �ۿ��� ������ ���� ���ָ� ��

		int cavalry;
		
		
		for(cavalry = 1; cavalry <= 3; cavalry++) {
			System.out.println("for������cavalry " + cavalry);
		}
		
		System.out.println("�ۿ� �ִ� " + cavalry);
		
	}

}
