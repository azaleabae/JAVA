package ch12;

// 제한된 지네릭 클래스

	// extends로 대입할 수 있는 타입을 제한

	// class fruitBox<T extends Fruit>{ 	//Fruit의 자손만 타입으로 지정가능
		// ArrayList<T> list = new ArrayList<T>();
		// ...
	// }
	
	// Fruit<Apple> appleBox = new FruitBox<Apple>(); // ㅇㅋ
	// Fruit<Toy>	toyBox 	=  new FruitBox<Toy>(); // 에러 Toy는 Fruit의 자손이 아님


	// 인터페이스인 경우에도 extends를 사용

		// interface Eatable{}
		// class FruitBox<T extends Eatable>{ ... }


public class Generics4 {

}
