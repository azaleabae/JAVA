import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class wenti4 {
	// �м� ���ڵ��� ���� �ǻ� ��õ��
	public static void main(String[] args) {
		
		// Arraylist �� �迭 ������ �ƴ϶� ����Լ�? �� ���� �˾ƾ� �ذ��
		// ��� ����� �� ���ϱ�� combination�̶�� ���� �޼��尡 �ִµ�

		List<String> outList = new ArrayList<String>();
		outList.add("��Ʈ");
		outList.add("�����");
		outList.add("�����");


		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 30; i++) {
			a = (int) (Math.random() * 3);
			b = (int) (Math.random() * 3);
			c = (int) (Math.random() * 3);

			if (!(a == b) && !(a == c) && !(b == c)) {

				System.out.println(outList.get(a) + " " + outList.get(b) + " " + outList.get(c));
			}

		}
	}
}

