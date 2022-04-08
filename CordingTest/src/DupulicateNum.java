import java.util.Arrays;
import java.util.Scanner;

//0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, �� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
//sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
//sample outputs: true false false true false

public class DupulicateNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = sc.next().split(""); // �ϳ��� �߶� arr�� ���ڸ� �־���
		int[] intArr = new int[arr.length]; // ���ڸ� Integer�� ��ȯ�� �־��� �迭

		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]); // ���� arr[i]�� int�������� ��ȯ�� intArr�� ����
		}
		
		Arrays.sort(intArr); // �񱳸� ���� ����
		
		for (int i = 0; i < arr.length; i++) {
			if (intArr[i] == i && intArr.length == 10) { // intArr�� ����� ���� 10�� �̸鼭 ���ÿ� �迭��[i] ��°�� i�� ���ڰ� �Ȱ��ٸ�.
				System.out.println("true");
				break;
			} else { // ������ �������� ������
				System.out.println("false");
				break;
			}
		}
	} 
}
