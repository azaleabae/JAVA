package ch12;

import java.util.ArrayList;

// ���׸��� ���

	// Box<T> ���׸� Ŭ����. "T�� Box'�Ǵ� 'T Box'��� �д´�.
	// T Ÿ�� ���� �Ǵ� Ÿ�� �Ű�����.(T�� Ÿ�� ����)
	// Box ����Ÿ�� (raw type) �Ϲ� Ŭ���� -> ���׸�Ŭ���� 

	// ����Ÿ��
		// class Box<T>{}

	// ���Ե� Ÿ��(�Ű�����ȭ�� Ÿ��, parameterized type)
		// Box<String> b = new Box<String>();


// ���׸� Ÿ�԰� ������

	// ���������� �������� ���Ե� Ÿ���� ��ġ�ؾ� �Ѵ�.
		// class product{ } 
		// class Tv extends Product{ }
		// class Audio extends Product{ }
		// ArrayList<Tv>	list = new ArrayList<tv>(); // ��ġ
		// ArrayList<product>	list = new ArrayList<tv>(); // �ڼհ� ������迩�� Ÿ���� ����ġ�ϸ� ���� 

	// ���׸� Ŭ�������� �������� ����.(������ ���Ե� Ÿ���� ��ġ�ؾ� ��)
		// List<Tv> list = new ArrayList<Tv>(); // ������. ArrayList�� List�� ����
		// List<Tv> list = new LinkedList<Tv>(); // ������ LinkedList�� List�� ����

	// �Ű������� �������� ����
		// ArrayList<product()>; list = newArrayList<Product>();
		// list.add(new Product());
		// list.add(new Tv());	// OK.
		// list.add(new Audio()); // OK.

class Product{}		
class Tv2 extends Product{}
class Audio2 extends Product{}


public class Generics3 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv2>      tvList = new ArrayList<Tv2>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // ����.
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. ������

		productList.add(new Tv2());
		productList.add(new Audio2());

		tvList.add(new Tv2());
		tvList.add(new Tv2());

		printAll(productList);
		// printAll(tvList); // ������ ������ �߻��Ѵ�.
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}

