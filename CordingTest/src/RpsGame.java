import java.util.Random;
import java.util.Scanner;

//����� �Է°� random�Լ��� ����Ͽ�, �����(User)�� ��ǻ�Ͱ� ����ϴ� ���� ���� �� ������ ������.
//
//�Է�: [���ڿ�] "����", "����" Ȥ�� "��" ���: [���ڿ�] ��� ��ȯ
public class RpsGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int Rnum = r.nextInt(3) + 1;
		String com = "";
		int user = 0;
		System.out.println("����,����,���߿� �ϳ��� �Է��ϼ���.");
		String input = sc.next();

		// user;
		if (input == "����") {
			user = 1;
		} else if (input == "����") {
			user = 2;
		} else if (input == "��") {
			user = 3;
		}

		// com;
		if (Rnum == 1) {
			com = "����";
		} else if (Rnum == 2) {
			com = "����";
		} else if (Rnum == 3) {
			com = "��";
		}
		
//		switch (result) {
//		case 0:
//			System.out.println("Com�� " + com + "�� User�� " + input + "�� �½��ϴ�. ���º�");
//		case 1:
//			System.out.println("Com�� " + com + "�� User�� " + input + "�� �½��ϴ�. Com�� �¸�");
//		case 2:
//			System.out.println("Com�� " + com + "�� User�� " + input + "�� �½��ϴ�. Com�� �¸�");
//		case -1:
//			System.out.println("Com�� " + com + "�� User�� " + input + "�� �½��ϴ�. User�� �¸�");
//		case -2:
//			System.out.println("Com�� " + com + "�� User�� " + input + "�� �½��ϴ�. User�� �¸�");
//		}

	}

}
