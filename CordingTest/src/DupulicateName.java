import java.util.HashSet;
import java.util.TreeSet;

// �达�� �̾��� ���� �� �� �ΰ���?
// "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
// �ߺ��� ������ �̸��� ����ϼ���.
// �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.
public class DupulicateName {

	public static void main(String[] args) {

		String input = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";

		String[] name = input.split(",");

		int countKim = 0;
		int countLee = 0;
		int countLjy = 0;

		HashSet<String> hash = new HashSet<>(); // �ߺ������ �������� ������ ���׹���
		TreeSet<String> tree = new TreeSet<>();	// �ߺ���뵵 ���ϰ� ���� �ڵ�����

		for (int i = 0; i < name.length; i++) {
			hash.add(name[i]);
			tree.add(name[i]);

			if (name[i].startsWith("��"))
				countKim++;

			if (name[i].startsWith("��"))
				countLee++;

			if (name[i].equals("���翵"))
				countLjy++;

		}

		System.out.println("�达�� " + countKim + "���̰� �̾��� "+ countLee + "�� �Դϴ�.");
		System.out.println("���翵���� " + countLjy + "�� �Դϴ�.");
		System.out.println();
		System.out.println(hash);
		System.out.println();
		System.out.println(tree);

	}

}
