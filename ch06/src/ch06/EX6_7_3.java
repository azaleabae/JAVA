package ch06;

public class EX6_7_3 {
	// 생성자 this()
	
	// 생성자에서 다른 생성자 호출할 때 사용
	// 다른 생성자 호출시 첫 줄에서만 사용가능
	// 코드의 중복을 제거하려고 다른 생성자를 호출할때 this()를 쓴다.
	
}

class car{
	String color;
	String gear;
	int door;
	
//	car(){  매개변수를 지정해 주지않으면 디폴트 값을 white auto 4 로 해라
//		color = "white";
//		gear = "auto";
//		door = 4;
//	}
	
	car(){  // 중복제거 - 이 코드에서 아래의 생성자를 호출하게 한다.
		this("white", "auto", 4); // card를 쓰지 않고 this 를 사용 당연히 첫번째 줄에 넣어줘야한다.
	}
	
	car(String c, String g, int d){
		color = c;
		gear = g;
		door = d;
	}

}
