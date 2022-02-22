package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 인터페이스를 구현한 클래스 찾기

public class Ex11_3_2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("=Stack=");
		while (!st.empty()) {
			
				System.out.println(st.pop());
			}

		System.out.println("=Queue=");
		while (!q.isEmpty()) {
				System.out.println(q.poll());
			}

		}

	}

