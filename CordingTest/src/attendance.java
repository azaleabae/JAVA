import java.util.Random;
import java.util.Scanner;

// �� �ο� 23���� �ݿ��� n������ �����ϰ� �⼮�� �ҷ�����
// �� ��ȣ�� �Ҹ� Ƚ���� ���ϱ�

public class attendance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�⼮�θ� Ƚ���� �Է����ּ���.");

		int call = sc.nextInt(); // ����� �θ�����
		
		System.out.println("�Է��Ͻ� ���ڴ� "+ call + "�Դϴ�.");
		System.out.println();
		
		
		int save[] = new int[call]; // �θ� �л��� ��ȣ�� �����ϴ� �迭
		int arr[] = new int[23]; // �л���
		Random rd = new Random();
		int Rnum = 0;
		
		for (int n = 0; n < call; n++) { // n�� �θ��� n�� ��ŭ ������ ��ȣ�� ����ؼ� save[]�� ����
			Rnum = rd.nextInt(22);
			save[n] = Rnum; // �����ϰ� �θ� ��ȣ�� save�� n��°�� ����
			System.out.println("ȣ��� �л��� " + (save[n]+1) + "�� �Դϴ�."); // 0~22�� 1 ���ؼ� 1~23���� �������
			arr[Rnum] = arr[Rnum] + 1; // �θ� ��ȣ�� �θ�Ƚ�� 1�� �����ش�.
		}
		System.out.println();
		System.out.println("������ �л��� ȣ��� Ƚ���� ����մϴ�.");
		
		for(int i=0; i<23;i++) // ��� ��ȣ�� �л��� ��� �ҷȴ��� ��� �Ʒ������� �����̴ϱ� {} ����
			System.out.println((i+1) + "�� �л��� ȣ��� Ƚ���� " + arr[i] + "�Դϴ�.");
		
			  
	}
}

//System.out.println((i + 1) + "��° �л��� �Ҹ�Ƚ����" + arr[i] +"�� �Դϴ�.");
//int Rnum = rd.nextInt(23); // ���� �� 1~23 �� ����
//arr[Rnum] = arr[i] + 1; // arr[1����23] ��°�� �ּҿ� (0����22)+1�� ���� ���� ����

//for(int i=0; i < arr.length; i++)
//	System.out.println(i+"��° �迭 ����"+arr[i]);

//for (int n = 0; n <= call; n++) {
//	for (int i = 0; i <= 22; i++) { // 0~22 ��� ���鼭 ���
//		int Rnum = rd.nextInt(22);
//		arr[Rnum] = arr[i] + 1;
//		
//	}	
//}
