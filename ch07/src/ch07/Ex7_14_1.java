package ch07;


// 내부 클래스
	
	// 내부 클래스의 종류와 유효범위 scope는 변수와 동일

class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{
		void method() {
			AAA a = new AAA();
			System.out.println(a.i);
			System.out.println(i); // 객체 생성없이 외부클래스의 멤버 접근가능
		}
	}
}

class CCC{
//	BBB b = new BBB // class b 가 a의 내부 클래스가 되었음으로 연관이 없는 클래스 c에서는 사용할수 없음(방법이 있긴함)
}
public class Ex7_14_1 {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}

}
