import java.util.Arrays;

// �迭���� �ּҰ��� �ִ밪 ���غ���
public class CT1_1 {
	public static void main(String[] main) {
	
		int[] arr = { 20, 10, 35, 30, 7 ,87};
		int max = arr[0];
		int min = arr[0];
		
		Arrays.sort(arr); // �迭�� ���������� ū���� �������ִ� �޼���
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

		
	}
}


// 