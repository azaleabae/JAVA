package ch11;

import java.util.HashSet;
import java.util.Objects;

// HashSet = ����3

	// HashSet�� ��ü�� �����ϱ����� ������ ���� ��ü�� �ִ��� Ȯ��
	// ������ü�� ������ �����ϰ�, ������ �������� �ʴ´�.
	
	// boolean add(Object o)�� ������ ��ü�� equals()�� hashCode()�� ȣ��
	// equals()�� hashCode()�� �������̵� �Ǿ� �־�� ��

public class Ex11_7_3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // �ߺ��̶� ���� �ȵ�
		set.add(new Person("David",10));
		set.add(new Person("David",10)); // Equals�� hashcode �� ������ �ߺ� ����� 
		
		System.out.println(set);
	
	}

}

// equals()�� hashCode()�� �������̵��ؾ� HashSet�� �ùٸ��� �����Ѵ�.
class Person{
	@Override
	public int hashCode() {
		// int hash(Object...values) // ��������
		return Objects.hash(name, age);
		// �������� hash�� �޼��尡 �˾Ƽ� ����
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		// ���ڽ�(this)�� �̸��� ���̸� p�� ��
		return this.name.equals(p.name) && this.age == p.age;
		
	}

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
