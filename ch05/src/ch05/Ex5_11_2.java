package ch05;

import java.util.Arrays;

public class Ex5_11_2 {

	public static void main(String[] args) {
		// Arrays�� �迭 �ٷ��
		// �迭�� ���� - copyOf(),copyOfRange()
		// Arrays.copyOf(������ ����� �Ǵ� �迭, ������ ���� ����)
		// Arrays.copyOfRange(������ ����� �Ǵ� �迭, ~����, ~����(�ڽ��� ����))
		
		int[] arr = {01,12,23,34,45};
		int[] arr2 = Arrays.copyOf(arr, arr.length); // �̷��� arr�̶�� �迭�� ��� �����ؼ� arr2��� �迭�� ����
		int[] arr3 = Arrays.copyOf(arr, 6); // ������ �迭���� ���̰� ������� ���� ���� �迭�� 0�� ��
		int[] arr4 = Arrays.copyOfRange(arr, 2, 5); //  arr�̶�� �迭�� 2~4�� ����
		int[] arr5 = Arrays.copyOfRange(arr, 0, 7); //  arr�̶�� �迭�� ���� 0~4�� �� 5�� �׺��� ū ���� �Է��ϸ� 
													// 	�������� �ʴ� �迭�� �⺻�� 0�� ����.
		
		
		for(int i = 0; i < arr5.length; i++) {
		System.out.println(arr5[i]);
		}
		System.out.println(Arrays.toString(arr5));
	}

}
