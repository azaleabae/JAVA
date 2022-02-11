package ch07;

abstract class Archer {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract. 예외없이
	void move(int x, int y); // public abstract 가 생략됨

	void attack(Fightable f); // public abstract 가 생략됨
}

class Fighter extends Archer implements Fightable {
	public void move(int x, int y) {
		System.out.println("[" + x + "],[" + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	//싸울 수 있는 상대를 불러온다.
	Fighter getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
}

public class WoodElf {

	public static void main(String[] args) {
	
//		Archer a = new Fighter(); // Archer에는 attack()이 없어서 호출불가
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
	

	}

}
