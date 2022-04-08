import java.util.LinkedList;
import java.util.Scanner;

public class RotationList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] original = sc.nextLine().split(" ");
		LinkedList<String> output = new LinkedList<String>();

		int num = Integer.parseInt(original[0]);
		int push = original.length - num;
		int pull = (num * -1) + 1;
//		int overPush = original.length - (num - (original.length - 1));
//		int overPull = (num * -1) - 4;

//		if (num > original.length) {
//			for (int i = overPush; i < original.length; i++)
//				output.add(original[i]);
//
//			for (int i = 1; i < overPush; i++)
//				output.add(original[i]);
//
//			System.out.println(output);
//		} else if (num*-1 > original.length ) {
//			for (int i = overPull; i < original.length; i++)
//				output.add(original[i]);
//
//			for (int i = 1; i < overPull; i++)
//				output.add(original[i]);
//
//			System.out.println(output);
//		} 
		if (num >= 0) {
			for (int i = push; i < original.length; i++)
				output.add(original[i]);

			for (int i = 1; i < push; i++)
				output.add(original[i]);

			System.out.println(output);
		} else if (num < 0) {
			for (int i = pull; i < original.length; i++)
				output.add(original[i]);

			for (int i = 1; i < pull; i++)
				output.add(original[i]);

			System.out.println(output);
		}
	}
}
