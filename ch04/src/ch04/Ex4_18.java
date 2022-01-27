package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		
		// 무한 반복문에서 break문과 continue문 구현해보기
		
		int tribe = 0;
		String num1 = "Emprie";
		String num2 = "Greenskin";
		String num3 = "Dwarf";
		String num4 = "High Elf";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Empire");
			System.out.println("2. Greenskin");
			System.out.println("3. Dwarf");
			System.out.println("4. High Elf");
			System.out.print("원하는 메뉴(1~4)를 선택하세요.(종료:0)->");
			
			String ch = scanner.nextLine(); // 입력받은 내용을 ch에 저장
			tribe = Integer.parseInt(ch); // 입력받은 문자열(ch)을 숫자로 변환

			if(tribe==0) {
				System.out.println("게임이 종료 됩니다.");
				break;
			}else if(!(1 <= tribe && tribe <=4)) {
				System.out.println("0미만이나 4를 초과하는 숫자를 입력하실수 없습니다. 종료는 0 입니다.");
				continue;
			}else if(tribe==1) {
				System.out.println("고르신 종족은 " + tribe + " " + num1 + "입니다.");
				break;                                      
			}else if(tribe==2) {                            
				System.out.println("고르신 종족은 " + tribe + " " + num2 + "입니다.");
				break;                                      
			}else if(tribe==3) {                            
				System.out.println("고르신 종족은 " + tribe + " " + num3 + "입니다.");
				break;                                      
			}else if(tribe==4) {                            
				System.out.println("고르신 종족은 " + tribe+  " " + num4 + "입니다.");
				break;
			}
			
			
		}
		

	}

}
