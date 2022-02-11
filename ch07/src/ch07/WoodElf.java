package ch07;

abstract class Archer {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("����ϴ�.");
	}
}

interface Fightable { // �������̽��� ��� �޼���� public abstract. ���ܾ���
	void move(int x, int y); // public abstract �� ������

	void attack(Fightable f); // public abstract �� ������
}

class Fighter extends Archer implements Fightable {
	public void move(int x, int y) {
		System.out.println("[" + x + "],[" + y + "]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}
	
	//�ο� �� �ִ� ��븦 �ҷ��´�.
	Fighter getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
}

public class WoodElf {

	public static void main(String[] args) {
	
//		Archer a = new Fighter(); // Archer���� attack()�� ��� ȣ��Ұ�
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
	

	}

}
