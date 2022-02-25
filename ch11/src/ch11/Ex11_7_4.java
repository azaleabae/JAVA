package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_7_4 {

	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet(); // 합집합
		HashSet setKyo = new HashSet(); // 교집합 - 겹치는 부분
		HashSet setCha = new HashSet(); // 차집합
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
//		// 교집합
//		Iterator it = setB.iterator();
//		while(it.hasNext()) {
//			Object tmp = it.next();
//			if(setA.contains(tmp)) // 포함하고 있는지 확인하는 메서드 contains
//				setKyo.add(tmp);
//		}
//		
//		it = setA.iterator();
//		while(it.hasNext()) {
//			setHab.add(it.next()); // A를 읽은뒤 다 집어넣는 메서드
//		}
//		
//		it = setB.iterator();
//		while(it.hasNext()) {
//			setHab.add(it.next()); // B를 읽은뒤 다 집어넣는 메서드 그러면 set 특성상 순서도 중복도 없기 때문에 중복된건 하나씩 출력됨
//		}
		
//		setA.retainAll(setB); // 교집합. 공통된거만 남기고 삭제
//		setA.addAll(setB); // 합집합. setB의 모든 요소를 추가
		setA.removeAll(setB); // 차집합. setB와 공통 요소를 제거
		System.out.println(setA);
		
		System.out.println("A ∩ B - " + setKyo);
		System.out.println("A ∪ B - " + setHab);
		System.out.println("A - B - " + setCha);
		
	}

}
