import java.util.Arrays;

// 배열안의 최소값과 최대값 구해보기
public class CT1_1 {
	public static void main(String[] main) {
	
		int[] arr = { 20, 10, 35, 30, 7 ,87};
		int max = arr[0];
		int min = arr[0];
		
		Arrays.sort(arr); // 배열을 작은수부터 큰수로 정렬해주는 메서드
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

		
	}
}


// 