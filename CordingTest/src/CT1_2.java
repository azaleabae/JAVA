
public class CT1_2 {

	public static void main(String[] args) {

		int[] arr = new int[100];

//		for (int i = 0; i < arr.length; i++) { // 배열의 총
//			arr[i] += i; // arr[i] = arr[i] + 1;
//		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i;
			sum += arr[i]; // sum = sum + arr[i]
			// sum은 배열의 주소값과 같은 숫자값을 같게됨 배열 [2]의 값이 3이면 sum도 3
		}

		System.out.println(sum);
	}

}
