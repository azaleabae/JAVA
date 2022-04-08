import java.util.Arrays;

//1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
//예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.

public class DaumTest {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 8, 13, 17, 20, 21, 24, 25 };
		int[] min = new int[arr.length - 1]; // sort로 정렬해서 0번째 배열에 최소값이 오게할 배열
		int[] result = new int[min.length]; // arr의 뒷 배열에서 앞 배열을 뺀 값을 그대로 저장할 배열

		for (int i = 0; i < result.length; i++) {
			min[i] = arr[i+1] - arr[i];
			result[i] = arr[i+1] - arr[i]; // i+1 에서 i를 뺀 값을 배열 min과 배열 result에 저장
		}
		Arrays.sort(min); // min을 정렬 시켜서 min[0]의 최소값이 오게 해줌
		for (int i = 0; i < result.length; i++) {
			if (min[0] == result[i]) { // 최소값과 정렬시키지 않은 result의 값을 비교
				System.out.println(arr[i] + "," + arr[i + 1]); // result[i]값은 arr[i]와 위치가 같다는걸 이용
			}
		}
	}
}