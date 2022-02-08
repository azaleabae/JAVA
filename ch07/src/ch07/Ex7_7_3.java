package ch07;

class Ex7_7_3{
	public static void main(String[] args) {
		
		Cars cars = null;
		FireEngines fe = new FireEngines();
		
		FireEngines fe2 = (FireEngines)cars; // 조상 -> 자손으로 형변환
		Cars cars2 = (Cars)fe2; // 자손 - > 조상으로 형변환
		
//		cars = fe; // cars = (cars)fe2;에서 형변환이 생략됨
//		cars.water(); // 자식인 소방차에는 물 뿌리는기능이 있지만 부모인 Car의 참조변수 car에서는 없어서 못씀
		
		
		
	}
}

class Cars{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive BBo~ang");
	}
	void stop() {
		System.out.println("break!");
	}
	
}

class FireEngines extends Cars{
	void water() {
		System.out.println("Pushshshshshshshshsh");
	}
}