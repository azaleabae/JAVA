package ch06;

import java.util.Arrays;

public class Ex6_3 {

	public static void main(String[] args) {
		// 객체배열 == 참조변수 배열
		
		// Tv tv1,tv2,tv3;
		
		Tv[] tvArr1 = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
		System.out.println(Arrays.toString(tvArr1));
		
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};

		for(int i=0; i<tvArr2.length; i++) {
			System.out.println(tvArr2[i]);
		}
		
	}

}
