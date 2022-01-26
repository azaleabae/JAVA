package ch04;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		
		//중첩 if문
		int time = 0;
		String grade = " " , mark = " ";
		
		System.out.print("플레이 시간을 입력해주세요. ->");
		
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextInt(); // 입력 받은 값을 time에 저장
		
//		System.out.println("당신의 플레이 시간은 " + time + " 이고 " + "당신의 등급은 "+ (mark) + (grade) + " 입니다.");
		
		if(time >= 1000) {
			grade = "고수";
			if(time <= 1049) {
				mark = "개";
			}else if(time >= 1050){
				mark = "초";
			}
		}else if(time <= 100) {
				grade = "초보";
				if(time >= 51) {
					mark = "개";
				}else if(time <= 50){
					mark = "초";
				}	
		}else {
			grade = "중수";
		}
		System.out.println("당신의 플레이 시간은 " + time + " 이고 " + "당신의 등급은 "+ mark + " " + grade + " 입니다.");
	}
}
