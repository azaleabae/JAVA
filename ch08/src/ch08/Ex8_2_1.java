package ch08;

public class Ex8_2_1 {
	
// printStackTrace()와 getMessage()
	
	// printStackTrace() 예외발생 당시의 호출스택(call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
	
	// getMessage() 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생 - 예외가 발생하면 예외 객체가 만들어 진다.
			System.out.println(4);	// 실행되지 않는다.
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		} //try-catch 끝
		System.out.println(6);
	} // main 끝
}
