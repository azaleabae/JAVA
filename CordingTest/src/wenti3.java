import java.util.Arrays;
import java.util.Collections;

public class wenti3 {
	// �м� ���ڵ��� ���� �ǻ� ��õ��
	public static void main(String[] args) {
		String[] out = new String[] { "��Ʈ", "�����", "�����" };
		String[] up = new String[] { "����", "Ƽ", "������" };
		String[] low = new String[] { "û����", "�����", "������" };

		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i=0; i<28; i++) {
			a = (int) (Math.random() * 3);
			b = (int) (Math.random() * 3);
			c = (int) (Math.random() * 3);
			
			// ����
			
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
