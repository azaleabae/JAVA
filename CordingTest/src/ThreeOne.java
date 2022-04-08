import java.util.Random;
import java.util.Scanner;

public class ThreeOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("베스킨라빈스 떨이원 시작");
		System.out.println("컴퓨터의 선공으로 시작됩니다.");
		System.out.println("*1~3까지 입력 하실 수 있습니다.*");
		

		Random r = new Random();
		int com = 0;
		int callcount = 0;

		while (callcount < 31) {

			if (callcount <= 26) {
				com = r.nextInt(3) + 1;
				callcount += com;
			} else if (callcount == 27) {
				com = 3;
				callcount += com;
				System.out.println("Com이 " + com + "을 부릅니다. Com의 승리!");
				break;

			} else if (callcount == 28) {
				com = 2;
				callcount += com;
				System.out.println("Com이 " + com + "을 부릅니다. Com의 승리!");
				break;

			} else if (callcount == 29) {
				com = 1;
				callcount += com;
				System.out.println("Com이 " + com + "을 부릅니다. Com의 승리!");
				break;
			
			} else if (callcount == 30) {
				System.out.println("Player가 승리했습니다. 축하드립니다!");
				break;
			}
			
			System.out.println("Com이 " + com + "만큼 진행시켰습니다.");
			System.out.println("현재 도달한 숫자는" + callcount + "입니다.");
			System.out.println();
			callcount += sc.nextInt();
			System.out.println("현재 도달한 숫자는" + callcount + "입니다.");
			

		}
	}
}
