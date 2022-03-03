package ch12;

// ���ϵ� ī��<?>

// �ϳ��� ���� ������ ���Ե� Ÿ���� �ٸ� ��ü�� ���� ����
// ArrayList<? extends Product> list = new ArrayList<Tv>();	// OK
// ArrayList<> extends Product> list = new ArrayList<Audio>(); // OK
// ArrayList<Product> list = new ArrayList<Tv>(); // ���� ���Ե� Ÿ�� ����ġ

// <? extends T> ���ϵ� ī���� ���� ����. T�� �� �ڼյ鸸 ����
// <? super T> ���ϵ� ī���� ��������. T�� �� ����鸸 ����
// <?> ���� ����. ��� Ÿ���� ����.<? extends Object>�� ����

// �ż����� �Ű������� ���ϵ� ī�带 ���
// static Juice makeJuice(FruitBox<? extends Fruit> box){
// String tmp = "";
// for(Fruit f : box.getList()) tmp += f + " ";
// return new Juice(tmp);
// }
// System.out.println(Juicer.makeJuice(new FruitBox<Fruit>()));
// System.out.println(Juicer.makeJuice(new FruitBox<Apple>()));

import java.util.ArrayList;

class Fruit2 {
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape";
	}
}

class Juice {
	String name;

	Juice(String name) {
		this.name = name + "Juice";
	}

	public String toString() {
		return name;
	}
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) { // ����Ʈ
		String tmp = "";

		for (Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class WildCard {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main
}

class FruitBox2<T extends Fruit2> extends Box2<T> {
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}