package ch07;


abstract class Player{ // �߻� Ŭ����(�̿ϼ� Ŭ����, �̿ϼ� ���赵

	abstract void play(int pos); // �߻� �޼��� (�̿ϼ� �޼���)
	abstract void stop(); // �߻� �޼��� ����θ� �ְ� ������{}�� ���� �޼���
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "��ġ���� play");
	}
	void stop() {
		System.out.println("����� ����ϴ�.");
	}
}
public class PlayerTest {

	public static void main(String[] args) { // �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������

//		Player p = new Player(); // �߻� Ŭ������ ��ü�� ����
//		AudioPlayer ap = new AuodioPlayer(); 
		Player ap = new AudioPlayer(); // ������
		ap.play(100);
		ap.stop();

	}

}
