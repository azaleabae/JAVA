package ch10;

// 형식화 클래스

	// java.text패키지의 DecimalFormat, SimpleDateFormat
	

	//DecimalFormat

	// 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자, 날짜) -> 형식 문자열
		
		// double number = 1234567.89;
		// DecimalFormat df = new DecimalFormat("#.#E0");
		// String result = df.format(number);

	
	// 특정 형식의 문자열을 숫자로 변환할 때도 사용(형식 문자열 - > 숫자)

		//DecimalFormat df = new DecimalFormat("#,###.##");
		// Number num = df.parse("1,234,567.89");
		// double d = num.doubleValue(); // 1234567.89

		// 참고 integer.parseint()는 콤마(,)가 포함된 문자열을 숫자로 변환 못함
	
	
	
		
			

public class Ex10_2_1 {

}
