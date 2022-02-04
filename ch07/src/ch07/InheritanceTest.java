package ch07;

class Point2{
	int x;
	int y;
}

//class Circle extends Point{ // 상속
//	int r;
//}

class Circle extends Object{ // 포함
	Point2 p;  //= new Point();
	int r;
	
	Circle(){
		p = new Point2();
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x =" + c.x);
//		System.out.println("c.y =" + c.y);
//		System.out.println("c.r =" + c.r);
		
//		c.p.x = 1;
//		c.p.y = 2;
//		c.p.x = 3;
//		System.out.println("c.p.x =" + c.p.x);
//		System.out.println("c.p.y =" + c.p.y);
//		System.out.println("c.r =" + c.r);
		
		System.out.println(c.toString()); // 오브젝트 클래스는 모든 클래스의 최상위 클래스 
		System.out.println(c); // println은 괄호안에 참조변수가 들어오면 자동으로 toString을 호출한다.

	}

}
