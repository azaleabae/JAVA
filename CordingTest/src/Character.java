import java.util.*;

public class Character {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		int count = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != ' ') { // ������ �ƴ϶��
				count++;
			} 	
		}	
		System.out.println(count);	
	}
}
