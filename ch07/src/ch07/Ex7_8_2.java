package ch07;

public class Ex7_8_2 {

}

class TotalWar {
	TotalWar t = new TotalWar();

	void attack() {
	}

	void defence() {
	}

}

class Warhammer extends TotalWar {
	Warhammer w = new Warhammer();

	void magic() {
	}

//	System.out.println(w instanceof Object);
}

class Dlc {

	
		void Change(TotalWar t){
			Warhammer w = (Warhammer)t;
	
				System.out.println(w instanceof Object);
				System.out.println(w instanceof TotalWar);
				System.out.println(w instanceof Warhammer);
				System.out.println("111");
		}
	}
