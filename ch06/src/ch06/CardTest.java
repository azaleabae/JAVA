package ch06;

class CardTest{
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.kind = "하트";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "스페이스";
		c2.number = 1;

		System.out.println("첫번째 카드는 " + c1.kind + "무늬이며 숫자는 " + c1.number + " 입니다. 높이와 너비는 "+ 
		c1.height + "," + c1.width + " 입니다.");
		
		System.out.println("첫번째 카드는 " + c2.kind + "무늬이며 숫자는 " + c2.number + " 입니다. 높이와 너비는 "+ 
				c2.height + "," + c2.width + " 입니다.");
	}
}

class Card{
	String kind; // iv
	int number;
	
	static int width = 100; // cv
	static int height = 250;
	
	// 객체는 iv(인스턴스 변수)의 묶음
	// 메서드는 명령문의 집합이다.
	
}
