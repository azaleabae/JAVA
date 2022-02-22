package ch11;

import java.util.Arrays;

// Arrays - 배열을 다루기 편리한 메서드(static) 제공

// 배열의 출력 - toString()

// 배열의 복사 - copyOf(), copyOfRange() - 새로운 배열을 생성해서 반환

// 배열 채우기 - fill(), setAll()

// 배열의 정렬과 검색 - sort(), binarySearch()

// 다차원 배열의 출력 - deepToString()
public class Ex11_5_1 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("arr=" + Arrays.toString(arr2D));
		System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // 다차원용 배열용 메서드

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr을 복사해서 arr2를 만듬
		int[] arr3 = Arrays.copyOf(arr, 3); // 3개만 
		int[] arr4 = Arrays.copyOf(arr, 7); // 기존배열보다 큼으로 5개 복사하고 나머지 두개를 0으로 채움
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 2<=x<4 까지 4는 안들어감
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 0부터 시작하되 7은 안들어감

		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));

		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // arr=[9,9,9,9,9] arr7이란 배열을 9로 다 채워라
		System.out.println("arr7=" + Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // 랜덤값으로 채워라
		System.out.println("arr7=" + Arrays.toString(arr7));

		for (int i : arr7) { // 향상된 for 문  arr7의 요소를 하나씩 꺼내서 i에 대입해라
//			for (i = 0; x < arr7.length; x++){
//			int i = arr7[i]
//			} 을 줄여 쓴게 (int i : arr7)
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
		}

		String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(Arrays.equals(str2D, str2D2)); // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr); // 배열을 정렬. binarySearch하기 전에는 반드시 정렬먼저
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
	}

}
