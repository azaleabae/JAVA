package ch11;

// 알면 좋은 것 - 트리 순회

	// 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라고 한다.

import java.util.TreeSet;

public class Ex11_8_4 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int [] score = {8,4,5,1,2,3,10,15,12,19,22};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("10보다 작은 값 : " + set.headSet(10));
		System.out.println("10보다 큰 갑: " + set.tailSet(10));
		System.out.println("8과 15사이의 값 : " + set.subSet(8, 19)); // 19는 포함안됨
		
	}

}
