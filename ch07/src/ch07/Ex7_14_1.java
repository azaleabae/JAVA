package ch07;


// ���� Ŭ����
	
	// ���� Ŭ������ ������ ��ȿ���� scope�� ������ ����

class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{
		void method() {
			AAA a = new AAA();
			System.out.println(a.i);
			System.out.println(i); // ��ü �������� �ܺ�Ŭ������ ��� ���ٰ���
		}
	}
}

class CCC{
//	BBB b = new BBB // class b �� a�� ���� Ŭ������ �Ǿ������� ������ ���� Ŭ���� c������ ����Ҽ� ����(����� �ֱ���)
}
public class Ex7_14_1 {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}

}
