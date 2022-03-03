package ch12;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator <E>
	
	// Ŭ������ �ۼ��� ��, ObjectŸ�� ��� T�� ���� Ÿ�� ������ ���
		// public interface Iterator{
		// boolean hasNext();
		// Object next();
		// void remove();
		// } 

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("�ڹٿ�",1,1));
		list.add(new Student("�ڹ�¯",1,2));
		list.add(new Student("ȫ�浿",2,1));
		
		Iterator<Student> it = list.iterator();
//		Iterator it = list.iterator();
		while(it.hasNext()) {
//			Student s = (Student)it.next(); // ���׸����� ������� ������ ����ȯ �ʿ�.
//			Student s = it.next();
//			System.out.println(s.name);
			
			System.out.println(it.next().name);
//			System.out.println(((Student)it.next()).name);
		
		}
	} // main
}

class Student{
	String name = "";
	int ban; // ��
	int no; // ��ȣ
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
