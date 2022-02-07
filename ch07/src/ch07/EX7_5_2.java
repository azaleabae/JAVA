package ch07;

import static java.lang.Integer.*; // integer클래스의 모든 static 메서드 생략가능
import static java.lang.Math.random; // math.random()메서드만 생략가능 괄호는 안붙임  System.out.println(PI)<- 앞에 Math 생략
import static java.lang.System.out; // System.out 을 out만 써주면됨 out.println(PI)

public class EX7_5_2 {
	// import문 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
	// 컴파일러에게 클래스가 속한 패키지를 알려준다.
	// import java.util.Date;
	
	// class importTest{
	// Date today = new Date();
	// 위 코드에서 Date 앞에는 사실 java.util이 붙어야하는데 import 해줘서 안써도됨

	// java.lang 패키지의 클래스는 import하지 않고도 사용할 수 있다.
	// ^^^^
	// String, Object, System, Thread 등등이 속해있음
	
	// static import문
	
	// static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
}
