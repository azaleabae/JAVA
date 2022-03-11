import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class wenti4 {
	// 패션 고자들을 위한 의상 추천기
	public static void main(String[] args) {
		
		// Arraylist 나 배열 문제가 아니라 재귀함수? 를 쓸줄 알아야 해결됨
		// 모든 경우의 수 구하기는 combination이라고 따로 메서드가 있는듯

		List<String> outList = new ArrayList<String>();
		outList.add("코트");
		outList.add("블루종");
		outList.add("가디건");


		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 30; i++) {
			a = (int) (Math.random() * 3);
			b = (int) (Math.random() * 3);
			c = (int) (Math.random() * 3);

			if (!(a == b) && !(a == c) && !(b == c)) {

				System.out.println(outList.get(a) + " " + outList.get(b) + " " + outList.get(c));
			}

		}
	}
}

