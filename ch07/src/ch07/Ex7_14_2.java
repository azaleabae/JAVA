package ch07;

// ����Ŭ������ �����ڴ� ������ ��� ������ �����ڿ� ����

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv; // �ܺ�Ŭ������ private����� ���� �����ϴ�.
		int iiv2 = outerCv;
	}

	static class StaticInner {
//			����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//			int siv = outerIv;
		static int scv = outerCv;

	}

	void myMethod() {
		final int lv = 0; // ���� �ٲ��� �ʴ� ������ ����� ����
		final int LV = 0; // JDK1.8���� final ���� ����

		class localInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ�Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
			int liv3 = lv; // ����!!!(jdk 1.8���� ���� �ƴ�)
			int liv4 = LV; // OK
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}
