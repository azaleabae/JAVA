package ch04;

public class Ex4_5 {

	public static void main(String[] args) {

		int score = 85;
		
		if(90 <= score) {
			System.out.println("굉장한 점수네요! 합격입니다.");
		}else if(80 <= score){
			System.out.println("축 합격");
		}else if(60 <= score) {
			System.out.println("아슬아슬하게 합격");
		}else {
			System.out.println("너는 아직 준비가 안됐다.");
		}
		
	}

}