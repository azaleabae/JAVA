package ch09;

// StringBuffer Ŭ����

	// Stringó�� ������ �迭(char[])�� ���������� �������ִ�.
	// �׷��� String�� �޸� ������ ������ �� �ִ�.


// StringBuffer�� ������

	// �迭�� ���� ����Ұ�. ������ �����ϸ� ���ο� �迭 �����Ͽ��� �Ѵ�.
	// StringBuffer�� ������ ���ڿ��� ���̸� ����ؼ� ������ ũ��� �����ؾ� �Ѵ�.

//	 public StringBuffer(int length){
//		value = new char[length];
//		 shred = false;
//	 }
//	 public StringBuffer() {
//		this()    -> ������ ũ�⸦ �������� ������ ������ ũ��� 16�� �ȴ�.
//	 }
//	 public StringBuffer(String str){
//		 this(str.length() + 16);  -> ������ ���ڿ��� ���̺��� 16�� �� ũ�� ���۸� �����Ѵ�.
//		 append(str);
//		}


// StringBuffer�� ����

	// Stringbuffer�� string�� �޸� ���� ������ �����ϴ�.
	
		// StringBuffer sb = new StringBuffer("abc");
		// sb.append("123") // sb�� ����ڿ� "123"�� �߰��Ѵ�.

	// append()�� ������ ������  StringBuffer�� �߰� ��, StringBuffer�� ������ ��ȯ

		// StringBuffer sb2 = sb.append("ZZ"); // sb�� ����ڿ� "ZZ"�� �߰��Ѵ�.
		// System.out.print(sb);	// abc123ZZ
		// System.out.println(sb2); // abc123ZZ


// StringBuffer�� ��

	//StringBuffer�� equals()�� �������̵��Ǿ����� �ʴ�.(�ּҺ�)

		// StringBuffer sb = new StringBuffer("abc");
		// StringBuffer sb2 = new StringBuffer("abc");

		// System.out.println(sb==sb2); // false
		// System.out.println(sb.equals(sb2)); //false 

	// StringBuffer�� String���� ��ȯ �Ŀ� equals()�� ���ؾ� �Ѵ�.

		// String s = sb.toString(); // sb�� String���� ��ȯ
		// String s2 = sb2.toString(s2); 

		//System.out.pritln(s.equlas(s2));


public class Ex9_7_1 {

	

}
