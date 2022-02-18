package ch09;

import java.util.Objects;

//toString(),toString()의 오버라이딩
// toString():객체를 문자열(String)으로 변환하기 위한 메서드

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Card))
			return false;

		Card c = (Card) obj;
		return this.kind.equals(c.kind) && this.number == c.number;

	}

	// Object클래스의 toSTring()능 오버라이딩
	public String toString() {
		return "kind:" + "kind" + ",number:" + number;
	}
}

class Ex9_2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
