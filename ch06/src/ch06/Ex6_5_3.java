package ch06;

class Ex6_5_3 {
	
	// �ν��Ͻ� �޼���
	// �ν��Ͻ� ���� ��,'��������.�޼����̸�()'���� ȣ��
	// �ν��Ͻ� ���(iv,im)�� ���õ� �۾� �ϴ� �޼���
	// �޼��� ������ �ν��Ͻ� ����(iv) ��밡��
	
	
	// static �޼���(Ŭ�����޼���)
	// ��ü �������� 'Ŭ�����̸�.�޼����̸�()'���� ȣ��    ex) math.random() 
	// �ν��Ͻ� ���(iv, im(instance method))�� ���þ��� �۾��� �ϴ� �޼���
	// �޼��� ������ �ν��Ͻ� ����(iv) ��� �Ұ�
	
	
	long a, b;
	
	long add() { // �ν��Ͻ� �޼���
		return a + b;
	}
	
	static long add(long a, long b) {  // Ŭ���� �޼���(static �޼���)
		return a+b;
	}
	
	//  static�� ���� ����ϴ°�
	// ������ �������� �Ӽ��鿡�� ���
	// iv(�ν��Ͻ� ����),im(�ν��Ͻ� �޼���)�� ������� �ʴ� �͵鿡�� ���
	

}