package ch08;

public class Ex8_1_3 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //���ܹ߻�! �Ʒ��� �پ�Ѱ� catch�� �Ѿ ���Ƿ� ArithmeticExecption(�������?)�� �߻���Ų��.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");	
		} catch (Exception e) {  // Exception -> ��� ������ �ְ����� ��� ����ó�� ���� ���⼭�� Arithmetic�� ������ ��� ���ܰ� ó����
			System.out.println("Exception");
		} //try - catch �� ��
		System.out.println(6);
	} // main �޼����� ��
} // ĳġ ���� ���� �־ �߻��� ������ catch �κи� ó���ϰ� try-catch ������ �������´�.
