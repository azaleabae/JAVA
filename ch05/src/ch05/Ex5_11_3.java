package ch05;

import java.util.Arrays;

public class Ex5_11_3 {

	public static void main(String[] args) {
		// 배열의 정렬 
		// sort() 오름차순으로 정렬해줌
		
		int[]a = {7,3,5,4,6,1,2};
		
		System.out.println(Arrays.toString(a)); // 정렬 전
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); // 정렬 후

	}

}
