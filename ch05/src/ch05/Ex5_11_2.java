package ch05;

import java.util.Arrays;

public class Ex5_11_2 {

	public static void main(String[] args) {
		// Arrays로 배열 다루기
		// 배열의 복사 - copyOf(),copyOfRange()
		// Arrays.copyOf(복사의 대상이 되는 배열, 복사할 행의 범위)
		// Arrays.copyOfRange(복사의 대상이 되는 배열, ~부터, ~까지(자신은 제외))
		
		int[] arr = {01,12,23,34,45};
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 이러면 arr이라는 배열을 모두 복사해서 arr2라는 배열을 만듬
		int[] arr3 = Arrays.copyOf(arr, 6); // 기존의 배열보다 길이가 길어지면 값이 없는 배열은 0이 들어감
		int[] arr4 = Arrays.copyOfRange(arr, 2, 5); //  arr이라는 배열의 2~4를 복사
		int[] arr5 = Arrays.copyOfRange(arr, 0, 7); //  arr이라는 배열은 값이 0~4로 총 5개 그보다 큰 값을 입력하면 
													// 	존재하지 않던 배열은 기본값 0이 들어간다.
		
		
		for(int i = 0; i < arr5.length; i++) {
		System.out.println(arr5[i]);
		}
		System.out.println(Arrays.toString(arr5));
	}

}
