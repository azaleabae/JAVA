import java.util.Scanner;

// �Խ��� �� �������� ���ϱ�
// ����� �Խù��� �� �Ǽ��� �� �������� ������ �Խù����� �Է����� �־��� �� �� ���������� �����ϴ� ���α׷��� �ʿ��ϴٰ� �Ѵ�.

	// �Է�: �ѰǼ�(m), ���������� ������ �Խù���(n)(n�� 1���� ũ�ų� ����)
	// ���: ����������


public class BoardPage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �Ǽ��� �Է����ּ���.");
		int total = sc.nextInt();
		
		System.out.println("�� �������� ������ �Խù����� �Է��� �ּ���.");
		int item = sc.nextInt();
		
		int page = total / item;
		if(page % 2 == 0) {
			System.out.println("�ʿ��� �������� ���� " + page + "�Դϴ�.");
		} else if(page % 2 == 1) {	
			System.out.println("�ʿ��� �������� ���� " + (page+1)  + "�Դϴ�.");
		}
	}
}

// �ٸ� ����� ���ٷ� Ǯ������� 

//private int getPagingCount(int totalCnt, int pageCnt){
//
//int cnt = totalCnt / pageCnt;
//
//cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;
//
//return cnt;
//}
