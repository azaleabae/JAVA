package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDecimalFormat

	// 날짜와 시간을 다양한 형ㅅ기으로 출력할 수 있게 해준다.

	

public class Ex10_2_2 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		// 오늘 날짜를 yyyy-MM-dd형태로 변환하여 반환한다.
		String result = df.format(today);
		
		
		// 특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
		
			// DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일")
			// DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd")
		
			// Date d = df.parse("2015년 11월 23일"); // 문자열을 Date로 변환
			// String result = df2.format(d);
		
	}

}
