package ch03;

public class Ex3_7 {

	public static void main(String[] args) {
		// ����ȯ ������
		
		double d = 85.4;
		int score = (int)d;
		//int score = (int)85.4
		//int�� �Ҽ����� ���� �������� score�� 85�� �ȴ� 
		//int score = 85
		// �ٵ� d�� �Ȱ��� 85.4 �ֳĸ� d�� (int)�� �о� �°��� d ��ü�� �ٲ۰� �ƴϱ� ����
		
		// ������ 8byte�� int�� 4byte�� ������ �ȵ�
		// �̶� d �տ� (int)�� �ٿ��༭ ���������� d�� integer 
		// �������� ��ȯ ���� ���� ���ش�.
		
		
		System.out.println(d);
		System.out.println(score);
		
		
		int ch = 'A';
		
		System.out.println(ch);
		//��ǻ�ʹ� ���ڸ� �״�� ������ �� ���� ������ ���ڷ� ��ȯ���� ������ �̷��� ���ڵ��� �����ڵ��� �θ�
		//���⼭ A�� 2���� 65�� ġȯ�Ǽ� ��ǻ�Ϳ� �����
		
		float F = (int)1.6f;
		System.out.println(F);
		// �Ǽ��� int�� ����ȯ �Ҷ� �Ҽ��� ���ϴ� �ݿø� ���� �ʴ´�.
		
		
		

	}

}
