package ch09;

//���ڿ��� ���ڷ� ��ȯ�ϱ�

	// ���ڿ��� ���ڷ� ��ȯ�ϴ� �پ��� ���

		// int i = new Integer("100").intValue();  // floatValue().longValue(),...
		// int i2 = Integer.parseInt("100"); // �ַ� �� ����� ���� ���.
		// int i3 = Integer.valueOf("100");
public class Ex9_10 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt("100");
		
		System.out.println("i=" +i);
		System.out.println("i=" + Integer.parseInt("100"));
		System.out.println("i=" + Integer.parseInt("100",10)); // ���� ����
		System.out.println("i=" + Integer.parseInt("100",2)); // 2����
		System.out.println("i=" + Integer.parseInt("FF",16)); // 2����
		
	}
}
