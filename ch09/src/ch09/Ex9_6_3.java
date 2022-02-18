package ch09;

public class Ex9_6_3 {

	public static void main(String[] args) {

		int iVal = 100;
		
		String strVal = String.valueOf(iVal);  // int를 String으로 // 아래것과 값은 똑같은데 계산할때는 이게 빠름 
//		String strVal = iVal + ""; // int를 String으로
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); // 문자열을 숫자로
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2,"=")+sum);
		System.out.println(strVal+ "+" +strVal2+ "=" + sum2);
	}

}
