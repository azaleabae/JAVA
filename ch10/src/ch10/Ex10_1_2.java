package ch10;

// Calendar 클래스

	// 추상 클래스이므로 GetInstance()를 통해 구현된 객체를 얻어야 한다.
	// Calendar cal = new Calendar(); // 추상클래스는 인스턴스를 생성할 수 없다.

	// OK, getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환한다.
	// Calendar cal = Calendar.getInstance();

	//get()으로 날짜와 시간 필드 가져오기 - int get(int field)

		// Calendar cal = Calendar.GetInstance(); // 현재 날짜와 시간으로 셋팅됨
		// int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지 알아낸다.
		// int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막날

public class Ex10_1_2 {

}
