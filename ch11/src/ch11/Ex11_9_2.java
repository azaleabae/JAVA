package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_9_2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // ���߿� �ϳ��� �Է��ؾ� "��ġ�մϴ�"�� ��µǰ� for���� ���� �װ� �ƴ϶�� �ݺ�

		Scanner s = new Scanner(System.in); // ȭ�����κ��� ���δ����� �Է¹���

		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim(); // trim ���� �����ִ�
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� �Ƶڴ� �������� �ʽ��ϴ�. �ٽþ���.");
				continue;
			}

			if (!(map.get(id)).equals(password)) {
				System.out.println("��й�ȣ ����ġ �ٽ� ���ּ�.");
			} else {
				System.out.println("��ġ�մϴ�..");
				break;
			}
		} // while
	} // main��
}
