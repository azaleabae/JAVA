package ch05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {

		String[] arr = {"����", "����", "��"};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*3); // arr�� ��Ұ��� �� 3���ϱ� 3�Է�
			System.out.println(arr[n]);
		}
		
	}

}
