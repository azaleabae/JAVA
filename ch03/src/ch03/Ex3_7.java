package ch03;

public class Ex3_7 {

	public static void main(String[] args) {
		// 형변환 연산자
		
		double d = 85.4;
		int score = (int)d;
		//int score = (int)85.4
		//int는 소숫점을 받지 않음으로 score는 85가 된다 
		//int score = 85
		// 근데 d는 똑같이 85.4 왜냐면 d를 (int)로 읽어 온거지 d 자체를 바꾼게 아니기 때문
		
		// 더블은 8byte고 int는 4byte라 저장이 안됨
		// 이때 d 앞에 (int)를 붙여줘서 더블형식의 d를 integer 
		// 형식으로 변환 시켜 저장 해준다.
		
		
		System.out.println(d);
		System.out.println(score);
		
		
		int ch = 'A';
		
		System.out.println(ch);
		//컴퓨터는 문자를 그대로 저장할 수 없기 때문에 숫자로 변환에서 저장함 이러한 숫자들을 유니코드라고 부름
		//여기서 A는 2진수 65로 치환되서 컴퓨터에 저장됨
		
		float F = (int)1.6f;
		System.out.println(F);
		// 실수를 int로 형변환 할때 소숫점 이하는 반올림 되지 않는다.
		
		
		

	}

}
