import java.util.Scanner;

// 게시판 총 페이지수 구하기
// 용수는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

	// 입력: 총건수(m), 한페이지에 보여줄 게시물수(n)(n은 1보다 크거나 같음)
	// 출력: 총페이지수


public class BoardPage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 건수를 입력해주세요.");
		int total = sc.nextInt();
		
		System.out.println("한 페이지에 보여줄 게시물수를 입력해 주세요.");
		int item = sc.nextInt();
		
		int page = total / item;
		if(page % 2 == 0) {
			System.out.println("필요한 페이지의 수는 " + page + "입니다.");
		} else if(page % 2 == 1) {	
			System.out.println("필요한 페이지의 수는 " + (page+1)  + "입니다.");
		}
	}
}

// 다른 사람이 람다로 풀어놓은거 

//private int getPagingCount(int totalCnt, int pageCnt){
//
//int cnt = totalCnt / pageCnt;
//
//cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;
//
//return cnt;
//}
