import java.util.Arrays;

//1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
//������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.

public class DaumTest {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 8, 13, 17, 20, 21, 24, 25 };
		int[] min = new int[arr.length - 1]; // sort�� �����ؼ� 0��° �迭�� �ּҰ��� ������ �迭
		int[] result = new int[min.length]; // arr�� �� �迭���� �� �迭�� �� ���� �״�� ������ �迭

		for (int i = 0; i < result.length; i++) {
			min[i] = arr[i+1] - arr[i];
			result[i] = arr[i+1] - arr[i]; // i+1 ���� i�� �� ���� �迭 min�� �迭 result�� ����
		}
		Arrays.sort(min); // min�� ���� ���Ѽ� min[0]�� �ּҰ��� ���� ����
		for (int i = 0; i < result.length; i++) {
			if (min[0] == result[i]) { // �ּҰ��� ���Ľ�Ű�� ���� result�� ���� ��
				System.out.println(arr[i] + "," + arr[i + 1]); // result[i]���� arr[i]�� ��ġ�� ���ٴ°� �̿�
			}
		}
	}
}