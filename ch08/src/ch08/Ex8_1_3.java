package ch08;

public class Ex8_1_3 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생! 아랫줄 뛰어넘고 catch로 넘어감 고의로 ArithmeticExecption(산수오류?)을 발생시킨다.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");	
		} catch (Exception e) {  // Exception -> 모든 예외의 최고조상 모든 예외처리 가능 여기서는 Arithmetic을 제외한 모든 예외가 처리됨
			System.out.println("Exception");
		} //try - catch 의 끝
		System.out.println(6);
	} // main 메서드의 끝
} // 캐치 블럭이 많이 있어도 발생한 예외의 catch 부분만 처리하고 try-catch 구문을 빠져나온다.
