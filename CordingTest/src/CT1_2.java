
public class CT1_2 {

	public static void main(String[] args) {

		int[] arr = new int[100];

//		for (int i = 0; i < arr.length; i++) { // �迭�� ��
//			arr[i] += i; // arr[i] = arr[i] + 1;
//		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i;
			sum += arr[i]; // sum = sum + arr[i]
			// sum�� �迭�� �ּҰ��� ���� ���ڰ��� ���Ե� �迭 [2]�� ���� 3�̸� sum�� 3
		}

		System.out.println(sum);
	}

}
