import java.util.Scanner;

public class CreateID2 {

	public String CreateID2(String id) {
		
// ���Ǻ��� �ܰ踦 ������
// id�� ��õ ���̵�		
// exclude�� ������ �͵�		
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("���Ͻô� ID�� �Է��ϼ���.");
		
		String str = sc.nextLine();

		// 1�ܰ� �빮�ڸ� �ҹ��ڷ�
		id = id.toLowerCase();

		
		// 2�ܰ� a~z 0~9 -_ . ���� ����
		String exclude = "";
		for (int i = 0; i < id.length(); i++) { // �迭�� ���������� ���µ� length�� ��? �����Ѱ���

			// charAt() �� ��ȣ���� index ���� ���� ���ڸ� Ȯ���� �� �Ǵ� ���ڿ��� ���̸� ���Ҷ� length�� ���� ����
			// char charAt(int index)
			// int length()

			char ch = id.charAt(i);

			if (ch >= 'a' && ch <= 'z') { // ch�� a ���� z������ ���� �϶�

				// valueOf �޼���� () ���� ��ü�� String ��ü�� �ٲ��� ���⼭�� ch�� char(����)�ϱ� ch�� String���� �ٲ���
				id += String.valueOf(ch); // a���� z������ ���ڶ�� id�� id + ch�� ���� String���� �ٲ��ذ��� �ȴ�.
				// id = id + String.valueOf(ch);
			
			}else if(0 <= ch && ch <= 9) { // ch�� 0���� 9 ������ ������ ��
				id += String.valueOf(ch);
			
			}else if(ch == '.' || ch == '-' || ch== '_' ) { // ch�� �޸��ų� - �ų� _ �϶�
				id += String.valueOf(ch);
			}
			
			
			
			// 4. �޸��� �ΰ� �̻��̸� �Ѱ��� �ٲ��ֱ�
			// ccount�� comma count
			for(int ccount = 0; ccount < id.length(); ccount++) {
				if(id.indexOf(ccount) == '.') {
					id.replace("..", "."); // �ѹ� ¥�f�µ� �ɷ��� ��������
				}
				
			}
			
			if(id.length() == 0) {
				id += 'a';
			}
			
			System.out.println(id);
			
		}

		
		return exclude;
		
		

		

	}

}
