package ch09;



// equals(Object obj)
	// 객체 자신과 주어진 객체를 비교한다. 같으면 true 다르면 false
	// Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)
public class Ex9_4 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
//		return this==obj; // 주소 비교. 서로 다른 객체는 항상 거짓
		
		// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
		if(!(obj instanceof Value)) return false; // obj가 value 객체가 아니라면 false를 리턴
		
		Value v = (Value)obj; // obj를 value로 형 변환
		
		return this.value ==v.value;
	}
}
