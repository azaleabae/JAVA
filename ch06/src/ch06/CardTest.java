package ch06;

class CardTest{
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.kind = "��Ʈ";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "�����̽�";
		c2.number = 1;

		System.out.println("ù��° ī��� " + c1.kind + "�����̸� ���ڴ� " + c1.number + " �Դϴ�. ���̿� �ʺ�� "+ 
		c1.height + "," + c1.width + " �Դϴ�.");
		
		System.out.println("ù��° ī��� " + c2.kind + "�����̸� ���ڴ� " + c2.number + " �Դϴ�. ���̿� �ʺ�� "+ 
				c2.height + "," + c2.width + " �Դϴ�.");
	}
}

class Card{
	String kind; // iv
	int number;
	
	static int width = 100; // cv
	static int height = 250;
	
	// ��ü�� iv(�ν��Ͻ� ����)�� ����
	// �޼���� ��ɹ��� �����̴�.
	
}
