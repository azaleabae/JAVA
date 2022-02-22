package ch11;

// 스택과 큐(stack & Queue)

	// 스택(stack) : LIFO(last in first out)구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.

	// 큐(Queue) : FIFO(first in fist out)구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.


// 스택의 메서드

	// boolean empty() - Stack이 비어있는지 알려준다.

	// Object peek() - Stack의 맨위에 저장된 객체를 반환 pop()과는 달리 stack에서 객체를 꺼내지는 않음 (비었을때 EmptyStackException 발생)
	
	// Object pop() - Stack의 맨위에 저장된 객체를 꺼낸다. (비었을때 EmptyStackException 발생)

	// Object push(Object item) - Stack에 객체(item)를 저장한다.

	// int search(Object o) - Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환, 못찾으면 -1을 반환.(배열과 달리 위치는 0이아닌 1에서 시작)


// 큐의 메서드

	// boolean add(Object o) - 지정된 객체를 Queue에 추가한다. 성공하면 true를 반환. 저장공간이 부족하면 illegalStateException 발생

	// Object remove() - Queue에서 객체를 꺼내 반환 비어있으면 NoSuchElementException발생 

	// Object element() - 삭제없이 요소를 읽어온다. peek와 달리 Queue가 비었을 때 NoSuchElementException발생

	// boolean offer(Object o) - Queue에 객체를 저장. 성공하면 true 실패하면 false를 반환

	// Object poll() - Queue에서 객체를 꺼내서 반환. 비어있으면 null을 반환(예외발생이 아님)

	// Object peek() - 삭제없이 요소를 읽어온다. Queue가 비어있으면 null을 반환
public class Ex11_3_1 {

}
