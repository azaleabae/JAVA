import java.util.Random;
import java.util.Scanner;

//사용자 입력과 random함수를 사용하여, 사용자(User)와 컴퓨터가 대결하는 가위 바위 보 게임을 만들어보자.
//
//입력: [문자열] "가위", "바위" 혹은 "보" 출력: [문자열] 결과 반환
public class RpsGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int Rnum = r.nextInt(3) + 1;
		String com = "";
		int user = 0;
		System.out.println("가위,바위,보중에 하나를 입력하세요.");
		String input = sc.next();

		// user;
		if (input == "가위") {
			user = 1;
		} else if (input == "바위") {
			user = 2;
		} else if (input == "보") {
			user = 3;
		}

		// com;
		if (Rnum == 1) {
			com = "가위";
		} else if (Rnum == 2) {
			com = "바위";
		} else if (Rnum == 3) {
			com = "보";
		}
		
//		switch (result) {
//		case 0:
//			System.out.println("Com은 " + com + "를 User는 " + input + "을 냈습니다. 무승부");
//		case 1:
//			System.out.println("Com은 " + com + "를 User는 " + input + "을 냈습니다. Com의 승리");
//		case 2:
//			System.out.println("Com은 " + com + "를 User는 " + input + "을 냈습니다. Com의 승리");
//		case -1:
//			System.out.println("Com은 " + com + "를 User는 " + input + "을 냈습니다. User의 승리");
//		case -2:
//			System.out.println("Com은 " + com + "를 User는 " + input + "을 냈습니다. User의 승리");
//		}

	}

}
