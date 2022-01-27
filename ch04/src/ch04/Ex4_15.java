package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// do - while 문
		// 반복하는건 동일한데 형태가 좀 다름
		// 일단 입력 받은 값을 무조건 한번을 실행하고
		// while로 조건식을 만족하는지 확인함
		// 보통 값을 입력 받을 때 사용
		
		// 1~100 중에 하나의 수를 정하고 그수를 스무고개처럼 찾아가기
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()* 100)+1; 
		// 1부터 100사이의 임의의 수를 저장 
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1에서 100사이의 정수를 입력하시오.->");
			input = scanner.nextInt();
			
			if(input> answer) {
				System.out.println("찾고있는 답은 입력하신 값보다 더 작습니다.");
			}else if(input < answer){
				System.out.println("찾고있는 답은 입력하신 값보다 더 큽니다.");
			} // 여기까지 일단 실행
		
		}while(input!=answer);
		System.out.println("정답입니다.");
	}
}
