import java.util.ArrayList;
import java.util.Scanner;

public class Memo{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�԰��Է��� ��¥�� �������ּ��� 1��~31��");
		int day = scan.nextInt()-1; // 0~30���ϱ� �Է¹��� ���� ������ 1�� ��
		
		
		System.out.println("�԰�� ������ ������ �̿��� �Է����ֽʽÿ�");
		int num = scan.nextInt();
		
		ArrayList<Integer> daylist = new ArrayList<Integer>(31);
		for(int i = 0; i < 31; i++) {
			daylist.add(i, 0);
		} // ArrayList Ư�� ������ 31���� �迭�� ���� �̸� 0���� �־���
		
		daylist.set(day,num); // �Է� ���� ��¥(day)�� �Է¹��� ����(num)�� ����
		
		
		int sum = 0; // ����
		int arraysize = daylist.size();
		

		// �� �� �� ��
		for (int all = 0; all < arraysize; all++) {
			sum += daylist.get(all);  // �迭���� ��� ���� ���ϱ�
		}
		
		long inMonth = sum;
		long dfItem = inMonth / 1000; // �ҷ� defective items 1000�� �߿� �ϳ��÷� �ҷ��߻�
		long item = 10000; // �ܿ�
		long total = inMonth + dfItem + item; // �ҷ� ���� ���� �ܿ���

		// �� �� �� ��
		loop: while (true) {

			System.out.println("���� ���� ������ �����Ͻʽÿ�(0~3)");
			System.out.println("0. ���α׷� ����");
			System.out.println("1. �� �԰� ��Ȳ");
			System.out.println("2. �ҷ� ����");
			System.out.println("3. ��ü ����");

			int choose = scan.nextInt();

			while (0 <= choose && choose <= 3) { // ���� �Է��� ���� 1���� ũ�ų� ���� 3���� �۰ų� ������
				if (choose == 0) {
					System.out.println("���α׷��� ���� �˴ϴ�.");

				} else if (choose == 1) {
					System.out.println("���� �԰�� ������" + inMonth + "�� �Դϴ�.");

					System.out.println("��� �����Ϸ��� 1, �ƴ϶�� 2�� �����ּ���.");

					int choose2 = scan.nextInt();

					if (choose2 == 1) {

						continue loop;

					} else if (choose2 == 2) {

						break loop;

					}

				} else if (choose == 2) {
					System.out.println("���� �ҷ�������" + dfItem + "�Դϴ�.");

				} else if (choose == 3) {
					System.out.println("���� ��ü �ܿ�������" + total + "�Դϴ�.");

				}

				break loop;
			} // while2 ��
			if (0 < choose || choose > 3) { // 1���� �۰ų� 3���� ū ���� �Է��ϸ� ������ �޽���
				System.out.println("1~3������ ���ڸ� �Է°����մϴ�. �ùٸ� ���� �Է��� �ֽʽÿ�.");
				System.out.println("/////////////////////////////////////////////");
				System.out.println("");

			}
			continue;
		} // while 1 ��

		
	}
}