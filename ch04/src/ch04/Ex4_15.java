package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// do - while ��
		// �ݺ��ϴ°� �����ѵ� ���°� �� �ٸ�
		// �ϴ� �Է� ���� ���� ������ �ѹ��� �����ϰ�
		// while�� ���ǽ��� �����ϴ��� Ȯ����
		// ���� ���� �Է� ���� �� ���
		
		// 1~100 �߿� �ϳ��� ���� ���ϰ� �׼��� ������ó�� ã�ư���
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()* 100)+1; 
		// 1���� 100������ ������ ���� ���� 
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1���� 100������ ������ �Է��Ͻÿ�.->");
			input = scanner.nextInt();
			
			if(input> answer) {
				System.out.println("ã���ִ� ���� �Է��Ͻ� ������ �� �۽��ϴ�.");
			}else if(input < answer){
				System.out.println("ã���ִ� ���� �Է��Ͻ� ������ �� Ů�ϴ�.");
			} // ������� �ϴ� ����
		
		}while(input!=answer);
		System.out.println("�����Դϴ�.");
	}
}
