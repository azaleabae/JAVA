package ch05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {

		String[] arr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*3); // arr의 요소값이 총 3개니까 3입력
			System.out.println(arr[n]);
		}
		
	}

}
