package ch05;

import java.util.Arrays;

public class Ex5_11_1 {

	public static void main(String[] args) {
		// Arrays Ŭ������ �迭 �ٷ��
		
		//�迭�� �񱳿� ��� - equals() , toString()
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {
				{11,12},
				{21,22}
		};
		System.out.println(Arrays.toString(arr)); // ���ڿ��� �ٲ㼭 ���
		System.out.println(Arrays.deepToString(arr2D)); // 2�����̻��� �������϶� �̷��� ����� ���� ���ڿ��� ���

		
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		String[][] ab = {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		String[][] ab2 = {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		System.out.println(Arrays.deepEquals(ab, ab2)); // 2���� �̻��� ������ �迭�϶��� deepEquals�� ����.
	}

}
