package ch12;

// 지네릭스의 제약

	// 타입 변수에 대입은 인스턴스 별로 다르게 가능
		// Box<Apple> appleBox = new Box<Apple>(); // OK. Apple객체만 저장가능
		// Box<Grape> gradeBox = new Box<Grape>(); // OK. Grape객체만 저장가능

	// static멤버에 타입 변수 사용 불가
		// static T item;	// 에러
		// static int compare(T t1, T t2){ ... } // 에러

	// 배열 생성할 때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능

		//class Box<T>{
			// T[] itemArr;	// OK. T타입의 배열을 위한 참조변수
				// ...
			// T[] toArray(){
				// T[] tmpArr = new T[itemArr.length]; // 에러. 지네릭 배열 생성불가
				// ...
	

public class Generics {

	public static void main(String[] args) {

	}

}
