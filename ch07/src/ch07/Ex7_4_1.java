package ch07;

class Ex7_4_1 {
	// �������� super
	
	// ���� �ڽ��� ����Ű�� ��������. �ν��Ͻ� �޼���(������)������ ���� (this. �� �Ȱ��� static �޼��忡���� ����)
	// ������ ����� �ڽ��� ����� �����Ҷ� ���
	
	// ������ super()
	
	// ������ �����ڸ� ȣ���� �� ���
	// ������ ����� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ
}

class CRSuper{
	int x, y;
	
	CRSuper(int x, int y){
		this.x = x; //iv�ʱ�ȭ
		this.y = y; //iv�ʱ�ȭ
		
	}
}

class CRSuper2 extends CRSuper{
	int z;
	
//	CRSuper2(int x, int y, int z){
//		this.x = x;
//		this.y = y;
//		this.z = z;
//		
//	}
	
	CRSuper2(int x, int y, int z){
		super(x, y); // ����Ŭ������ ������ CRSuper(int x , int y)�� ȣ��
		this.z = z; // �ڽ��� ����� �ʱ�ȭ
	}
	
}