package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {

		// 배열 값 섞기 shuffle
		
		int[]arr = {0,1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random() * 7); // 0~6 중의 한 값을 임의로 받는다.
			int dummy = arr[i]; //
			arr[i] = arr[n]; //  arr[0] 과 arr[n]의 값을 서로 바꾼다. 제대로 바꾸려면 변수가 총 3개 필요함 2장에서 배운거
			arr[n] = dummy;	  //
			System.out.println(Arrays.toString(arr));
		}
	}

}
