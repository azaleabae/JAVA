import java.util.Scanner;

//네이버 글자수세기 등 특정 글의 글자를 세는 프로그램은 일반적으로 공백을 제외한 글자수만을 세는 기능도 가지고 있다.
//어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
public class DeleteSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("아무문장이나 입력하십시오.");
		String mj = sc.nextLine();
		int count = 0;
		
		for(int i=0; i<mj.length();i++) {
			if(mj.charAt(i) == ' ') {
				count++;
			}
		}
		int sum = mj.length() - count;
		System.out.println(sum);
	}

}
