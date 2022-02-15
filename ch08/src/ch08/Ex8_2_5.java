package ch08;

// 메서드에 예외 선언하기

	//예외를 처리하는 방법	
		// 직접처리 : try - catch
		// 예외 선언하기 : 예외 떠넘기기(알리기)

	//메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
	
	// 사용자 정의 예외 만들기
		//우리가 직접 예외 클래스를 정의할 수 있다.
		//조상은 Exception과 RuntimeException중에서 선택

	// 예외 되던지기
		//예외를 처리한 후에 다시 예외를 발생시키는 것
		// 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것

//연결된 예외(chained exception)
	// 한 예외가 다른 예외를 발생시킬 수 있다.
	// 예외 A가 예외 B를 발생시키면, A는 B의 원인 예외(cause exception)
		// 쓰는 이유1: 여러 예외를 하나로 묶어서 다루기 위해서
		// 쓰는 이유 : checked예외를 unchecked예외로 변경하려 할 때 

public class Ex8_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
