package ch07;


// ���������� ����ȯ
	
	// ����� �� �ִ� ����� ������ �����ϴ� ��
	// �� ��ü�� �ٲ�°� �ƴ�
	// ���� �ڼ� ������ ���������� ���� ����ȯ ����
	// �θ� �ڽİ����� ���������� �������迡���� �Ұ���

		class Car {}
		class FireEngine extends Car{}
		class Ambulance extends Car{}
	
		class CarTest1{
		FireEngine f = new FireEngine();
		
		Car c = (Car)f; // ������ CarŸ������ ����ȯ(��������)
		FireEngine f2 = (FireEngine)c; // �ڼ��� FireEngineŸ������ ����ȯ(�����Ұ�)
		//Ambulance a = (Ambulance)f; // ����. ��Ӱ��谡 �ƴ� Ŭ���� ���� ����ȯ �Ұ� (����)
		}
		

