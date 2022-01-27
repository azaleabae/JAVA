package ch05;

public class EX5_2_1 {

	public static void main(String[] args) {
		// 배열의 길이
		// 배열이름.length - 배열의 길이(int형 상수)
		
		// 배열은 한번 생성하면 실행동안 그 길이를 바꿀 수 없다.
		// 배열의 길이가 부족하면 더 큰 배열을 만들고 기존의 값을 복사한다.
		
		int[]arr = new int[9];
		System.out.println("arr.length= "+ arr.length);
		
//		for(int i = 0; i < 10; i++){
//			System.out.println("arr[" + i + "]= "+ arr[i]); 
			//i의 범위를 벗어나서 에러뜸
		
		for(int i = 0; i < arr.length; i++){ // i 값이 변화하면 자동으로 변화되서 범위가 i값만큼 유지됨
			System.out.println("arr[" + i + "]= "+ arr[i]); 
		}

	}

}
