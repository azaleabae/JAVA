import java.util.Scanner;

public class CreateID2 {

	public String CreateID2(String id) {
		
// 조건별로 단계를 나누기
// id는 추천 아이디		
// exclude는 제외할 것들		
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("원하시는 ID를 입력하세요.");
		
		String str = sc.nextLine();

		// 1단계 대문자를 소문자로
		id = id.toLowerCase();

		
		// 2단계 a~z 0~9 -_ . 빼고 제외
		String exclude = "";
		for (int i = 0; i < id.length(); i++) { // 배열로 선언한적이 없는데 length가 왜? 가능한거지

			// charAt() 은 괄호안의 index 값을 가진 문자를 확인할 때 또는 문자열의 길이를 구할때 length랑 같이 쓰임
			// char charAt(int index)
			// int length()

			char ch = id.charAt(i);

			if (ch >= 'a' && ch <= 'z') { // ch가 a 부터 z사이의 문자 일때

				// valueOf 메서드는 () 안의 객체를 String 객체로 바꿔줌 여기서는 ch가 char(문자)니까 ch를 String으로 바꿔줌
				id += String.valueOf(ch); // a부터 z사이의 문자라면 id는 id + ch의 값을 String으로 바꿔준것이 된다.
				// id = id + String.valueOf(ch);
			
			}else if(0 <= ch && ch <= 9) { // ch가 0부터 9 까지의 문자일 때
				id += String.valueOf(ch);
			
			}else if(ch == '.' || ch == '-' || ch== '_' ) { // ch가 콤마거나 - 거나 _ 일때
				id += String.valueOf(ch);
			}
			
			
			
			// 4. 콤마가 두개 이상이면 한개로 바꿔주기
			// ccount는 comma count
			for(int ccount = 0; ccount < id.length(); ccount++) {
				if(id.indexOf(ccount) == '.') {
					id.replace("..", "."); // 한번 짜봣는데 될려나 몰르겠음
				}
				
			}
			
			if(id.length() == 0) {
				id += 'a';
			}
			
			System.out.println(id);
			
		}

		
		return exclude;
		
		

		

	}

}
