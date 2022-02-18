import java.util.Scanner;

public class inputText {

	public static void main(String[] args) {
		
		int count = 0;					// 입력받을 숫자의 개수 
		int[] num;						// 입력받을 숫자 
		int numMax = 0;					// 최대값 
		int search;						// 검색할 숫자 
		Boolean searchCheck = false;	// 검색한 숫자 체크 
		
		Scanner scanner = new Scanner(System.in);
		// 입력받을 숫자 개수 입력받기
		System.out.print("입력할 숫자의 개수는 ? (100개 미만) : ");
		count = scanner.nextInt();
		num = new int[count];		
		
		// 숫자 입력받기 
		System.out.print(count + " 개의 숫자를 입력하세요! : ");
		for (int i = 0 ; i < count ; i++) {
			num[i] = scanner.nextInt();		
		}
		
		// 검색할 숫자 받기 
		System.out.print("검색할 숫자는 ? :");
		search = scanner.nextInt();
		
		// 검색할 숫자 체크 후 출력 
		for (int i = 0 ; i < count ; i++)
			if (search == num[i]) {
				searchCheck = true;
				System.out.println(search + "의 위치는 " + i + "번째 입니다.");
			}				
		
		if (!searchCheck)
			System.out.println(search + "는 존재하지 않습니다.");
	}	
}