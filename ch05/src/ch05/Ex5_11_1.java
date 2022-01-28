package ch05;

import java.util.Arrays;

public class Ex5_11_1 {

	public static void main(String[] args) {
		// Arrays 클래스로 배열 다루기
		
		//배열의 비교와 출력 - equals() , toString()
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {
				{11,12},
				{21,22}
		};
		System.out.println(Arrays.toString(arr)); // 문자열로 바꿔서 출력
		System.out.println(Arrays.deepToString(arr2D)); // 2차원이상의 다차원일때 이렇게 써야함 역시 문자열로 출력

		
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		String[][] ab = {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		String[][] ab2 = {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		System.out.println(Arrays.deepEquals(ab, ab2)); // 2차원 이상의 다차원 배열일때는 deepEquals를 쓴다.
	}

}
