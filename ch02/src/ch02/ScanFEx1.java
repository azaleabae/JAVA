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
		
		//���δ����� �Է¹�����
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		//���ڿ��� ���ڷ� �ٲ��ٶ� ���� �޼��� Integer.parseInt();
		
		System.out.println(num);
	}

}
