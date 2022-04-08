import java.util.Arrays;
import java.util.Scanner;

//0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
//sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
//sample outputs: true false false true false

public class DupulicateNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = sc.next().split(""); // 하나씩 잘라서 arr에 문자를 넣어줌
		int[] intArr = new int[arr.length]; // 문자를 Integer로 변환후 넣어줄 배열

		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]); // 문자 arr[i]를 int형식으로 변환후 intArr에 삽입
		}
		
		Arrays.sort(intArr); // 비교를 위해 정렬
		
		for (int i = 0; i < arr.length; i++) {
			if (intArr[i] == i && intArr.length == 10) { // intArr에 저장된 수가 10개 이면서 동시에 배열의[i] 번째와 i의 숫자가 똑같다면.
				System.out.println("true");
				break;
			} else { // 조건을 만족하지 않으면
				System.out.println("false");
				break;
			}
		}
	} 
}
