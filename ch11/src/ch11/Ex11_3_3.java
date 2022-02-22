package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

// ���ð� ť�� Ȱ��

// ���� Ȱ�� �� - ���İ��, ���İ�ȣ�˻�, �������μ����� undo/redo, ���������� �ڷ�/������

// ť�� Ȱ�� �� - �ֱٻ�빮��, �μ��۾� �����, ����(buffer)
public class Ex11_3_3 {
	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}

		Stack st = new Stack();
		String expression = "((3+5)*8-2)"; //args[0];

		System.out.println("expression:" + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}

			if (st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�."); // ������ ��� �ִٸ� �����ٰ� ���� ��ȣ�� ������ �������� �̰� ���
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		} // try
	}
}
