import java.util.Scanner;

public class inputText {

	public static void main(String[] args) {
		
		int count = 0;					// �Է¹��� ������ ���� 
		int[] num;						// �Է¹��� ���� 
		int numMax = 0;					// �ִ밪 
		int search;						// �˻��� ���� 
		Boolean searchCheck = false;	// �˻��� ���� üũ 
		
		Scanner scanner = new Scanner(System.in);
		// �Է¹��� ���� ���� �Է¹ޱ�
		System.out.print("�Է��� ������ ������ ? (100�� �̸�) : ");
		count = scanner.nextInt();
		num = new int[count];		
		
		// ���� �Է¹ޱ� 
		System.out.print(count + " ���� ���ڸ� �Է��ϼ���! : ");
		for (int i = 0 ; i < count ; i++) {
			num[i] = scanner.nextInt();		
		}
		
		// �˻��� ���� �ޱ� 
		System.out.print("�˻��� ���ڴ� ? :");
		search = scanner.nextInt();
		
		// �˻��� ���� üũ �� ��� 
		for (int i = 0 ; i < count ; i++)
			if (search == num[i]) {
				searchCheck = true;
				System.out.println(search + "�� ��ġ�� " + i + "��° �Դϴ�.");
			}				
		
		if (!searchCheck)
			System.out.println(search + "�� �������� �ʽ��ϴ�.");
	}	
}