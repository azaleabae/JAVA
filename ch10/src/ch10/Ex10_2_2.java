package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDecimalFormat

	// ��¥�� �ð��� �پ��� ���������� ����� �� �ְ� ���ش�.

	

public class Ex10_2_2 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		// ���� ��¥�� yyyy-MM-dd���·� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		String result = df.format(today);
		
		
		// Ư�� �������� �Ǿ� �ִ� ���ڿ����� ��¥�� �ð��� �̾Ƴ� ���� �ִ�.
		
			// DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��")
			// DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd")
		
			// Date d = df.parse("2015�� 11�� 23��"); // ���ڿ��� Date�� ��ȯ
			// String result = df2.format(d);
		
	}

}
