package ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 함수형 인터페이스 - Example
	// 익명 객체를 람다식으로 대체



public class LambdaEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		}); // 를 람다식으로 
		
		Collections.sort(list,(s1,s2)-> s2.compareTo(s1));
	}
}


interface Comparator<T>{
	int compare(T o1, T o2);
}