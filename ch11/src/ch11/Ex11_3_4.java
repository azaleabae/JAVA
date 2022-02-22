package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_3_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록 한다.
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼수이뜸");
		
		while(true) {
			System.out.println(">>");
			try {
				//화면으로부터 라인단위로 입력받는다.
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim(); // trim() 문자열 앞뒤에 공백이 있으면 삭제해줌(문자열사이에 있는 공백은 두고)
				
				if("".equals(input)) continue; // 아무것도 입력받지 않았다면 지속 하라
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) { //EqualsIgnoreCase 대소문자 구분해라
					System.out.println("help - 도움말");
					System.out.println("q또는Q -  프로그램 종료");
					System.out.println("histroy - 최근에 입력한 명령어를 " + MAX_SIZE + " 개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) {
					save(input); // 입력받은 명령어를 저장하고,
					
					// LinkedList의 내용을 보여준다.
					LinkedList list = (LinkedList)q;
					
					for(int i = 0; i < list.size();i++)
						System.out.println((i+1)+"."+list.get(i));
				}else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q")){
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}// while(true) 끝
	}// main 끝

	private static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE)
			q.remove();
		
	}
	

}
