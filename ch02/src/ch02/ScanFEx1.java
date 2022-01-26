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
		
		//라인단위로 입력받을때
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		//문자열을 숫자로 바꿔줄때 쓰는 메서드 Integer.parseInt();
		
		System.out.println(num);
	}

}
