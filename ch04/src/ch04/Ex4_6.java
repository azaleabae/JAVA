package ch04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// switch �� ����

		System.out.print("���� ���� �Է��ϼ���. ->");
		
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		
		
		switch(day){
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
				System.out.println("������ ����"+ " " + day+ "�� �̸� ���� �ʼ��Դϴ�.");
				break;
			case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21:
				System.out.println("������ ����"+ " " + day+ "�� �̸� ���� �߼��Դϴ�.");
				break;
			case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31:
				System.out.println("������ ����"+ " " + day+ "�� �̸� ���� ���Դϴ�.");
				break;
			default:
				// ���� �ϵ�
				System.out.println(day + "�� �Է��ϼ̽��ϴ�. ���� �ִ� ���� 31�Դϴ�. ���������� �ٸ� ���� �Է��ϼ���.");
				
		}
	}

}
