package ch04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// switch 문 예제

		System.out.print("현재 일을 입력하세요. ->");
		
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		
		
		switch(day){
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
				System.out.println("현재의 일은"+ " " + day+ "일 이며 달의 초순입니다.");
				break;
			case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21:
				System.out.println("현재의 일은"+ " " + day+ "일 이며 달의 중순입니다.");
				break;
			case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31:
				System.out.println("현재의 일은"+ " " + day+ "일 이며 달의 말입니다.");
				break;
			default:
				// 남은 일들
				System.out.println(day + "을 입력하셨습니다. 일의 최대 값은 31입니다. 정신차리고 다른 값을 입력하세요.");
				
		}
	}

}
