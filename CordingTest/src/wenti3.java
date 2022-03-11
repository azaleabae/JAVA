import java.util.Arrays;
import java.util.Collections;

public class wenti3 {
	// 패션 고자들을 위한 의상 추천기
	public static void main(String[] args) {
		String[] out = new String[] { "코트", "블루종", "가디건" };
		String[] up = new String[] { "셔츠", "티", "스웨터" };
		String[] low = new String[] { "청바지", "면바지", "슬렉스" };

		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i=0; i<28; i++) {
			a = (int) (Math.random() * 3);
			b = (int) (Math.random() * 3);
			c = (int) (Math.random() * 3);
			
			// 과거
			
			if(!(out[a] == out[b]) && !(out[a] == out[c]) && !(out[b] == out[c])) {
				int aa = (int) (Math.random() * 3);
				int bb = (int) (Math.random() * 3);
				int cc = (int) (Math.random() * 3);
				
				
				
				if(!(a == aa) && !(b == bb) & !(c == cc)) {
					System.out.println(a + " " + aa);
				}
				
			}
			
		}
		
	}
	
}
			
				
					
				
				
				
				
				
//				while(!(out[a] == out[b]) && !(out[a] == out[c]) && !(out[b] == out[c])) {
//			
//					System.out.println(out[a] + " " + out[b] + " " + out[c]);
//			
//				}




//a = (int) (Math.random() * 3);
//b = (int) (Math.random() * 3);
//c = (int) (Math.random() * 3);
//
//int now1 = a;
//int now2 = b;
//int now3 = c;
//
//if (past1 != now1) {
//	System.out.println(out[a] + " " + out[b] + " " + out[c]);
//}

//if (!(out[a] == out[b]) && !(out[a] == out[c]) && !(out[b] == out[c])) {
//	
//	
//}

//int r = (int)(Math.random()*3);
//Collections.shuffle(Arrays.asList(up));
//System.out.println(up[r]);

//past = out[i],up[i],low,[i];
//now = out[i],up[i],low,[i];
//&& !(out[a] == out[c]))

//for (int i = 0; i < 101; i++) {
//	int a = (int) (Math.random() * 3);
//	int b = (int) (Math.random() * 3);
//	int c = (int) (Math.random() * 3);
//	if (!(out[a] == out[b]) && !(out[a] == out[c]) && !(out[b] == out[c])) {
//		System.out.println(out[a] + " " + out[b] + " " + out[c]);
//	}
//}

//for (int i = 0; i < 100; i++) {
//
//	int a = (int) (Math.random() * 3);
//
//	if (i != a) {
//
//		int b = (int) (Math.random() * 3);
//
//		if (a != b) {
//
//			int c = (int) (Math.random() * 3);
//
//			if (b != c) {
//				System.out.println(out[a] + " " + out[b] + " " + out[c]);
//			}
//		}
//	}
//}
