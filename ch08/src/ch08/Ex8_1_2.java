package ch08;

public class Ex8_1_2 {
	public static void main(String[] args) {
// 예외 처리하기. try - catch 
		
		// 기본형식
//		try {
			// 예외가 발생할 가능성이 있는 문장들을 적는다.
//		} catch(Exception e1) {
//			// Exception1 가 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//		} catch(Exception e2) {
//			// Exception2 가 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//		} catch(Exception eN) {
//			// Exception3 가 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//		}
		
//		if문과 달리, try블럭이나 catch블럭 내에 포함된 문장이 하나뿐이어도 괄호{}를 생략할 수 없다.
		
		
		
		
		
		
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
		} // try - catch 끝
		System.out.println(5);
		
	}
}
