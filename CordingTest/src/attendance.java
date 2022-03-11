import java.util.Random;
import java.util.Scanner;

// 총 인원 23명인 반에서 n번으로 랜덤하게 출석을 불렀을때
// 각 번호가 불린 횟수를 구하기

public class attendance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("출석부를 횟수를 입력해주세요.");

		int call = sc.nextInt(); // 몇번을 부를건지
		
		System.out.println("입력하신 숫자는 "+ call + "입니다.");
		System.out.println();
		
		
		int save[] = new int[call]; // 부른 학생의 번호를 저장하는 배열
		int arr[] = new int[23]; // 학생수
		Random rd = new Random();
		int Rnum = 0;
		
		for (int n = 0; n < call; n++) { // n번 부를때 n번 만큼 랜덤한 번호를 출력해서 save[]에 저장
			Rnum = rd.nextInt(22);
			save[n] = Rnum; // 랜덤하게 부른 번호를 save의 n번째에 저장
			System.out.println("호명된 학생은 " + (save[n]+1) + "번 입니다."); // 0~22라서 1 더해서 1~23으로 만들어줌
			arr[Rnum] = arr[Rnum] + 1; // 부른 번호에 부른횟수 1을 더해준다.
		}
		System.out.println();
		System.out.println("각각의 학생이 호명된 횟수를 출력합니다.");
		
		for(int i=0; i<23;i++) // 모든 번호의 학생이 몇번 불렸는지 출력 아랫문장이 한줄이니까 {} 생략
			System.out.println((i+1) + "번 학생이 호명된 횟수는 " + arr[i] + "입니다.");
		
			  
	}
}

//System.out.println((i + 1) + "번째 학생이 불린횟수는" + arr[i] +"번 입니다.");
//int Rnum = rd.nextInt(23); // 랜덤 값 1~23 를 생성
//arr[Rnum] = arr[i] + 1; // arr[1부터23] 번째의 주소에 (0부터22)+1를 더한 값을 저장

//for(int i=0; i < arr.length; i++)
//	System.out.println(i+"번째 배열 값은"+arr[i]);

//for (int n = 0; n <= call; n++) {
//	for (int i = 0; i <= 22; i++) { // 0~22 모두 돌면서 출력
//		int Rnum = rd.nextInt(22);
//		arr[Rnum] = arr[i] + 1;
//		
//	}	
//}
