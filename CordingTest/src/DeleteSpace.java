import java.util.Scanner;

//���̹� ���ڼ����� �� Ư�� ���� ���ڸ� ���� ���α׷��� �Ϲ������� ������ ������ ���ڼ����� ���� ��ɵ� ������ �ִ�.
//��� ���ڿ��� �Է¹޾��� �� �ٹٲް� ������ ������ ���ڼ����� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
public class DeleteSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ������̳� �Է��Ͻʽÿ�.");
		String mj = sc.nextLine();
		int count = 0;
		
		for(int i=0; i<mj.length();i++) {
			if(mj.charAt(i) == ' ') {
				count++;
			}
		}
		int sum = mj.length() - count;
		System.out.println(sum);
	}

}
