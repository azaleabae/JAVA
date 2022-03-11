package ch14;

//함수형 인터페이스
	//함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
		// interface MyFunction{
			// public abstract int max(int a, int b);
		// }

//public class Lambda4 {
//	MyFunction f = new MyFunction() {
//		public int max(int a, int b) {
//			return a>b ? a:b;
//		}
//	};
//
//}


class LambdaEx1 {
	MyFunction2 f = (a,b) -> a>b ? a:b;
	int value = f.max(3, 5); // interface에 max가 존재함으로 ok
} 

interface MyFunction2{
	public abstract int max(int a, int b);
}
