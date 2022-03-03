package ch12;

import java.util.HashMap;

public class Iterator2 {

	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<>();
		map.put("ÀÚ¹Ù¿Õ", new Student2("ÀÚ¹Ù¿Õ",1,1,100,100,100));
		
		Student2 s = (Student2)map.get("ÀÚ¹Ù¿Õ");
		
		System.out.println(map);
	}
}

class Student2{
	
	String name = "";
	int ban; // ¹İ
	int no; // ¹øÈ£
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}