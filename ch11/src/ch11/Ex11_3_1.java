package ch11;

// ���ð� ť(stack & Queue)

	// ����(stack) : LIFO(last in first out)����. �������� ����� ���� ���� ���� ������ �ȴ�.

	// ť(Queue) : FIFO(first in fist out)����. ���� ���� ������ ���� ���� ���� ������ �ȴ�.


// ������ �޼���

	// boolean empty() - Stack�� ����ִ��� �˷��ش�.

	// Object peek() - Stack�� ������ ����� ��ü�� ��ȯ pop()���� �޸� stack���� ��ü�� �������� ���� (������� EmptyStackException �߻�)
	
	// Object pop() - Stack�� ������ ����� ��ü�� ������. (������� EmptyStackException �߻�)

	// Object push(Object item) - Stack�� ��ü(item)�� �����Ѵ�.

	// int search(Object o) - Stack���� �־��� ��ü(o)�� ã�Ƽ� �� ��ġ�� ��ȯ, ��ã���� -1�� ��ȯ.(�迭�� �޸� ��ġ�� 0�̾ƴ� 1���� ����)


// ť�� �޼���

	// boolean add(Object o) - ������ ��ü�� Queue�� �߰��Ѵ�. �����ϸ� true�� ��ȯ. ��������� �����ϸ� illegalStateException �߻�

	// Object remove() - Queue���� ��ü�� ���� ��ȯ ��������� NoSuchElementException�߻� 

	// Object element() - �������� ��Ҹ� �о�´�. peek�� �޸� Queue�� ����� �� NoSuchElementException�߻�

	// boolean offer(Object o) - Queue�� ��ü�� ����. �����ϸ� true �����ϸ� false�� ��ȯ

	// Object poll() - Queue���� ��ü�� ������ ��ȯ. ��������� null�� ��ȯ(���ܹ߻��� �ƴ�)

	// Object peek() - �������� ��Ҹ� �о�´�. Queue�� ��������� null�� ��ȯ
public class Ex11_3_1 {

}
