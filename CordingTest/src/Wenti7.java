import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
//������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.

public class Wenti7 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 8, 13, 17, 20, 21 };
		ArrayList<Integer> save = new ArrayList<Integer>();

		int now = 0;
		int path = 0;
		int i = 0;
		int j = 0;

		for (i = 0; i < arr.length - 1; i++) {
			now = arr[i + 1];
			path = arr[i];
			save.add(arr[i + 1] - arr[i]);
		}
		Collections.sort(save);
		for (j = 0; j < save.size(); j++) {
//			System.out.println(save.get(j));
			if (save.get(j) == Collections.min(save)) {
				System.out.println(path);
			} //  �Ѥ�;; ����

		}
	}
}
