package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_9_2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // 이중에 하나를 입력해야 "일치합니다"가 출력되고 for문이 끝남 그게 아니라면 반복

		Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받음

		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim(); // trim 공백 없애주는
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 아뒤는 존재하지 않습니다. 다시쓰셈.");
				continue;
			}

			if (!(map.get(id)).equals(password)) {
				System.out.println("비밀번호 불일치 다시 써주셈.");
			} else {
				System.out.println("일치합니다..");
				break;
			}
		} // while
	} // main끝
}
