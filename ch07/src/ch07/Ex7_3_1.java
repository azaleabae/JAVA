package ch07;

class Ex7_3_1 {

// 오버라이딩
	
	// 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
	
	int x;
	int y;
	
	String getLocation() {
		return "x:" + x + ", y :" + y;
	}
}

class Point3D extends Ex7_3_1 {
	int z;
	
	String getLocation() {  // 조상의 getLocation()을 오버라이딩
		return "x:" + x + ", y :" + y + ", z" + z;
	}
	
}
