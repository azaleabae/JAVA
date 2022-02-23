package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_7_2 {

	public static void main(String[] args) {
		System.out.println("인생 직진");
		Set set = new HashSet();

		for (int i = 0; set.size() < 7; i++) {
			int num = (int) (Math.random() * 45) + 1;
//			set.add(new Integer(num)); 아랫줄과 동일
			set.add(num);

		}

		List list = new LinkedList(set); // LinkedList(Collection c) 
		// set은 특성상 정렬이 불가능하기 때문에 set을 list로 옮겨줘서 정렬한다
		Collections.sort(list); // Collections.sort(List list) 정렬
		
		System.out.print(list.get(0) + " " + list.get(1) + " " + list.get(2)+ " " + list.get(3) + " " + 
						 list.get(4) + " " + list.get(5) + " ");

		System.out.println(" 보너스 값은 " + list.get(6) + "입니다.");

	}

}
