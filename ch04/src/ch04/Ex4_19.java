package ch04;

public class Ex4_19 {

	public static void main(String[] args) {
		
		// �ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ����� �ִ�.
		// ������ ������ 2�ܿ��� 2*7 ������ ��� ����������
		
		loop1 : for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num<=9; num++ ) {
				if(num==8)
					break loop1;
				System.out.println(dan + "x" + num + "= " + (dan*num));
			}
			System.out.println();
		}
	}

}
