package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {

		// �迭 �� ���� shuffle
		
		int[]arr = {0,1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random() * 7); // 0~6 ���� �� ���� ���Ƿ� �޴´�.
			int dummy = arr[i]; //
			arr[i] = arr[n]; //  arr[0] �� arr[n]�� ���� ���� �ٲ۴�. ����� �ٲٷ��� ������ �� 3�� �ʿ��� 2�忡�� ����
			arr[n] = dummy;	  //
			System.out.println(Arrays.toString(arr));
		}
	}

}
