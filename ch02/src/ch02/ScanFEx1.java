package ch02;

import java.util.Scanner;
public class ScanFEx1 {

	public static void main(String[] args) {

		//Scanner Ŭ������ ��ü ����
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		System.out.println("���ظ� 3�� �����߽��ϱ�?");
		System.out.println(" 1. ��  " + "  2. �ƴϿ�");
		
		String yes = "��";
		String no = "�ƴϿ�";
		
		
		//���δ����� �Է¹�����
		String input = scanner.nextLine(); // �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input); // �Է¹��� input�� ���� num���� ��ȯ
		//���ڿ��� ���ڷ� �ٲ��ٶ� ���� �޼��� Integer.parseInt();
		
		if(num == 1) {
			System.out.println(yes);
			System.out.println("�����մϴ�.");
		}else if(num == 2) {
			System.out.println(no);
			System.out.println("����");
		}
		
	}

}
