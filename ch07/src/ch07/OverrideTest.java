package ch07;

class Point3{
	int x;
	int y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:" + x + ", y" + y;
	}
	
}


class OverrideTest {

public static void main(String[] args) {
		Point3 p = new Point3(3,5);
		System.out.println(p);
		
//		p.x = 3;
//		p.y = 5;
		
		
//		System.out.println("p.x = " + p.x);
//		System.out.println("p.y = " + p.y);
//		System.out.println(p.toString());
		
		
	}

}
