package ch14;

// �Լ��� �������̽� Ÿ���� �Ű�����

public class Lambda3 {

	void aMethod(MyFunction f) {
//		f.myMethod(); // MyFunction�� ���ǵ� �޼��� ȣ�� 
//		aMethod(() -> System.out.println("myMethod()"));
	}
	
}

//@FunctionalInterface
//interface MyFunction {
//	void myMethod();
//}


// �Լ��� �������̽� Ÿ���� ��ȯŸ��

// MyFunction myMethod() {
//	 MyFunction f = () -> {};
//	 return f;
// }  �ٿ�����


// MyFunction myMethod(){
// 		return () -> {};
// }