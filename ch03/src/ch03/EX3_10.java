package ch03;

public class EX3_10 {

	public static void main(String[] args) {

		
		// ��� ��ȯ
		// ���� ���� �ǿ������� Ÿ���� ��ġ��Ű�� ��.
		
		// 1.�� �ս��� �ּ�ȭ �ϱ� ���ؼ� ���� ū������ ��ȯ��Ų��.
		// long + int -> long + long = long
		// float + int -> float + float = float
		
		//2.int���� ���� Ÿ���̸� int�� ��ȯ�ȴ�.
		// byte + short -> int + int = int
		// char + short -> int + int = int
		
		int a = 1_000_000;
		int b = 2_000_000;
		
//		long c = a * b; 
		// long���� ���� ���� ������ a�� b ��ü�� int�̱� ������ ��� ����� intŸ������ ��µ� �׷��� long���� ���� ����
		// ��������� a�� b�� long���� �� ��ȯ ����� �ȴ�. �׷� ���߿� �ϳ��� �ڵ����� long���� �� ��ȯ �Ǵϱ�.
		long c = (long)a * b; 
		
		System.out.println(c);
	}

}
