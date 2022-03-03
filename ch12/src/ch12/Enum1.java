package ch12;

// 열거형의 조상 - java.lang.Enum
// 모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다.
// class<E> getDeclaringClass()	->	열겨형의 Class객체를 반환
// String name()	->	열거형 상수의 이름을 문자열로 반환
// int ordinal()	->	열거형 상수가 정의된 순서를 반환(0부터 시작)
// T valueOf(Class<T> enumType, String name)	->	지정된 열거형에서 name과 일치하는 열거형 상수를 반환

// values(),valueOf는 컴파일러가 자동으로 추가
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
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

		switch (d1) {
		case EAST: // Direction.EAST라고 쓸 수 없다.
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
