package ch06;

import java.util.Arrays;

public class Ex6_3 {

	public static void main(String[] args) {
		// ��ü�迭 == �������� �迭
		
		// Tv tv1,tv2,tv3;
		
		Tv[] tvArr1 = new Tv[3]; // ���̰� 3�� TvŸ���� �������� �迭
		System.out.println(Arrays.toString(tvArr1));
		
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};

		for(int i=0; i<tvArr2.length; i++) {
			System.out.println(tvArr2[i]);
		}
		
	}

}
