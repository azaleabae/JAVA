package ch07;

public class Ex7_11 {

// 추상 클래스 
	
	// 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
	// 미완성 메서드. 구현부(몸통),{ } 가 없는 메서드
	
	// 기본형
	// abstract 리턴타입 메서드이름();  	
}

abstract class Player2 { // 추상 클래스
	abstract void play(int pos); // 추상 메서드
	abstract void stop(); //추상메서드
}


class AudioPlaye2r extends Player2{ 
	void play(int pos) {} // 추상 메서드를 구현
	void stop() {}//추상메서드를 구현
}

abstract class abstractPlayer2 extends Player2{
	void play(int pos) {}
	// Player의 메서드중에 하나만 구현했기 때문에 abstract 를 class 앞에 붙여줘야함 아니면 오류
	// 코드로는 보이지 않지만 실제로는 abstract void stop(); 있음 그래서 둘다 구현을 해줘야 abstract를 제외할 수 있다.
}
