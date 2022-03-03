import java.util.Scanner;

public class Digit {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력 값");
//		
//		var input  = sc.nextInt();
//	}
	public int 자리수(int input) {
		
		
		int times = 1;
		int 자리수 = 0;
		
		
		
		
		
		while(true) {
			if(자리수 == 10) {
				return 자리수;
			}
			
			times *= 10;
			자리수++;
			
			if(input < times) {
				return 자리수;
			}
	
		}
	}
	public int multiplierOfTen(int input) {
		int num = 1;
			
		for(int i = 0; i < input; i++) {
			num *= 10;
		}
		return num;
	}
	
	public int searchValue(int input, int search) {
		
		int input자리수 = 자리수(input);
		int search자리수 = 자리수(search);
		int count = 0;
		
		for(int i = 0; i< input자리수 - search자리수; i++) {
			int 나눠야될수 = multiplierOfTen(자리수(input) - search자리수);
			
			if(input / 나눠야될수 == search) {
				count++;
			}
			input = input % multiplierOfTen(자리수(input) - 1);
			나눠야될수 /= 10;
		}
		return count;
	}
	
	public int searchValueTotal(int start, int end, int searchValue) {
		int total = 0;
		
		for(int i = start; i < end; i++) {
			int input = start;
			start++;
			
		}
		return total;
		
	}
}

