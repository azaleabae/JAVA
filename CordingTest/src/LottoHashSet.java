import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoHashSet {

	public static void main(String[] args) {
		System.out.println("인생 직진");
		Set set = new HashSet();

		for (int i = 0; set.size() < 7; i++) {
			int num = (int) (Math.random() * 45) + 1;
//			set.add(new Integer(num)); 아랫줄과 동일
			set.add(num);
			
		}

		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); // Collections.sort(List list)
		
		for(int n = 0; n < 6; n++) {
			System.out.print(list.get(n)+ " "); // 
		}
		
		

		System.out.print(" *보너스 값은 " + list.get(6) + "입니다.*");

	}

}