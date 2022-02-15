package ch02;

public class Varex4 {

	public static void main(String[] args) {
		int x = 4, y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp; // x 와 y 의 값을 서로 바꾸려면 변수가 하나더 필요함
		
		System.out.println("x = " + x);
		System.out.println("y = "+ y);
		}
}
