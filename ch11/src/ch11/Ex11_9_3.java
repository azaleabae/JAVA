package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_9_3 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("휴먼", new Integer(90));
		map.put("드워프", new Integer(100));
		map.put("높귀", new Integer(100));
		map.put("키슬레프", new Integer(80));
		map.put("케세이", new Integer(90));
		
		Set set = map.entrySet(); // entrySet -> 전체출력(key,value)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); // Map 인터페이스안에 있는 Entry라는 인터페이스
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		} // 엔트리 셋을 이용해서 맵에 저장된 데이터를 읽어오는 방법을 보여주는 코드
		
		set = map.keySet(); // 이름만 가져올때 key값만 가져오기
		System.out.println("참가자 명단: " + set);
		
		Collection values = map.values(); // 값들만 가져오기 
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i; // 값만가져와서 다 더하면 총점
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (float)total/set.size()); // 평균이니까 float로 형변환
		System.out.println("최고점수 : " + Collections.max(values)); // values 제일 큰값을 반환하는 메서드
		System.out.println("최고점수 : " + Collections.min(values)); // 가장 작은 값을 반환하는 메서드
	}

}
