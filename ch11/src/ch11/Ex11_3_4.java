package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_3_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �����̶�");
		
		while(true) {
			System.out.println(">>");
			try {
				//ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim(); // trim() ���ڿ� �յڿ� ������ ������ ��������(���ڿ����̿� �ִ� ������ �ΰ�)
				
				if("".equals(input)) continue; // �ƹ��͵� �Է¹��� �ʾҴٸ� ���� �϶�
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) { //EqualsIgnoreCase ��ҹ��� �����ض�
					System.out.println("help - ����");
					System.out.println("q�Ǵ�Q -  ���α׷� ����");
					System.out.println("histroy - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + " �� �����ݴϴ�.");
				}else if(input.equalsIgnoreCase("history")) {
					save(input); // �Է¹��� ��ɾ �����ϰ�,
					
					// LinkedList�� ������ �����ش�.
					LinkedList list = (LinkedList)q;
					
					for(int i = 0; i < list.size();i++)
						System.out.println((i+1)+"."+list.get(i));
				}else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q")){
			}catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}// while(true) ��
	}// main ��

	private static void save(String input) {
		// queue�� �����Ѵ�.
		if(!"".equals(input))
			q.offer(input);
		
		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE)
			q.remove();
		
	}
	

}
