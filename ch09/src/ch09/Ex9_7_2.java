package ch09;

// StringBuffer의 생성자와 메서드

	// StringBuffer() -> 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다. 

		// StringBuffer sb = new StringBuffer();
		// sb = ""

	
	// StringBuffer(int length) -> 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 STringBuffer인스턴스를 생성한다.

		// StringBuffer sb = new StringBuffer(10);
		// sb = ""

	// StringBuffer(String str) -> 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 생성한다. 

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
	// StringBuffer append(String str)  -> 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.

		// StringBuffer sb = new StringBuffer("abc")
		// StringBuffer sb2 = sb.append(true);
		// sb.append('d').append(10.0f);
		// StringBuffer sb3 = sb.append("ABC")
		// 						.append(123);
		// sb = "abctrued10.0ABC123"
		// sb2 = "abctrued10.0ABC123"
		// sb3 = "abctrued10.0ABC123"

	// int capacity()  -> StringBuffer인스턴스의 버퍼크기(char[])를 알려준다. length()는 버퍼에 담긴 문자열의 길이를 알려준다.
		
		// StringBuffer sb = new StringBuffer(100);
		// sb.append("abcd");
		// int buffuerSize = sb.capacity();
		// int stringSize = sb.length();
		// bufferSize = 100
		// stringSize = 4(sb문에 담긴 문자열이 "abcd" 이므로)

	// char charAt(int index)  --> 지정된 위치(index)에 있는 문자를 반환한다.

		// StringBuffer sb =new StringBuffer("abc");
		// char c = sb.charAt(2);
		// c = 'c'

	// StringBuffer delete(int start, int end)  -> 시작위치부터 끝 위치 사이에 있는 문자를 제거한다. 단, 끝 위치의 문자는 제외
	
		// StringBuffer sb = new StringBuffer("0123456");
		// StringBuffer sb2 = sb.delete(3,6);
		// sb = "0126"
		// sb2 = "0126"
	
	// StringBuffer deleteCharAt(int index)  -> 지정된 위치(index)의 문자를 제거한다.

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
	// StringBuffer insert(int pos, String str)  -> 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다.
	// pos는 0부터 시작

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.insert(4,'.'); // 4번째뒤에 . 을 추가
		// sb = "0123.456"

	
	// int length()  -> StringBuffer인스턴스에 저장되어 있는 문자열의 길이를 반환한다.

		// StringBuffer sb = new StringBuffer("0123456");
		// int length = sb. length();
		// length = 7

	
	// StringBuffer replace(int start, int end, String str) -> 지정된 범위의 문자들을 주어진 문자열로 바꾼다. 
	// end위치의 문자는 범위에 포함 되지 않음

		// StringBuffer sb = new StringBuffer("0123456")
		// sb.replace(3, 6, "AB");
		// sb = "012AB6"  - > "345"가 "AB"로 바뀜
 	
	
	// StringBuffer reverse() -> StringBuffer

		// StringBuffer sb = new StringBuffer("0123456")
		// sb.reverse();
		// sb = "6543210"

	
	// void setCharAt(int index, char ch)  -> 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.setCharAt(5, 'o');
		// sb = "1234o6"

	
	// void setLength(int newLength)  -> 지정된 길이로 문자열의 길이를 변경한다. 
	// 길이를 늘리는 경우에 나머지 빈 공간을 널문자'\u0000'로 채운다.

		// StringBuffer sb = new StringBuffer("0123456");
		// sb.setLength(5);
		// StringBuffer sb2 = new StringBuffer("0123456");
		// sb2.setLength(10);
		// String str = sb2.toString().trim();
		// sb = "01234"
		// sb2 = "0123456	"
		// str = "0123456"

	
	// String toString()  -> // StringBuffer인스턴스의 문자열을 STring으로 반환 
		
		// StringBuffer sb = new StringBuffer("0123456");
		// String str = sb.toString();
		// String str = "0123456"
		
	// String substring(int start)
	// String substring(int start, int end)  -> 지정된 범위 내의 문자열을 STring으로 뽑아서 반환한다. 
	// 시작위치(Start)만 지정하면 시작위치부터 문자열 끝까지 뽑아서 반환한다.  

		// StringBuffer sb = new StringBuffer("0123456");
		// String str = sb.substring(3);
		// String str2 = sb.substring(3, 5);
		// str = "3456"
		// str2 = "34"
		
		
		
	

public class Ex9_7_2 {

}
