package ch09;

// String Ŭ������ �����ڿ� �޼���

	// String(char[] value) - > �־��� ���ڿ��� ���� String �ν��Ͻ��� �����Ѵ�.
		
		// char[] c = {'H','e','l','l','o'}
		// String s = new String(c);
		// s = "Hello"
		// String ���� char[]�� �ٲܶ��� toCharArray �޼��带 ��
	
	
	// String(StringBuffer buf) -> StringBuffer�ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String�ν��Ͻ��� �����Ѵ�.
		
		// ���� ���� ������ ���ڿ�
		// StingBuffer sb = new StringBuffer("Hello");
		// String s = new String(sb);
		// s = "hello"
		

	// char charAt(int index) -> ������ ��ġ�� �ִ� �����ϳ��� ��ȯ�Ѵ�.(index�� �迭�̴ϱ� 0���� ����)
	
		// String s = "Hello"
		// char c = s.charAt(1);
		// c = 'e'
	

	// int compareTo(String str) -> ���ڿ�(str)�� ���������� ���Ѵ�. ������ 0��, ���������� �����̸� ������, ���ĸ� ���

		// int i = "aaa".compareTo("aaa"); 
		// int i2 = "aaa".compareTo("bbb");
		// int i3 = "bbb".compareTo("aaa");
		// i = 0
		// i2 = -1
		// i3 = 1


	// String concat(String str) -> ���ڿ�(str)�� �����δ�. 
		
		// String s = "Hello";
		// String s = s.concat(" World");
		// s2 = "Hello World"

	
	// boolean contains(CharSequence s) -> ������ ���ڿ�(s)�� ���ԵǾ����� �˻��Ѵ�.
		
		// String s = "abcdefg";
		// Boolean b = s.contains("bc");
		// b = true ->"abcdefg"��  b�� ���ԵǾ������� true

	
	// boolean endsWith(String suffix) -> ������ ���ڿ�(suffix)�� �������� �˻��Ѵ�.

		// String file = "Hello.txt";
		// boolean b = file.ensWith("txt");
		// b = true

	
	// boolean equals(object obj)-> �Ű������� ���� ���ڿ�(obj)�� String�ν��Ͻ��� ���ڿ��� ���Ѵ�. 
	// obj�� String�� �ƴϰų� ���ڿ��� �ٸ��� false�� ��ȯ

		// String s = "Hello";
		// boolean b = s.equals("Hello");
		// boolean b2 = s.equals("hello")
		// b = ture
		// b2 = false (��ҹ��� �����ϴµ�?)


	// boolean equalsIgnoreCase(String str) -> ���ڿ��� String�ν��Ͻ��� ���ڿ��� ��ҹ��� ���о��� ���Ѵ�.

		// String s = "Hello";
		// boolean b = s.equalsIgnoreCase("HELLO");
		// boolean b2 = s.equalsIgnoreCase("heLLo");
		// b = true
		// b2 = ture


	// int indexOf(int ch) -> �־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. �� ã���� -1�� ��ȯ�Ѵ�(index�� 0����)

		// String s = "Hello";
		// int idx1= s. indexOf('o');
		// int idx2 = s.indexOf('k');
		// idx1 = 4  -> 'o' �� 5��°�ϱ� �迭ó�� -1 �ؼ� 4
		// idx2 = -1 -> �����ϱ� -1



	// int indexOf(int ch, int pos) -> ���� �������� ��� ������ ã�⸦ �����ϴ� ������ ������ �� ����

		// String s = "Hello";
		// int idx1= s.indexOf('e' , 0);
		// int idx2 = s.indexOf('e' , 2);
		// idx1 = 1
		// idx2 = -1  ->  2���� hello �߿� L ���� ã�� �����ؼ� ������ ���µ� 'e' �� �������� �������� -1�� ����

	
	// int indexOf(String str) -> �־��� ���ڿ��� �����ϴ��� Ȯ���Ͽ� �� ��ġ(index)�� �˷��ش�. 
	// ������ -1�� ��ȯ�Ѵ�.(index�� 0 ���� ����) ��ȯ�� ���� �տ��ִ� index���� ���ش�.

		// String s = "ABCDEFG";
		// int idx = s.indexOf("CD");
		// idx = 2  -> ã�� �� 'CD' �߿� C�� �迭 2���� ��ġ ������ 2�� ����

	
	// int lastIndexOf(int ch) -> �׳� indexOf�� �Ȱ����� �迭�� ���κ� ���� ã�� ������ �迭�� �ּ� ���� ������ ��ã���� -1 ��ȯ


	// int lastIndexOf(String str) - > �����ѵ� �̰͵� ���ڿ� ������ ã�� �����ؼ�  ���� �˷��� 
	// index ���� ���߿� ���� ���ڰ� �������� ������(5~8���� ���� ã�Ҵٸ� 5�� ����) ��ã���� -1 


	// int length() -> ���ڿ��� ���̸� �˷��ش�. 

		// String s = "Hello";
		// int length = s.length();
		// length = 5


	// String[] split(String regex) -> ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�.

		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",")
		// arr[0] = "dog"
		// arr[1] = "cat"
		// arr[2] = "bear"

	
	// String[] split(String regex, int limit) -> ���ڿ��� ������ �и��ڷ� ������ ���ڹ迭�� ��� ��ȯ. 
	//	��, ���ڿ� ��ü�� ������ ��(limit)�� �ڸ���. (�� �κ��̳� �� �κ� ����)

		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",",2); 
		// arr[0] = "dog" 
		// arr[1] = "cat, bear"
	
	// boolean startsWith(String prefix) -> �־��� ���ڿ�(prefix)�� �����ϴ��� �˻��Ѵ�.

		// String s= "java.lang.Object"; 
		// boolean b = s.startsWith("java);
		// boolean b2 = s.startsWith("lang"); 
		// b = true
		// b2 = false

	
	// String substring(int begin))
	// String substring(int begin, int end) - >�־��� ������ġ(begin, int end) -> �־��� ������ġ(begin)���� ��ġ(end)
	// ������ ���Ե� ���ڿ��� ��´�. �� ��, ������ġ�� ���ڴ� ������ ���Ե�����, �� ��ġ�� ���ڴ� ���Ե��� �ʴ´�.(begin <= x < end))
	
		// String s = "java.lang.Object";
		// String c = s.substring(10);
		// String p = s.substring(5,9);
		// c = "Object"
		// p = "lang"

	// String toLowerCase() - > �빮�ڸ� �ҹ��ڷ� 
	// String toUpperCase() - > �ҹ��ڸ� �빮�ڷ� 


	// String trim() -> ���ڿ��� ���� ��, ������ �� ������ ����. ���ڿ� �߰��� ������ �������� ����

		// String s = " Hello World ";
		// String s1 = s.trim();
		// s1 = "Hello World"


	// static String valueOf(boolean b)
	// static String valueOf(char c)
	// static String valueOf(int i)
	// static String valueOf(long l)
	// static String valueOf(float f)
	// static String valueOf(double d)
	// static String valueOf(Object o) -> ������ ���� ���ڿ��� ��ȯ���� ��ȯ�Ѵ�. ���������� ��� toString()�� ȣ���� ����� ��ȯ.


public class Ex9_5_2 {

	

}
