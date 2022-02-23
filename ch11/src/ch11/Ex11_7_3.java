package ch11;

import java.util.HashSet;
import java.util.Objects;

// HashSet = 예제3

	// HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
	// 같은객체가 없으면 저장하고, 있으면 저장하지 않는다.
	
	// boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
	// equals()와 hashCode()가 오버라이딩 되어 있어야 함

public class Ex11_7_3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이라 저장 안됨
		set.add(new Person("David",10));
		set.add(new Person("David",10)); // Equals랑 hashcode 가 없으면 중복 저장됨 
		
		System.out.println(set);
	
	}

}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 올바르게 동작한다.
class Person{
	@Override
	public int hashCode() {
		// int hash(Object...values) // 가변인자
		return Objects.hash(name, age);
		// 나머지는 hash란 메서드가 알아서 해줌
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		// 나자신(this)의 이름과 나이를 p와 비교
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
