package ch07;

public class Unit {

	public static void main(String[] args) {
//		Unit[] group = new Unit[3];
//		group[0] = new Wicth();
//		group[1] = new harpy();
//		group[2] = new Hydra();
		
		Unit[]group = {new Witch(), new Harpy(), new Hudra()};
	}
	
	abstract class Unit{
		int x,y;
		abstract void move(int x, int y);
		void stop() {/* 현재 위치에 정지*/}
	}
	
	class Witch extends Unit{
		void move(int x, int y) {
			System.out.println("Witch [" + x +", "+ y +" ]");
		}
		void fastrun() {/*빨리뛰기"*/}
	}
	
	class Harpy extends Unit{
		void move(int x, int y) {
			System.out.println("Harpy [" + x +", "+ y +" ]");
		}
		void fastfly() {/*빨리날기"*/}
	}
	class Hydra extends Unit{
		void move(int x, int y) {
			System.out.println("Hydra [" + x +", "+ y +" ]");
		}
		void fastswim() {/*빨리헤엄치기"*/}
	}

}
