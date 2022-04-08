import java.util.*;


public class Tanos {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤하게 반을 날려버릴 인원의 번호를 입력하시오.");
		
		String [] arr = sc.next().split(",");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		int half = list.size()/2;
		int NoE = r.nextInt(2); // 0~1까지.
		int Rnum = r.nextInt(list.size());
		
		if(arr.length%2 == 0) {
			for(int i=0; i<half; i++) {
				list.remove(Rnum);
				Rnum = r.nextInt(list.size()); // 줄어든 list.size()를 초기화
			}
		} else {
			for(int i=0; i<half+NoE; i++) { // NoE가 1이 되면 추가로 하나 삭제
				list.remove(Rnum);
				Rnum = r.nextInt(list.size());		
			}	
		}
		System.out.println("타노스가 손가락을 튕깁니다. 인원의 반이 사라집니다.");
		System.out.println(list);		
	}
}
