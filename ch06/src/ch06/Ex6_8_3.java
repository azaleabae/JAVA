package ch06;

class Ex6_8_3 {
	
	// 멤버변수(cv,iv)의 초기화 - static {} 
}

class StaticBlockTest{
	static int[] arr = new int[10]; // 명시적 초기화 = 간단 초기화
	// arr -> cv
	
//	static { // 클래스 초기화 블럭 = cv 복잡 초기화 -> 배열 arr을 난수로 채운다.
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//		}
//	}
	
	// 클래스 변수 초기화 시점: 클래스가 처음 로딩될 때 단 한번 - > 메모리에 올라갈때
	// 인스턴스 변수 초기화 시점: 인스턴스가 생성될 때 마다
	
	// 초기화 순서 
	// cv -> iv
	// 자동 -> 간단 -> 복잡(staic{}, 생성자)
	
}
