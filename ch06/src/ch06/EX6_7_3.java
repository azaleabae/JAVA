package ch06;

public class EX6_7_3 {
	// ������ this()
	
	// �����ڿ��� �ٸ� ������ ȣ���� �� ���
	// �ٸ� ������ ȣ��� ù �ٿ����� ��밡��
	// �ڵ��� �ߺ��� �����Ϸ��� �ٸ� �����ڸ� ȣ���Ҷ� this()�� ����.
	
}

class car{
	String color;
	String gear;
	int door;
	
//	car(){  �Ű������� ������ ���������� ����Ʈ ���� white auto 4 �� �ض�
//		color = "white";
//		gear = "auto";
//		door = 4;
//	}
	
	car(){  // �ߺ����� - �� �ڵ忡�� �Ʒ��� �����ڸ� ȣ���ϰ� �Ѵ�.
		this("white", "auto", 4); // card�� ���� �ʰ� this �� ��� �翬�� ù��° �ٿ� �־�����Ѵ�.
	}
	
	car(String c, String g, int d){
		color = c;
		gear = g;
		door = d;
	}

}
