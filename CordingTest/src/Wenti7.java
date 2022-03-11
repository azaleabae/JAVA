import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
//예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.

public class Wenti7 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 8, 13, 17, 20, 21 };
		ArrayList<Integer> save = new ArrayList<Integer>();

		int now = 0;
		int path = 0;
		int i = 0;
		int j = 0;

		for (i = 0; i < arr.length - 1; i++) {
			now = arr[i + 1];
			path = arr[i];
			save.add(arr[i + 1] - arr[i]);
		}
		Collections.sort(save);
		for (j = 0; j < save.size(); j++) {
//			System.out.println(save.get(j));
			if (save.get(j) == Collections.min(save)) {
				System.out.println(path);
			} //  ㅡㅡ;; 망함

		}
	}
}
