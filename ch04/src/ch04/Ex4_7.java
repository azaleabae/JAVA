package ch04;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		
		//��ø if��
		int time = 0;
		String grade = " " , mark = " ";
		
		System.out.print("�÷��� �ð��� �Է����ּ���. ->");
		
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextInt(); // �Է� ���� ���� time�� ����
		
//		System.out.println("����� �÷��� �ð��� " + time + " �̰� " + "����� ����� "+ (mark) + (grade) + " �Դϴ�.");
		
		if(time >= 1000) {
			grade = "���";
			if(time <= 1049) {
				mark = "��";
			}else if(time >= 1050){
				mark = "��";
			}
		}else if(time <= 100) {
				grade = "�ʺ�";
				if(time >= 51) {
					mark = "��";
				}else if(time <= 50){
					mark = "��";
				}	
		}else {
			grade = "�߼�";
		}
		System.out.println("����� �÷��� �ð��� " + time + " �̰� " + "����� ����� "+ mark + " " + grade + " �Դϴ�.");
	}
}
