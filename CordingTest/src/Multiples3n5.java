// 1000������ 3�� 5�� ����� ���ؼ� ��� ���ϱ� 

public class Multiples3n5 {
	
	public static void main(String[] args) {

		int i = 0, sum = 0;
		
		for(i = 0; i<1000; i++) {
			if( i % 3 == 0 || i % 5 == 0) {
//				sum = sum + i;
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
