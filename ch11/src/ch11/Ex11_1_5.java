package ch11;

// Map인터페이스 - 순서x , 중복(키x, 값ㅐ)

	// Map 인터페이스의 메서드

	// 추가 
		// Object put(Object key, Object value) - Map에 value객체를 key객체에 연결(mapping)하여 저장한다.
		// void putAll(Map t) - 지정된 Map의 모든 key- value쌍을 추가한다.

	// 삭제 
		// Object remove(Object key) - 지정한 key객체와 일치하는 key-value객체를 삭제한다.

	// 검색
		// boolean containsKey(Object key) - 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.
		// boolean contiansValue(Object value) - 지정된 value객체와 일치하는 Map의 value객체가 있는지 확인한다.
		// Object get(Object key) - 지정한 key객체에 대응하는 value객체를 찾아서 반환한다.

	// 읽기
		// Set entrySet() - Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환한다.
		// Set keySet() - Map에 저장된 모든 key객체를 반환한다.
		// Collection values() - MAp에 저장된 모든 value객체를 반환한다.

public class Ex11_1_5 {

}
