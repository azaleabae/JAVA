package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

// 스택과 큐의 활용

// 스택 활용 예 - 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우져의 뒤로/앞으로

// 큐의 활용 예 - 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)
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
				System.out.println("괄호가 일치합니다."); // 스탯이 비어 있다면 열었다가 닫은 괄호가 갯수가 맞음으로 이걸 출력
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		} // try
	}
}
