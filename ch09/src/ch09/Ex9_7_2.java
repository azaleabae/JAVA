package ch09;

// StringBuffer�� �����ڿ� �޼���

	// StringBuffer() -> 16���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ�. 

		// StringBuffer sb = new StringBuffer();
		// sb = ""

	
	// StringBuffer(int length) -> ������ ������ ���ڸ� ���� �� �ִ� ���۸� ���� STringBuffer�ν��Ͻ��� �����Ѵ�.

		// StringBuffer sb = new StringBuffer(10);
		// sb = ""

	// StringBuffer(String str) -> ������ ���ڿ� ��(str)�� ���� StringBuffer �ν��Ͻ��� �����Ѵ�. 

		// StringBuffer sb = new StringBuffer("Hi")
		// sb = "Hi"

	// StringBuffer append(boolean b)
	// StringBuffer append(char c)
	// StringBuffer append(char[] str)
	// StringBuffer append(double d)
	// StringBuffer append(float f)
	// StringBuffer append(int i)
	// StringBuffer append(long l)
	// StringBuffer append(object obj)
	// StringBuffer append(String str)  -> �Ű������� �Էµ� ���� ���ڿ��� ��ȯ�Ͽ� StringBuffer�ν��Ͻ��� �����ϰ� �ִ� ���ڿ��� �ڿ� �����δ�.

		// StringBuffer sb = new StringBuffer("abc")
		// StringBuffer sb2 = sb.append(true);
		// sb.append('d').append(10.0f);
		// StringBuffer sb3 = sb.append("ABC")
		// 						.append(123);
		// sb = "abctrued10.0ABC123"
		// sb2 = "abctrued10.0ABC123"
		// sb3 = "abctrued10.0ABC123"

	// int capacity()  -> StringBuffer�ν��Ͻ��� ����ũ��(char[])�� �˷��ش�. length()�� ���ۿ� ��� ���ڿ��� ���̸� �˷��ش�.
		
		// StringBuffer sb = new StringBuffer(100);
		// sb.append("abcd");
		// int buffuerSize = sb.capacity();
		// int stringSize = sb.length();
		// bufferSize = 100
		// stringSize = 4(sb���� ��� ���ڿ��� "abcd" �̹Ƿ�)

	// char charAt(int index)  --> ������ ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.

		// StringBuffer sb =new StringBuffer("abc");
		// char c = sb.charAt(2);
		// c = 'c'

	// StringBuffer delete(int start, int end)  -> ������ġ���� �� ��ġ ���̿� �ִ� ���ڸ� �����Ѵ�. ��, �� ��ġ�� ���ڴ� ����
	
		// StringBuffer sb = new StringBuffer("0123456");
		// StringBuffer sb2 = sb.delete(3,6);
		// sb = "0126"
		// sb2 = "0126"
	
	// StringBuffer deleteCharAt(int index)  -> ������ ��ġ(index)�� ���ڸ� �����Ѵ�.

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.deleteCharAt(3);
		// sb  = "0123456"

	
	// StringBuffer insert(int pos, boolean b)
	// StringBuffer insert(int pos, char c)
	// StringBuffer insert(int pos, car[] str)
	// StringBuffer insert(int pos, double d )
	// StringBuffer insert(int pos, float f)
	// StringBuffer insert(int pos, int i)
	// StringBuffer insert(int pos, long l)
	// StringBuffer insert(int pos, Object obj)
	// StringBuffer insert(int pos, String str)  -> �� ��° �Ű������� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������ ��ġ(pos)�� �߰��Ѵ�.
	// pos�� 0���� ����

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.insert(4,'.'); // 4��°�ڿ� . �� �߰�
		// sb = "0123.456"

	
	// int length()  -> StringBuffer�ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ���̸� ��ȯ�Ѵ�.

		// StringBuffer sb = new StringBuffer("0123456");
		// int length = sb. length();
		// length = 7

	
	// StringBuffer replace(int start, int end, String str) -> ������ ������ ���ڵ��� �־��� ���ڿ��� �ٲ۴�. 
	// end��ġ�� ���ڴ� ������ ���� ���� ����

		// StringBuffer sb = new StringBuffer("0123456")
		// sb.replace(3, 6, "AB");
		// sb = "012AB6"  - > "345"�� "AB"�� �ٲ�
 	
	
	// StringBuffer reverse() -> StringBuffer

		// StringBuffer sb = new StringBuffer("0123456")
		// sb.reverse();
		// sb = "6543210"

	
	// void setCharAt(int index, char ch)  -> ������ ��ġ�� ���ڸ� �־��� ����(ch)�� �ٲ۴�.

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.setCharAt(5, 'o');
		// sb = "1234o6"

	
	// void setLength(int newLength)  -> ������ ���̷� ���ڿ��� ���̸� �����Ѵ�. 
	// ���̸� �ø��� ��쿡 ������ �� ������ �ι���'\u0000'�� ä���.

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.setLength(5);
		// StringBuffer sb2 = new StringBuffer("0123456");
		// sb2.setLength(10);
		// String str = sb2.toString().trim();
		// sb = "01234"
		// sb2 = "0123456	"
		// str = "0123456"

	
	// String toString()  -> // StringBuffer�ν��Ͻ��� ���ڿ��� STring���� ��ȯ 
		
		// StringBuffer sb = new StringBuffer("0123456");
		// String str = sb.toString();
		// String str = "0123456"
		
	// String substring(int start)
	// String substring(int start, int end)  -> ������ ���� ���� ���ڿ��� STring���� �̾Ƽ� ��ȯ�Ѵ�. 
	// ������ġ(Start)�� �����ϸ� ������ġ���� ���ڿ� ������ �̾Ƽ� ��ȯ�Ѵ�.  

		// StringBuffer sb = new StringBuffer("0123456");
		// String str = sb.substring(3);
		// String str2 = sb.substring(3, 5);
		// str = "3456"
		// str2 = "34"
		
		
		
	

public class Ex9_7_2 {

}
