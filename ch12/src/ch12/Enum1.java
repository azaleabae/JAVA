package ch12;

// �������� ���� - java.lang.Enum
// ��� �������� Enum�� �ڼ��̸�, �Ʒ��� �޼��带 ��ӹ޴´�.
// class<E> getDeclaringClass()	->	�������� Class��ü�� ��ȯ
// String name()	->	������ ����� �̸��� ���ڿ��� ��ȯ
// int ordinal()	->	������ ����� ���ǵ� ������ ��ȯ(0���� ����)
// T valueOf(Class<T> enumType, String name)	->	������ ���������� name�� ��ġ�ϴ� ������ ����� ��ȯ

// values(),valueOf�� �����Ϸ��� �ڵ����� �߰�
// static E[] values()
// static E valueOf(String name)
// Direction[] Arr = Direction.values();
// for(Direction d : Arr)	// for(Diretion d : direction.values())
// System.out.printf("%s=%d%n", d.name(), d.ordinal());


//				   0	  1		2	  3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Enum1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);

		System.out.println("d1==d2 ? " + (d1 == d2)); // false
		System.out.println("d1==d3 ? " + (d1 == d3)); // true
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // ����
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

		switch (d1) {
		case EAST: // Direction.EAST��� �� �� ����.
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;
		default:
			System.out.println("Invalid direction.");
			break;
		}

		Direction[] dArr = Direction.values();

		for (Direction d : dArr) // for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
	}

}
