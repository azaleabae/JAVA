package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		
		// ���� �ݺ������� break���� continue�� �����غ���
		
		int tribe = 0;
		String num1 = "Emprie";
		String num2 = "Greenskin";
		String num3 = "Dwarf";
		String num4 = "High Elf";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Empire");
			System.out.println("2. Greenskin");
			System.out.println("3. Dwarf");
			System.out.println("4. High Elf");
			System.out.print("���ϴ� �޴�(1~4)�� �����ϼ���.(����:0)->");
			
			String ch = scanner.nextLine(); // �Է¹��� ������ ch�� ����
			tribe = Integer.parseInt(ch); // �Է¹��� ���ڿ�(ch)�� ���ڷ� ��ȯ

			if(tribe==0) {
				System.out.println("������ ���� �˴ϴ�.");
				break;
			}else if(!(1 <= tribe && tribe <=4)) {
				System.out.println("0�̸��̳� 4�� �ʰ��ϴ� ���ڸ� �Է��ϽǼ� �����ϴ�. ����� 0 �Դϴ�.");
				continue;
			}else if(tribe==1) {
				System.out.println("���� ������ " + tribe + " " + num1 + "�Դϴ�.");
				break;                                      
			}else if(tribe==2) {                            
				System.out.println("���� ������ " + tribe + " " + num2 + "�Դϴ�.");
				break;                                      
			}else if(tribe==3) {                            
				System.out.println("���� ������ " + tribe + " " + num3 + "�Դϴ�.");
				break;                                      
			}else if(tribe==4) {                            
				System.out.println("���� ������ " + tribe+  " " + num4 + "�Դϴ�.");
				break;
			}
			
			
		}
		

	}

}
