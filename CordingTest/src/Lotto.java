// �ζ� ����
// ���ڴ� ��7�� ��ġ��ȵ�
// i1~i7 ���� ���� �������� for���� ���� while ���� ���� �𸣰��� ->  ������ �����غ��ϱ� �׷� math.random ���°� �ƴ�
// ���ʽ� ���� ������ length-1; ���ָ� 6�� ��µǴϱ� �������� �迭 �ּҰ� ��� �������ָ� �ɵ�

public class Lotto {

	public static void main(String[] args) {

		
		System.out.println("�λ� ����");
		
		int num[] = new int[7];

		for (int a = 0; a < num.length; a++) {

			num[a] = (int) (Math.random() * 45) + 1; 
			// �� 45�����ϱ� 45���ϰ� Math.random �� �⺻�� 0���� 1������ ���ڴϱ� 0~44���� ���� �׷��� 1������

			for (int b = 0; b <= a - 1; b++) {

				while (num[a] == num[b]) {
					num[b] = (int) (Math.random() * 45) + 1;
				}
			}
		}
		for (int a = 0; a < num.length-1; a++) {
			
			System.out.print(num[a] + " ");
		}
		System.out.println(" ���ʽ� ���� " + num[6] + " �Դϴ�.");

	}//main ��

}
