package ch04;

public class Ex4_16 {

	public static void main(String[] args) {
		// break��
		// �ڽ��� ���Ե� �ϳ��� �ݺ����� �����.

		// ���� �ݺ��� ����� 
		
		int sum = 0, i = 0;
		
		while(true) { // ���� ���̹Ƿ� ���� �ݺ�
			// for�� ���ѹݺ�
			// for(;;){}
			if(sum > 100)
				break;
			
			++i;
			sum = sum + i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
	}

}
