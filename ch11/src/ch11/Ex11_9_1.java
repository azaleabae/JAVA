package ch11;

// HashMap과 Hashtable - 순서x, 중복(키x,값o)

	// Map인터페이스를 구현. 데이터를 키와 값의 상으로 저장
	// HashMap(동기화x은 Hashtable(동기화o)의 신버전

	// HashMap
	// Map인터페이스를 구현한 대표적인 컬렉션 클래스
	// 순서를 유지하려면, LimledHashMap클래스를 사용하면 된다.
	
	// TreeMap
	// 범위 검색과 정렬에 유리한 컬렉션 클래스
	// HashMap보다 데이터 추가, 삭제에 시간이 더 걸림 (비교 저장)


// HashMap의 키(key)와 값(value)

	// 해싱 기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
	// Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		// 키(key) 컬렉션 내의 키(key) 중에서 유일해야 한다.
		// 값(value) 키(key)와 달리 데이터의 중복을 허용한다.


// 해싱(hashing) 
	// 해시 함수로 해시테이블에 데이터를 저장, 검색
		// Object.hash()

	// 해시테이블은 배열과 링크드 리스트가 조홥된 형태

	// 해시테이블에 저장된 데이터를 가져오는 과정
		// 키로 해시함수를 호출해서 해시코드를 얻는다.
		// 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾는다.
		// 링크드리스트에서 키와 일치하는 데이터를 찾는다.
			// *해시 함수는 같은 키에 대해 항상 같은 해시코드를 바노한해야한다.
			//	서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.*


// HashMap - 주요 메서드

	// HashMap()
	// HashMap(initialCapacity)
	// HashMap(int initialCapacity, float loadFactor)
	// HashMap(Map m)

	// Object put(Object key, Object value)
	// void putAll(Map m)
	// Object remove(Object key)
	// Object replace(Object key, Object oldValue, Object newValue)

	
	// Set entrySet()
	// Set keySet()	
	// Collection values()


public class Ex11_9_1 {

}
