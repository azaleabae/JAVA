package ch03;

public class Ex3_11 {

	public static void main(String[] args) {

		
		// �ݿø�
		// Math.round() �޼��带 ����Ͽ� �Ǽ��� �Ҽ��� ù °�ڸ����� �ݿø� ��Ŵ
		long result = Math.round(1.53);
		
		System.out.println(result);
		
		double pi = 3.141592;
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		
//										int	    int		
		System.out.println(Math.round(pi*1000)/1000);
		
//										int    �����̳� �÷�Ʈ				
		System.out.println(Math.round(pi*1000)/1000.0);
		
		
//		�ݿø� ���� ����ϱ�
		System.out.println(pi*1000);
		System.out.println((int)pi*1000/1000.0);
		
		
		
	}

}
