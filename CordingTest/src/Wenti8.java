import java.util.Arrays;

//1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
//������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.

public class Wenti8 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 8, 13, 17, 20, 21 };
		int[] save = new int[7];

		for (int i = 0; i < arr.length-1; i++) {
			int now = arr[i+1];
			int path = arr[i];
			save[i] = now - path; 
				
			if (save[i] == 1) {
				System.out.println(path+","+now);
			}
		}
	}
}