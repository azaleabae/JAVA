package ch14;

//�Լ��� �������̽�
	//�Լ��� �������̽� - �� �ϳ��� �߻� �޼��常 ����� �������̽�
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
	int value = f.max(3, 5); // interface�� max�� ���������� ok
} 

interface MyFunction2{
	public abstract int max(int a, int b);
}
