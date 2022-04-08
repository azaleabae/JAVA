import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		ArrayList list = new ArrayList();
		ArrayList rev = new ArrayList();
		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			list.add(Integer.parseInt(str[i]));
			rev.add(Integer.parseInt(str[i]));
		}
		Collections.reverse(rev);
		
		for(int i = 0; i<str.length;i++) {
			if(list.get(i) == rev.get(i)) {
				count++;
			} 
		}
		if(count == str.length) {
			System.out.println("같은 수");
		} else {
			System.out.println("다른 수");
		}	 
	}
}
