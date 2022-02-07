package ch07;

class Ex7_4_1 {
	// 참조변수 super
	
	// 객쳉 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재 (this. 랑 똑같이 static 메서드에서는 못씀)
	// 조상의 멤버를 자신의 멤버와 구별할때 사용
	
	// 생성자 super()
	
	// 조상의 생성자를 호출할 때 사용
	// 조상의 멤버는 조상의 생성자를 호출해서 초기화
}

class CRSuper{
	int x, y;
	
	CRSuper(int x, int y){
		this.x = x; //iv초기화
		this.y = y; //iv초기화
		
	}
}

class CRSuper2 extends CRSuper{
	int z;
	
//	CRSuper2(int x, int y, int z){
//		this.x = x;
//		this.y = y;
//		this.z = z;
//		
//	}
	
	CRSuper2(int x, int y, int z){
		super(x, y); // 조상클래스의 생성자 CRSuper(int x , int y)를 호출
		this.z = z; // 자신의 멤버를 초기화
	}
	
}