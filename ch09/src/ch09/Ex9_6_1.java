package ch09;

// ch9 - 12 join()과 StringJoiner 

	//join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
		// String animals = "dog,cat,bear";
		// String[] arr = animals.split(",");
		// String str = String.join("-" arr);

public class Ex9_6_1 {
	public static void main(String[] args) {
		
		 String animals = "dog,cat,bear";
		 String[] arr = animals.split(",");
		 String str = String.join("-", arr);  //  배열의 문자열을 '-'로  구분해서 결합-> 구분자 
		 
		 System.out.println(arr[0]);
		 System.out.println(str);   // dog - cat - bear
		 
	}

}
