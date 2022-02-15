package ch02;

import java.util.Scanner;
public class ScanFEx1 {

	public static void main(String[] args) {

		//Scanner 클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		System.out.println("워해머 3편 구입했습니까?");
		System.out.println(" 1. 네  " + "  2. 아니오");
		
		String yes = "네";
		String no = "아니오";
		
		
		//라인단위로 입력받을때
		String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
		int num = Integer.parseInt(input); // 입력받은 input을 숫자 num으로 변환
		//문자열을 숫자로 바꿔줄때 쓰는 메서드 Integer.parseInt();
		
		if(num == 1) {
			System.out.println(yes);
			System.out.println("감사합니다.");
		}else if(num == 2) {
			System.out.println(no);
			System.out.println("꺼저");
		}
		
	}

}
