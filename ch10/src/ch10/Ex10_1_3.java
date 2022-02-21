package ch10;

// Calendar 클래스 - 예제 2,3

	// set()으로 날짜와 시간지정하기

		// void set(int field, int value)
		// void set(int year, int month, int date)
		// void set(int year, int month, int date, int hourOfDat, int minute)
		// void set(int year, int month, int date, int hourOfDat, int minute, int second)

	// 날짜 지정하는 방법. 월(month)이 0부터 시작한다는 점에 주의
	
		// Calendar date1 = Calendar.getInstance();
		// date1.set(2017,7,15);

	// 시간 지정하는 방법.

		// Calendar time1 = Calendar.getInstance();
		// time1.set(Calendar.HOUR_OF_DAY, 10); // time1을 10시 20분 30초로 설정
		// time1.set(Calendar.MINUTE, 20);
		// time1.set(Calendar.SECOND, 30);
	

public class Ex10_1_3 {

	public static void main(String[] args) {

	}

}
