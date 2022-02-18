package ch09;

public class Ex9_6_2 {

	public static void main(String[] args) {
	// 숫자를 문자열로 밖는 방법
	int i = 100;
	String str1 = i + ""; // 숫자 100을 문자열 "100"으로 변환하는 방법 1
	String str2 = String.valueOf(i); // 숫자 100을 문자열 "100"으로 변환하는 방법 2
	
	
// 문자열을 숫자로 바꾸는 방법
	int a = Integer.parseInt("100");
	int a2 = Integer.valueOf("100");
	int a3 = Integer.valueOf("100");
	
// 기본형 -> 문자열 
	
	// String String.valueOf(boolean b)
	// String String.valueOf(char c)
	// String String.valueOf(int i)
	// String String.valueOf(long l)
	// String String.valueOf(float f)
	// String String.valueOf(double d)
	

// 문자열 -> 기본형 

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
