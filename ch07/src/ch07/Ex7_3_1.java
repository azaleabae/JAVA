package ch07;

class Ex7_3_1 {

// �������̵�
	
	// ��ӹ��� ������ �޼��带 �ڽſ� �°� �����ϴ� ��
	
	int x;
	int y;
	
	String getLocation() {
		return "x:" + x + ", y :" + y;
	}
}

class Point3D extends Ex7_3_1 {
	int z;
	
	String getLocation() {  // ������ getLocation()�� �������̵�
		return "x:" + x + ", y :" + y + ", z" + z;
	}
	
}
