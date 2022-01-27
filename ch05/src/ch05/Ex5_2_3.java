package ch05;

import java.util.Arrays; // ctrl + shift + o   =  자동으로 임포트 해주기

public class Ex5_2_3 {

	public static void main(String[] args) {
		// 배열의 출력
		
		// 배열의 모든요소 Arrays 메서드를 이용하여 출력하기
		
		int[] arr1 = {100,95,80,70,60};
		System.out.println(arr1); 
		// 주소 값이 찍혀 나옴
		
		System.out.println(Arrays.toString(arr1)); 
		//문자열로 만들어서 출력해준다.
		
		char[] arr2 = {'a','b','c'};
		System.out.println(arr2);
		// 문자의 경우 주소 값이 아닌 배열의 값이 출력됨 
	}

}
