package ch07;
//�Ű������� ������

// ������ �Ű������� �޼��� ȣ���, �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ�Ÿ���� �ν��Ͻ��� �Ѱ��� �� �ִ�.

class Product {
	int price; // ����
	int bonus; // ���ʽ� ����Ʈ

	Product(int price) {
		this.price = price;
		bonus = (int) (price / 10.0); // int�� ����ȯ�ؼ� �Ҽ��� �Ʒ��� �����ϵ��� ����
	}
	Product(){} // �⺻������
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
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product �迭�� ���� ī����
	
	
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}

		money -= p.price; // money = money - p.price
		bonus += p.bonus;
		cart[i++] = p; // ��ǰ�� Product[] cart�� ���� 
		System.out.println(p + " ��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() { // ������ ��ǰ���� ���
		int sum = 0; // ��ǰ�� ������ �հ��ϱ��� �ʱ�ȭ
		String gameList=""; // ������ ��ǰ���
		
		for(int i = 0; i<cart.length; i++) { // īƮ�� ����ִ� ������ ����
			if(cart[i] == null)
				break; // īƮ�� ��� ������ ���������� �ݺ��ϰ� ���ٸ� ����
			sum += cart[i].price;   // sum = sum + cart[i].price; // īƮ�� ���� ���� 3���� ���� ���Ѱ��� sum�̴�.
			gameList += cart[i] + ", "; // gameList = gameList + cart[i] + ", "
		}
		System.out.println("������ ������ �ѱݾ��� " + sum + "�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + gameList + "�Դϴ�.");
	}
}

public class Ex7_9 {

	public static void main(String[] args) {

		Me m = new Me();

		m.buy(new Medieval());
		m.buy(new Showgun2());
		m.buy(new ThreeKingdom());
		m.summary();

		System.out.println("���� ���� ���� " + +m.money + "���Դϴ�.");
		System.out.println("���� ���ʽ������� " + m.bonus + "�� �Դϴ�.");

	}

}
