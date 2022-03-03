package ch12;

import javax.swing.Box;

// 지네릭 타입의 형변한
	// 지네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다.(경고 발생)
		// Box<Object> objBox = null;
		// Box box = (Box)objBox; // OK. 지네릭 타입 - > 원시타입 (경고 발생)
		// objBox = (Box<Object>)box; // OK. 원시타입 -> 지네릭 타입 (경고 발생)

	// 와일드 카드가 사용된 지네릭 타입으로는 형변환 가능


public class GenericType1 {
//	public static void main(String[] args) {
//		Box b = null;

// 		Box<STring> b = new Box<String>();	
//		b.add(new Integer(100));

//		Box<String>bStr = null;
//		
//		b = (Box)bStr; // Box<String> -> Box  가능 하지만 경고 메시지 출력
//		bStr = (Box<String>)b; // Box - Box<String> 가능 하지만 경고 메시지 출력
//				
//	}

}
