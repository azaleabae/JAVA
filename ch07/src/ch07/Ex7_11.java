package ch07;

public class Ex7_11 {

// �߻� Ŭ���� 
	
	// �̿ϼ� ���赵. �̿ϼ� �޼��带 ���� �ִ� Ŭ����
	// �̿ϼ� �޼���. ������(����),{ } �� ���� �޼���
	
	// �⺻��
	// abstract ����Ÿ�� �޼����̸�();  	
}

abstract class Player2 { // �߻� Ŭ����
	abstract void play(int pos); // �߻� �޼���
	abstract void stop(); //�߻�޼���
}


class AudioPlaye2r extends Player2{ 
	void play(int pos) {} // �߻� �޼��带 ����
	void stop() {}//�߻�޼��带 ����
}

abstract class abstractPlayer2 extends Player2{
	void play(int pos) {}
	// Player�� �޼����߿� �ϳ��� �����߱� ������ abstract �� class �տ� �ٿ������ �ƴϸ� ����
	// �ڵ�δ� ������ ������ �����δ� abstract void stop(); ���� �׷��� �Ѵ� ������ ����� abstract�� ������ �� �ִ�.
}
