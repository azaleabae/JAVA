package ch07;

class Ex7_7_3{
	public static void main(String[] args) {
		
		Cars cars = null;
		FireEngines fe = new FireEngines();
		
		FireEngines fe2 = (FireEngines)cars; // ���� -> �ڼ����� ����ȯ
		Cars cars2 = (Cars)fe2; // �ڼ� - > �������� ����ȯ
		
//		cars = fe; // cars = (cars)fe2;���� ����ȯ�� ������
//		cars.water(); // �ڽ��� �ҹ������� �� �Ѹ��±���� ������ �θ��� Car�� �������� car������ ��� ����
		
		
		
	}
}

class Cars{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive BBo~ang");
	}
	void stop() {
		System.out.println("break!");
	}
	
}

class FireEngines extends Cars{
	void water() {
		System.out.println("Pushshshshshshshshsh");
	}
}