import java.util.Scanner;

public class Digit {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�Է� ��");
//		
//		var input  = sc.nextInt();
//	}
	public int �ڸ���(int input) {
		
		
		int times = 1;
		int �ڸ��� = 0;
		
		
		
		
		
		while(true) {
			if(�ڸ��� == 10) {
				return �ڸ���;
			}
			
			times *= 10;
			�ڸ���++;
			
			if(input < times) {
				return �ڸ���;
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
		
		int input�ڸ��� = �ڸ���(input);
		int search�ڸ��� = �ڸ���(search);
		int count = 0;
		
		for(int i = 0; i< input�ڸ��� - search�ڸ���; i++) {
			int �����ߵɼ� = multiplierOfTen(�ڸ���(input) - search�ڸ���);
			
			if(input / �����ߵɼ� == search) {
				count++;
			}
			input = input % multiplierOfTen(�ڸ���(input) - 1);
			�����ߵɼ� /= 10;
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

