package ch12;

// ���׸� Ÿ���� ����
	// �����Ϸ��� ���׸� Ÿ���� �����ϰ�, �ʿ��� ���� ����ȯ�� �ִ´�.
		// 1. ���׸� Ÿ���� ���(bound)�� ����
		// 2. ���׸� Ÿ�� ���� �Ŀ� Ÿ���� ����ġ�ϸ� ����ȯ�� �߰�
		// 3. ���ϵ� ī�尡 ���Ե� ���, ������ Ÿ������ ����ȯ �߰�


// ������(enum)
	// ���õ� ������� ���� ���� ������. java�� Ÿ�Կ� ������ �������� ����

	// �������� �����ϴ� ���
		// enum ������ �̸�{�����1, �����2, ...}
		// eunm Direction{EAST, SOUTH, WEST, NORTh}

	// ������ Ÿ���� ������ �����ϰ� ����ϴ� ���
		// class unit{
			// int x,y;	// ������ ��ġ
			// Direction dir;	// ������ �ν��Ͻ� ������ ����

			// void init() {
				// dir = Direction.EAST; // ������ ������ EAST�� �ʱ�ȭ
			// }
		// }
	// ������ ����� �񱳿� ==�� compareTo() ��밡��
		// if(dir == Direction.EAST){
			// x++;
		// }else if(dir > Direction.WEST){ // ���� ������ ����� �񱳿����� ���Ұ�
			// ...
		// }else if (dir.compareTo(Direction.WEST) > 0) { // compareTo()�� ��밡��
		// }
	
public class GenericType2 {

}