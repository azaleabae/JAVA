package ch03;

public class Ex3_4 {

	public static void main(String[] args) {

		int i = -10;
		i = -i;
		// '-'는 피연산자의 부호를 반대로 변경
		// i에도 -를 써줬기 때문에 값이 -10이 아닌 양수 10으로 출력됨
		System.out.println(i);
	}

}
