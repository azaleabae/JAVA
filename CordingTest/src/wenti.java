import java.util.Scanner;

// �Է¹��� �� ���� 100������ ¦�� ����ϰ� �� ���ϱ�

public class wenti {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1~100������ ���ڸ� �Է��ϼ���.");

		int sum = 0;

		for (int a = sc.nextInt(); a < 101; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
				int arr[] = new int[] { a };
				for (int i = 0; i < arr.length; i++) {
					sum = sum + arr[i]; // ??? �Ѹ� ������... wenti 2������ ��
				}
			}
		}

		System.out.println(" ");
		System.out.println("�Է��Ͻ� ���ں��� 100������ ¦�������� " + sum + "�Դϴ�.");

	}
}
