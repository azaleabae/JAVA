import java.util.Scanner;

// 입력받은 수 부터 100까지의 짝수 출력하고 합 구하기

public class wenti {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1~100사이의 숫자를 입력하세요.");

		int sum = 0;

		for (int a = sc.nextInt(); a < 101; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
				int arr[] = new int[] { a };
				for (int i = 0; i < arr.length; i++) {
					sum = sum + arr[i]; // ??? 넘모 복잡행... wenti 2번으로 ㄱ
				}
			}
		}

		System.out.println(" ");
		System.out.println("입력하신 숫자부터 100까지의 짝수총합은 " + sum + "입니다.");

	}
}
