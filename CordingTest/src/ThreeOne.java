import java.util.Random;
import java.util.Scanner;

public class ThreeOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����Ų��� ���̿� ����");
		System.out.println("��ǻ���� �������� ���۵˴ϴ�.");
		System.out.println("*1~3���� �Է� �Ͻ� �� �ֽ��ϴ�.*");
		

		Random r = new Random();
		int com = 0;
		int callcount = 0;

		while (callcount < 31) {

			if (callcount <= 26) {
				com = r.nextInt(3) + 1;
				callcount += com;
			} else if (callcount == 27) {
				com = 3;
				callcount += com;
				System.out.println("Com�� " + com + "�� �θ��ϴ�. Com�� �¸�!");
				break;

			} else if (callcount == 28) {
				com = 2;
				callcount += com;
				System.out.println("Com�� " + com + "�� �θ��ϴ�. Com�� �¸�!");
				break;

			} else if (callcount == 29) {
				com = 1;
				callcount += com;
				System.out.println("Com�� " + com + "�� �θ��ϴ�. Com�� �¸�!");
				break;
			
			} else if (callcount == 30) {
				System.out.println("Player�� �¸��߽��ϴ�. ���ϵ帳�ϴ�!");
				break;
			}
			
			System.out.println("Com�� " + com + "��ŭ ������׽��ϴ�.");
			System.out.println("���� ������ ���ڴ�" + callcount + "�Դϴ�.");
			System.out.println();
			callcount += sc.nextInt();
			System.out.println("���� ������ ���ڴ�" + callcount + "�Դϴ�.");
			

		}
	}
}
