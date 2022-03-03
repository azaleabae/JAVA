package ch12;

// 지네릭 타입의 제거
	// 컴파일러는 지네릭 타입을 제거하고, 필요한 곳에 형변환을 넣는다.
		// 1. 지네릭 타입의 경계(bound)를 제거
		// 2. 지네릭 타입 제거 후에 타입이 불일치하면 형변환을 추가
		// 3. 와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가


// 열거형(enum)
	// 관련된 상수들을 같이 묶어 놓은것. java는 타입에 안전한 열거형을 제공

	// 열거형을 정의하는 방법
		// enum 열거형 이름{상수명1, 상수명2, ...}
		// eunm Direction{EAST, SOUTH, WEST, NORTh}

	// 열거형 타입의 변수를 선언하고 사용하는 방법
		// class unit{
			// int x,y;	// 유닛의 위치
			// Direction dir;	// 열거형 인스턴스 변수를 선언

			// void init() {
				// dir = Direction.EAST; // 유닛의 방향을 EAST로 초기화
			// }
		// }
	// 열거형 상수의 비교에 ==와 compareTo() 사용가능
		// if(dir == Direction.EAST){
			// x++;
		// }else if(dir > Direction.WEST){ // 에러 열거형 사웃에 비교연산자 사용불가
			// ...
		// }else if (dir.compareTo(Direction.WEST) > 0) { // compareTo()는 사용가능
		// }
	
public class GenericType2 {

}
