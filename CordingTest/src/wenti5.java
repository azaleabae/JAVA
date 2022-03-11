import java.util.Scanner;

// 있는 옷중에 랜덤하게 추천해주기

public class wenti5 {

	public static void main(String args[]) {

		System.out.println(" *** 패션 고자를 위한 랜덤 코디 추천 *** ");
		System.out.println(" ");

		String[] out = new String[] { "코트", "블루종", "가디건", "블레이져" };
		String[] up = new String[] { "셔츠", "티", "스웨터", "베스트","카라 티" };
		String[] low = new String[] { "청바지", "면바지", "슬렉스", "카고 바지" };

		Scanner sc = new Scanner(System.in);

		System.out.println(" 요일을 입력해 주세요. ");

		char input = sc.next().charAt(0);

		int outR = (int) (Math.random() * 4);
		int upR = (int) (Math.random() * 5);
		int lowR = (int) (Math.random() * 4);
		int holidayR = (int) (Math.random() * 2) + 1;

		if ((input == '월')||(input == '화')||(input == '수')||(input == '목')||(input == '금')) {
			
			System.out.println("외투로는 " + out[outR] + "를 추천 드립니다.");
			System.out.println("상의로는 " + up[upR] + "를 추천 드립니다.");
			System.out.println("하의로는 " + low[lowR] + "를 추천 드립니다.");
		
		} else if ((input == '토')||(input=='일')) {
			
			System.out.println("외투로는 " + out[holidayR] + "를 추천 드립니다.");
			System.out.println("상의로는 " + up[holidayR] + "를 추천 드립니다.");
			System.out.println("하의로는 " + low[holidayR] + "를 추천 드립니다.");
		
		} else {
			
			System.out.println("정확한 요일을 입력해주세요.");
		
		}

	}
}
