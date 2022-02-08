package ch07;

public class Ex7_8_1 {

// instanceof ������
	
	// ���������� ����ȯ ���ɿ��� Ȯ�ο� ���. �����ϸ� true�� ��ȯ
	// ����ȯ ���� �ݵ�� instanceof�� Ȯ���ؾ� ��
	
	// ����ȯ�� �ϴ� ������ �ν��Ͻ��� ���� ����� ��� ����Ϸ��� �ϱ� �����ε� 
	// �� �ڵ忡�� ���Ű��� �θ� Ŭ������ car�� water����� ����� �� ���� ������ 
	// �Ʒ��� �ڵ忡�� c��� �������� FireEngine Ÿ������ �ٲ��ش�. 
	
	void doWork(Car c) {
		if(c instanceof FireEngine) {  // ����ȯ�� �������� Ȯ��
			
			FireEngine fe = (FireEngine)c;  // ����ȯ
			fe.water();
			
			System.out.println(fe instanceof Object); //true
			System.out.println(fe instanceof Car);// true
			System.out.println(fe instanceof FireEngine);// ture
			
			
		}
		
	}
	
}
