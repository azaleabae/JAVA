package ch09;

public class Ex9_6_2 {

	public static void main(String[] args) {
	// ���ڸ� ���ڿ��� �۴� ���
	int i = 100;
	String str1 = i + ""; // ���� 100�� ���ڿ� "100"���� ��ȯ�ϴ� ��� 1
	String str2 = String.valueOf(i); // ���� 100�� ���ڿ� "100"���� ��ȯ�ϴ� ��� 2
	
	
// ���ڿ��� ���ڷ� �ٲٴ� ���
	int a = Integer.parseInt("100");
	int a2 = Integer.valueOf("100");
	int a3 = Integer.valueOf("100");
	
// �⺻�� -> ���ڿ� 
	
	// String String.valueOf(boolean b)
	// String String.valueOf(char c)
	// String String.valueOf(int i)
	// String String.valueOf(long l)
	// String String.valueOf(float f)
	// String String.valueOf(double d)
	

// ���ڿ� -> �⺻�� 

	//boolean Boolean.valueOf(String s)
	//byte Byte.valueOf(String s)
	//short Short.valueOf(String s)
	//int Integer.valueOf(String s)
	//long Long.valueOf(String s)
	//float Float.valueOf(String s)
	//double.valueOf(String s)
	
	String b = "3.14";
	
	double dlb =  Double.valueOf(b);
	
	
	var output = dlb * dlb;
	System.out.println(output);

	}

	
}
