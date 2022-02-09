package ch07;

public class DarkElf {

	public  void main(String[] args) {
//		Unit[] group = new Unit[3];
//		group[0] = new Wicth();
//		group[1] = new harpy();
//		group[2] = new Hydra();
		
		Unit[] group = { new Witch(), new Harpy(), new Hydra() };
		
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
	
	

	abstract class Unit{
		int x,y;
		abstract void move(int x, int y);
		void stop() {/* ÇöÀç À§Ä¡¿¡ Á¤Áö*/}
	}
	
	class Witch extends Unit{
		void move(int x, int y) {
			System.out.println("Witch [" + x +", "+ y +" ]");
		}
		void fastrun() {/*»¡¸®¶Ù±â"*/}
	}
	
	class Harpy extends Unit{
		void move(int x, int y) {
			System.out.println("Harpy [" + x +", "+ y +" ]");
		}
		void fastfly() {/*»¡¸®³¯±â"*/}
	}
	class Hydra extends Unit{
		void move(int x, int y) {
			System.out.println("Hydra [" + x +", "+ y +" ]");
		}
		void fastswim() {/*»¡¸®Çì¾öÄ¡±â"*/}
	}
}
