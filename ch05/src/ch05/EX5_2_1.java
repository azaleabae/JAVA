package ch05;

public class EX5_2_1 {

	public static void main(String[] args) {
		// �迭�� ����
		// �迭�̸�.length - �迭�� ����(int�� ���)
		
		// �迭�� �ѹ� �����ϸ� ���ൿ�� �� ���̸� �ٲ� �� ����.
		// �迭�� ���̰� �����ϸ� �� ū �迭�� ����� ������ ���� �����Ѵ�.
		
		int[]arr = new int[9];
		System.out.println("arr.length= "+ arr.length);
		
//		for(int i = 0; i < 10; i++){
//			System.out.println("arr[" + i + "]= "+ arr[i]); 
			//i�� ������ ����� ������
		
		for(int i = 0; i < arr.length; i++){ // i ���� ��ȭ�ϸ� �ڵ����� ��ȭ�Ǽ� ������ i����ŭ ������
			System.out.println("arr[" + i + "]= "+ arr[i]); 
		}

	}

}
