package ch07;
//매개변수의 다형성

// 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

class Product {
	int price; // 가격
	int bonus; // 보너스 포인트

	Product(int price) {
		this.price = price;
		bonus = (int) (price / 10.0); // int로 형변환해서 소수점 아래는 무시하도록 해줌
	}
	Product(){} // 기본생성자
}

class Medieval extends Product {

	Medieval() {
		super(3200);
	}

	public String toString() {
		return " Medieval";
	}

}

class Showgun2 extends Product {

	Showgun2() {
		super(2700);
	}

	public String toString() {
		return " Shogun2";
	}

}
class ThreeKingdom extends Product {
	
	ThreeKingdom() {
		super(3200);
	}
	
	public String toString() {
		return " ThreeKingdom";
	}
	
}

class Me {
	int money = 10000;
	int bonus = 0;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열에 사용될 카운터
	
	
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money -= p.price; // money = money - p.price
		bonus += p.bonus;
		cart[i++] = p; // 제품을 Product[] cart에 저장 
		System.out.println(p + " 을/를 구매하셨습니다.");
	}
	
	void summary() { // 구매한 물품정보 요약
		int sum = 0; // 물품의 가격을 합계하기전 초기화
		String gameList=""; // 구매한 물품목록
		
		for(int i = 0; i<cart.length; i++) { // 카트에 담겨있는 각각의 게임
			if(cart[i] == null)
				break; // 카트에 담긴 게임이 없을때까지 반복하고 없다면 멈춤
			sum += cart[i].price;   // sum = sum + cart[i].price; // 카트에 담기는 게임 3개의 값을 더한값은 sum이다.
			gameList += cart[i] + ", "; // gameList = gameList + cart[i] + ", "
		}
		System.out.println("구매한 게임의 총금액은 " + sum + "입니다.");
		System.out.println("구입하신 제품은 " + gameList + "입니다.");
	}
}

public class Ex7_9 {

	public static void main(String[] args) {

		Me m = new Me();

		m.buy(new Medieval());
		m.buy(new Showgun2());
		m.buy(new ThreeKingdom());
		m.summary();

		System.out.println("현재 남은 돈은 " + +m.money + "원입니다.");
		System.out.println("현재 보너스점수는 " + m.bonus + "점 입니다.");

	}

}
