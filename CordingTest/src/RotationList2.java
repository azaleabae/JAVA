import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class RotationList2 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int input = Integer.parseInt(arr[0]);
		
		for(int i=1;i<arr.length;i++) 
			list.add(arr[i]);
		
		Collections.rotate(list, input); // list�� ��Ҹ� input��ŭ �̵���Ű�� �޼��� 
		System.out.println(list);	
	}
}
