import java.util.*;


public class Tanos {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ���� �������� �ο��� ��ȣ�� �Է��Ͻÿ�.");
		
		String [] arr = sc.next().split(",");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		int half = list.size()/2;
		int NoE = r.nextInt(2); // 0~1����.
		int Rnum = r.nextInt(list.size());
		
		if(arr.length%2 == 0) {
			for(int i=0; i<half; i++) {
				list.remove(Rnum);
				Rnum = r.nextInt(list.size()); // �پ�� list.size()�� �ʱ�ȭ
			}
		} else {
			for(int i=0; i<half+NoE; i++) { // NoE�� 1�� �Ǹ� �߰��� �ϳ� ����
				list.remove(Rnum);
				Rnum = r.nextInt(list.size());		
			}	
		}
		System.out.println("Ÿ�뽺�� �հ����� ƨ��ϴ�. �ο��� ���� ������ϴ�.");
		System.out.println(list);		
	}
}
