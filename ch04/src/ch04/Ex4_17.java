package ch04;

public class Ex4_17 {

	public static void main(String[] args) {

		// continue break처럼 끝내는게 아니라 다음 반복문으로 넘어감
		// 전체 반복중 특정 조건시 반복을 건너뛸 때 유용
		
		// 3의 배수를 제외한 나머지를 구해보기
		
		for(int i=0; i<=10;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}

}
