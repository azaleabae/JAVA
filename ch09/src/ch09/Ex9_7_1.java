package ch09;

// StringBuffer 클래스

	// String처럼 문자형 배열(char[])을 내부적으로 가지고있다.
	// 그러나 String과 달리 내용을 변경할 수 있다.


// StringBuffer의 생성자

	// 배열은 길이 변경불가. 공간이 부족하면 새로운 배열 생성하여야 한다.
	// StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야 한다.

//	 public StringBuffer(int length){
//		value = new char[length];
//		 shred = false;
//	 }
//	 public StringBuffer() {
//		this()    -> 버퍼의 크기를 지정하지 않으면 버퍼의 크기는 16이 된다.
//	 }
//	 public StringBuffer(String str){
//		 this(str.length() + 16);  -> 지정한 문자열의 길이보다 16이 더 크게 버퍼를 생성한다.
//		 append(str);
//		}


// StringBuffer의 변경

	// Stringbuffer는 string과 달리 내용 변경이 가능하다.
	
		// StringBuffer sb = new StringBuffer("abc");
		// sb.append("123") // sb의 내용뒤에 "123"을 추가한다.

	// append()는 지정된 내용을  StringBuffer에 추가 후, StringBuffer의 참조를 반환

		// StringBuffer sb2 = sb.append("ZZ"); // sb의 내용뒤에 "ZZ"를 추가한다.
		// System.out.print(sb);	// abc123ZZ
		// System.out.println(sb2); // abc123ZZ


// StringBuffer의 비교

	//StringBuffer는 equals()가 오버라이딩되어있지 않다.(주소비교)

		// StringBuffer sb = new StringBuffer("abc");
		// StringBuffer sb2 = new StringBuffer("abc");

		// System.out.println(sb==sb2); // false
		// System.out.println(sb.equals(sb2)); //false 

	// StringBuffer을 String으로 변환 후에 equals()로 비교해야 한다.

		// String s = sb.toString(); // sb를 String으로 변환
		// String s2 = sb2.toString(s2); 

		//System.out.pritln(s.equlas(s2));


public class Ex9_7_1 {

	

}
