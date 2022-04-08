import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {

		Random r = new Random();

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> dayList = new ArrayList<>();
		ArrayList<Integer> dayIn = new ArrayList<>();

		System.out.println("자재담당 재고 조사 프로그램");

		while (true) {

			System.out.println("입력하실 일자를 선택해주세요.");
			int dayListSc = in.nextInt();
			dayList.add(dayListSc);

			if (dayListSc < 32) {
				System.out.println("선택하신 날짜는" + dayListSc + "입니다. 갯수를 입력해주세요.");
				int dayInSc = in.nextInt();
				dayIn.add(dayInSc);

				int month = 0;
				for (int i = 0; i < dayIn.size(); i++) {
					month += dayIn.get(i);
				}
				int Rnum = r.nextInt(2) + 1;
				int error = (month / 1000) + Rnum;
				int total = month + error;

				System.out.println(dayListSc + "일에 입력하신 갯수는 " + dayInSc + "입니다.");
				System.out.println("");

				System.out.println("항목을 선택해주세요.");
				System.out.println("0. 프로그램 종료");
				System.out.println("1. 추가입력");
				System.out.println("2. 불량제품수");
				System.out.println("3. 이번달에 입고된 제품수");
				System.out.println("4. 불량을 포함한 모든 제품수");
				int choice = in.nextInt();

				if (choice == 0) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				} else if (choice == 1) {
					System.out.println("추가입력을 선택하셨습니다. 일자선택으로 돌아갑니다.");
					System.out.println();
					continue;
				} else if (choice == 2) {
					System.out.println("현재 불량 제품수는" + error + "개 입니다.");
					System.out.println();
					break;
				} else if (choice == 3) {
					System.out.println("이번달에 입고된 제품의 수는" + month + "개 입니다.");
					System.out.println();
					break;
				} else if (choice == 4) {
					System.out.println("모든 제품의 수는" + total + "개 입니다.");
					System.out.println();
					break;
				} else if (choice > 4) {
					System.out.println("4보다 큰수를 입력 하셨습니다. 일자 선택으로 돌아갑니다.");
					System.out.println();
					continue;
				}
			} else {
				System.out.println("일자는 31보다 클수 없습니다. 다시 입력해 주세요. 똥멍청아");
				continue;
			}
		}
	}
}