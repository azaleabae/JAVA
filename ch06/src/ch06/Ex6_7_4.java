package ch06;

class Ex6_7_4{
	// �������� this 
	// ������ this�ʹ� �ƿ� �ٸ��ϱ� ������� ������ ��
	
	// �ν��Ͻ� �ڽ��� ����Ű�� ��������
	// �ν��Ͻ� �޼���(������ ����)���� ��밡��
	// ��������(lv)�� �ν��Ͻ� ����(iv)�� ������ �� ���

}

class Car1{
	
	String color;
	String gear;
	int door;
	
//	Car1(String c, String g, int d){
//		
//
//		color�� iv(�ν��Ͻ� ����), c�� lv(��������)
//		color = c;
//		gear = g;
//		door = d;
//
//	}
	
	Car1(String color, String gear, int door){
		//this.color�� iv, color�� lv
		this.color = color;
		this.gear = gear;
		this.door = door;
		// iv�� lv�� �����ϱ� ���ؼ� this���
	}

}