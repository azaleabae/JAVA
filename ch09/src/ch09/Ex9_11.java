package ch09;

import java.util.ArrayList;

// 오토박싱 & 언박싱
	
	// int라는 기본형이 wrapper 클래스인 Integer로 바꿔즈는게 오토박싱
	// 반대는 언박싱

public class Ex9_11 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(new Integer(100)); // list에는 객체만 추가가능 그래서 이렇게 형변환을 해줘야 했는데 
		// jdk 1.5 이후로 아랫줄 코드처럼 편하게 쓸수 있도록 바뀌었다.
		list.add(100); // JDK 1.5 이전에는 에러.
		
//		Integer i = list.get(0); // list에 저장된 첫번째 
//		int i = list.get(0).intValue(0); // intValue()로 Integer를 int로 변환
		int i = list.get(0); // intValue()fh Integer를 int로 변환
	}

}
