package ch09;

// String 클래스의 생성자와 메서드

	// String(char[] value) - > 주어진 문자열을 갖는 String 인스턴스를 생성한다.
		
		// char[] c = {'H','e','l','l','o'}
		// String s = new String(c);
		// s = "Hello"
		// String 에서 char[]로 바꿀때는 toCharArray 메서드를 씀
	
	
	// String(StringBuffer buf) -> StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
		
		// 내용 변경 가능한 문자열
		// StingBuffer sb = new StringBuffer("Hello");
		// String s = new String(sb);
		// s = "hello"
		

	// char charAt(int index) -> 지정된 위치에 있는 문자하나를 반환한다.(index는 배열이니까 0부터 시작)
	
		// String s = "Hello"
		// char c = s.charAt(1);
		// c = 'e'
	

	// int compareTo(String str) -> 문자열(str)과 사전순서로 비교한다. 같으면 0을, 사전순으로 이전이면 음수를, 이후면 양수

		// int i = "aaa".compareTo("aaa"); 
		// int i2 = "aaa".compareTo("bbb");
		// int i3 = "bbb".compareTo("aaa");
		// i = 0
		// i2 = -1
		// i3 = 1


	// String concat(String str) -> 문자열(str)을 덧붙인다. 
		
		// String s = "Hello";
		// String s = s.concat(" World");
		// s2 = "Hello World"

	
	// boolean contains(CharSequence s) -> 지정된 문자열(s)이 포함되었는지 검사한다.
		
		// String s = "abcdefg";
		// Boolean b = s.contains("bc");
		// b = true ->"abcdefg"에  b가 포함되었음으로 true

	
	// boolean endsWith(String suffix) -> 지정된 문자열(suffix)로 끝나는지 검사한다.

		// String file = "Hello.txt";
		// boolean b = file.ensWith("txt");
		// b = true

	
	// boolean equals(object obj)-> 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. 
	// obj가 String이 아니거나 문자열이 다르면 false를 반환

		// String s = "Hello";
		// boolean b = s.equals("Hello");
		// boolean b2 = s.equals("hello")
		// b = ture
		// b2 = false (대소문자 구별하는듯?)


	// boolean equalsIgnoreCase(String str) -> 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.

		// String s = "Hello";
		// boolean b = s.equalsIgnoreCase("HELLO");
		// boolean b2 = s.equalsIgnoreCase("heLLo");
		// b = true
		// b2 = ture


	// int indexOf(int ch) -> 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다(index는 0부터)

		// String s = "Hello";
		// int idx1= s. indexOf('o');
		// int idx2 = s.indexOf('k');
		// idx1 = 4  -> 'o' 가 5번째니까 배열처럼 -1 해서 4
		// idx2 = -1 -> 업으니까 -1



	// int indexOf(int ch, int pos) -> 위랑 나머지는 모두 같은데 찾기를 시작하는 지점을 정해줄 수 있음

		// String s = "Hello";
		// int idx1= s.indexOf('e' , 0);
		// int idx2 = s.indexOf('e' , 2);
		// idx1 = 1
		// idx2 = -1  ->  2번은 hello 중에 L 부터 찾기 시작해서 끝까지 보는데 'e' 가 존재하지 않음으로 -1을 리턴

	
	// int indexOf(String str) -> 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 
	// 없으면 -1을 반환한다.(index는 0 부터 시작) 반환은 가장 앞에있는 index값을 해준다.

		// String s = "ABCDEFG";
		// int idx = s.indexOf("CD");
		// idx = 2  -> 찾는 값 'CD' 중에 C가 배열 2번에 위치 함으로 2를 리턴

	
	// int lastIndexOf(int ch) -> 그냥 indexOf랑 똑같은데 배열의 끝부분 부터 찾기 시작함 배열의 주소 값을 리턴함 못찾으면 -1 반환


	// int lastIndexOf(String str) - > 동일한데 이것도 문자열 끝부터 찾기 시작해서  값을 알려줌 
	// index 값은 값중에 가장 숫자가 적은것을 리턴함(5~8에서 값을 찾았다면 5를 리턴) 못찾으면 -1 


	// int length() -> 문자열의 길이를 알려준다. 

		// String s = "Hello";
		// int length = s.length();
		// length = 5


	// String[] split(String regex) -> 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.

		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",")
		// arr[0] = "dog"
		// arr[1] = "cat"
		// arr[2] = "bear"

	
	// String[] split(String regex, int limit) -> 문자열을 지정된 분리자로 나누어 문자배열에 담아 반환. 
	//	단, 문자열 전체를 지정된 수(limit)로 자른다. (두 부분이나 세 부분 같이)

		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",",2); 
		// arr[0] = "dog" 
		// arr[1] = "cat, bear"
	
	// boolean startsWith(String prefix) -> 주어진 문자열(prefix)로 시작하는지 검사한다.

		// String s= "java.lang.Object"; 
		// boolean b = s.startsWith("java);
		// boolean b2 = s.startsWith("lang"); 
		// b = true
		// b2 = false

	
	// String substring(int begin))
	// String substring(int begin, int end) - >주어진 시작위치(begin, int end) -> 주어진 시작위치(begin)부터 위치(end)
	// 범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.(begin <= x < end))
	
		// String s = "java.lang.Object";
		// String c = s.substring(10);
		// String p = s.substring(5,9);
		// c = "Object"
		// p = "lang"

	// String toLowerCase() - > 대문자를 소문자로 
	// String toUpperCase() - > 소문자를 대문자로 


	// String trim() -> 문자열의 왼쪽 끝, 오른쪽 끝 공백을 없앰. 문자열 중간의 공백은 제거하지 않음

		// String s = " Hello World ";
		// String s1 = s.trim();
		// s1 = "Hello World"


	// static String valueOf(boolean b)
	// static String valueOf(char c)
	// static String valueOf(int i)
	// static String valueOf(long l)
	// static String valueOf(float f)
	// static String valueOf(double d)
	// static String valueOf(Object o) -> 지정된 값을 문자열로 변환한후 반환한다. 참조변수의 경우 toString()을 호출한 결과를 반환.


public class Ex9_5_2 {

	

}
