import java.util.Scanner;

// �ִ� ���߿� �����ϰ� ��õ���ֱ�

public class wenti5 {

	public static void main(String args[]) {

		System.out.println(" *** �м� ���ڸ� ���� ���� �ڵ� ��õ *** ");
		System.out.println(" ");

		String[] out = new String[] { "��Ʈ", "�����", "�����", "������" };
		String[] up = new String[] { "����", "Ƽ", "������", "����Ʈ","ī�� Ƽ" };
		String[] low = new String[] { "û����", "�����", "������", "ī�� ����" };

		Scanner sc = new Scanner(System.in);

		System.out.println(" ������ �Է��� �ּ���. ");

		char input = sc.next().charAt(0);

		int outR = (int) (Math.random() * 4);
		int upR = (int) (Math.random() * 5);
		int lowR = (int) (Math.random() * 4);
		int holidayR = (int) (Math.random() * 2) + 1;

		if ((input == '��')||(input == 'ȭ')||(input == '��')||(input == '��')||(input == '��')) {
			
			System.out.println("�����δ� " + out[outR] + "�� ��õ �帳�ϴ�.");
			System.out.println("���Ƿδ� " + up[upR] + "�� ��õ �帳�ϴ�.");
			System.out.println("���Ƿδ� " + low[lowR] + "�� ��õ �帳�ϴ�.");
		
		} else if ((input == '��')||(input=='��')) {
			
			System.out.println("�����δ� " + out[holidayR] + "�� ��õ �帳�ϴ�.");
			System.out.println("���Ƿδ� " + up[holidayR] + "�� ��õ �帳�ϴ�.");
			System.out.println("���Ƿδ� " + low[holidayR] + "�� ��õ �帳�ϴ�.");
		
		} else {
			
			System.out.println("��Ȯ�� ������ �Է����ּ���.");
		
		}

	}
}
