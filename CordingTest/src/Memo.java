import java.util.ArrayList;
import java.util.Scanner;


// save에 어떤식으로 저장을해야 루프문 도는동안 그 데이터를 가지고있는지 모르겠음 
// 일자에 32이상 입력시 예외뜨는거 해결못함

public class Memo {

	private static int save;

	public static void main(String[] args) {

		bigloop: while (true) {

			Scanner scan = new Scanner(System.in);

			System.out.println("입고입력할 날짜를 선택해주세요 1일~31일");
			int day = scan.nextInt() - 1; // 0~30개니까 입력받은 정수 값에서 1을 뺌
			
//		java.lang.IndexOutOfBoundsException

			System.out.println("입고된 갯수를 정수를 이용해 입력해주십시오");
			int num = scan.nextInt();
			
			
			ArrayList<Integer> daylist = new ArrayList<Integer>(31);
			for (int i = 0; i < 31; i++) {
				daylist.add(i, 0);
			} // ArrayList 특성 때문에 31개의 배열에 값을 미리 0으로 넣어줌

			int save = daylist.set(day + 1, num);
			
			
			int sum = 0; // 총점
			int arraysize = daylist.size();

			// 통 합 재 고
			for (int all = 0; all < arraysize; all++) {
				sum += daylist.get(all); // 배열안의 모든 값을 더하기
			}

			long inMonth = sum;
			long dfItem = (inMonth + 10000) / 1000; // 불량 defective items. 1000개 중에 하나꼴로 불량발생
			long item = 10000; // 잔여
			long total = inMonth + dfItem + item; // 불량 포함 최종 잔여량

			// 출 력 내 용
			loop: while (true) {

				System.out.println("보고 싶은 내용을 선택하십시오(0~3)");
				System.out.println("0. 프로그램 종료");
				System.out.println("1. 월 입고 현황");
				System.out.println("2. 불량 갯수");
				System.out.println("3. 전체 갯수");
				System.out.println("4. 입고 재입력");

				int choose = scan.nextInt();

				while (0 <= choose && choose <= 4) { // 내가 입력한 값이 0~4 사이일 때
					if (choose == 0) {
						System.out.println("프로그램이 종료 됩니다.");

					} else if (choose == 1) {
						System.out.println("월에 입고된 갯수는" + inMonth + "개 입니다.");

						System.out.println("계속 진행하려면 1, 종료하려면 2를 눌러주세요.");

						int choose2 = scan.nextInt();

						if (choose2 == 1) {

							continue loop;

						} else if (choose2 == 2) {

							break loop;

						}

					} else if (choose == 2) {
						System.out.println("현재 불량개수는" + dfItem + "입니다.");
						System.out.println(""); // 한줄 비우기
						System.out.println("");
						continue loop;

					} else if (choose == 3) {
						System.out.println("현재 전체 잔여갯수는" + total + "입니다.");
						System.out.println("");
						System.out.println("");
						continue loop;
					} else if (choose == 4) {
						System.out.println("프로그램을 재실행 합니다. 현재 저장된 입고 일자는 " + (day + 1) + 
								"이며 " + "입고된 제품의 수는 " + num + "입니다.");
						System.out.println("");
						System.out.println("");
						continue bigloop;
					}

					
				} // while2 끝
				if (4 < choose) { // 4보다 큰 수를 입력하면 나오는 메시지

					System.out.println("");
					System.out.println("1~3사이의 숫자만 입력가능합니다. 올바른 값을 입력해 주십시오.");
					System.out.println("/////////////////////////////////////////////");
					System.out.println("");

				}
				continue;
			} // while 1 끝

		} // big loop 끝
		
	}
}