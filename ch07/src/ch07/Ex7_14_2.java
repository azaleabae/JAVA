package ch07;

// 내부클래스의 제어자는 변수에 사용 가능한 제어자와 동일

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv; // 외부클래스의 private멤버도 접근 가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner {
//			스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//			int siv = outerIv;
		static int scv = outerCv;

	}

	void myMethod() {
		final int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
		final int LV = 0; // JDK1.8부터 final 생략 가능

		class localInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv; // 에러!!!(jdk 1.8부터 에러 아님)
			int liv4 = LV; // OK
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}
