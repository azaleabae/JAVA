package ch06;

class Ex6_8_3 {
	
	// �������(cv,iv)�� �ʱ�ȭ - static {} 
}

class StaticBlockTest{
	static int[] arr = new int[10]; // ����� �ʱ�ȭ = ���� �ʱ�ȭ
	// arr -> cv
	
//	static { // Ŭ���� �ʱ�ȭ �� = cv ���� �ʱ�ȭ -> �迭 arr�� ������ ä���.
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//		}
//	}
	
	// Ŭ���� ���� �ʱ�ȭ ����: Ŭ������ ó�� �ε��� �� �� �ѹ� - > �޸𸮿� �ö󰥶�
	// �ν��Ͻ� ���� �ʱ�ȭ ����: �ν��Ͻ��� ������ �� ����
	
	// �ʱ�ȭ ���� 
	// cv -> iv
	// �ڵ� -> ���� -> ����(staic{}, ������)
	
}
