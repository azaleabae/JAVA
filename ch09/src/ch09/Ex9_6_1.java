package ch09;

// ch9 - 12 join()�� StringJoiner 

	//join()�� ���� ���ڿ� ���̿� �����ڸ� �־ �����Ѵ�.
		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",");
		// String str = String.join("-" arr);

public class Ex9_6_1 {
	public static void main(String[] args) {
		
		 String animals = "dog,cat,bear";
		 String[] arr = animals.split(",");
		 String str = String.join("-", arr);  //  �迭�� ���ڿ��� '-'��  �����ؼ� ����-> ������ 
		 
		 System.out.println(arr[0]);
		 System.out.println(str);   // dog - cat - bear
		 
	}

}
