import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {

		Random r = new Random();

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> dayList = new ArrayList<>();
		ArrayList<Integer> dayIn = new ArrayList<>();

		System.out.println("������ ��� ���� ���α׷�");

		while (true) {

			System.out.println("�Է��Ͻ� ���ڸ� �������ּ���.");
			int dayListSc = in.nextInt();
			dayList.add(dayListSc);

			if (dayListSc < 32) {
				System.out.println("�����Ͻ� ��¥��" + dayListSc + "�Դϴ�. ������ �Է����ּ���.");
				int dayInSc = in.nextInt();
				dayIn.add(dayInSc);

				int month = 0;
				for (int i = 0; i < dayIn.size(); i++) {
					month += dayIn.get(i);
				}
				int Rnum = r.nextInt(2) + 1;
				int error = (month / 1000) + Rnum;
				int total = month + error;

				System.out.println(dayListSc + "�Ͽ� �Է��Ͻ� ������ " + dayInSc + "�Դϴ�.");
				System.out.println("");

				System.out.println("�׸��� �������ּ���.");
				System.out.println("0. ���α׷� ����");
				System.out.println("1. �߰��Է�");
				System.out.println("2. �ҷ���ǰ��");
				System.out.println("3. �̹��޿� �԰�� ��ǰ��");
				System.out.println("4. �ҷ��� ������ ��� ��ǰ��");
				int choice = in.nextInt();

				if (choice == 0) {
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				} else if (choice == 1) {
					System.out.println("�߰��Է��� �����ϼ̽��ϴ�. ���ڼ������� ���ư��ϴ�.");
					System.out.println();
					continue;
				} else if (choice == 2) {
					System.out.println("���� �ҷ� ��ǰ����" + error + "�� �Դϴ�.");
					System.out.println();
					break;
				} else if (choice == 3) {
					System.out.println("�̹��޿� �԰�� ��ǰ�� ����" + month + "�� �Դϴ�.");
					System.out.println();
					break;
				} else if (choice == 4) {
					System.out.println("��� ��ǰ�� ����" + total + "�� �Դϴ�.");
					System.out.println();
					break;
				} else if (choice > 4) {
					System.out.println("4���� ū���� �Է� �ϼ̽��ϴ�. ���� �������� ���ư��ϴ�.");
					System.out.println();
					continue;
				}
			} else {
				System.out.println("���ڴ� 31���� Ŭ�� �����ϴ�. �ٽ� �Է��� �ּ���. �˸�û��");
				continue;
			}
		}
	}
}