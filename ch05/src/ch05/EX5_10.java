package ch05;

public class EX5_10 {

	public static void main(String[] args) {
		// String Ŭ����
		// 1. StringŬ������ char[]�� �޼���(���)�� ������ ��
		// 	  StringŬ���� = char[] + �޼���(���)
		// 2. String Ŭ������ ������ ������ �� ����.(read only)
		
		String str = "���ظ���Ż��3";
		char ch = str.charAt(6);
		
		String str2 = str.substring(0,3); // (~���� , ~����(�ٵ��̰� ���Ծȵ�))
		String str3 = str.substring(1); // 1�� ����  1���� ������ ���
		String str4 = str.substring(0,str.length()); // 0~4

		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

}
