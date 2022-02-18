package ch09;

// 래퍼(wrapper) 클래스

	// 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스 (기본형 값을 감싸는 클래스)
	
	// public final class integer extends Number implements Comparable{
	// 		...
	// 		private int value;  - > 기본형 (int)를 감싸고 있음.
	//		...
	// }

		// 기본형		래퍼클래스 		생성자						활용예
		// boolean	Boolean		Boolean(boolean value)		Boolean b = new Boolean(true);
		//						Boolean(String s)			Boolean b2 = new Boolean("true");
		
		// char		Character	Chracter(char value)		Charcter c = new Character('a');
		
		// byte		Byte		Byte(byte value)			Byte b = new Byte(10);
		//						Byte(String s)				Byte b2 = new Byte("10");

		// short	Short 		Short(short value)			Short s = new Short(10);
		//						Short(String s)				Short s2 = new Short("10");

		// int 		Integer		Integer(int value)			Integer i = new Integer(100);
		// 						Integer(String s)			Integer i2 = new Integer("100");
	
		// long		Long		Long(Long value)			Long l = new Long(100);
		//						Long(String s)				Long l2 = new Long("100");

		// float 	Float		Float(double value)			Float f = new Float(1.0);
		//						Float(float value)			Float f = new Float(1.0f);
		//						Float(String s)				Float f = new Float("1.0f");

		// double	Double 		Double(double value)		Double d = new Double(1.0);
		//						Double(String s)			Double d2 = new Double("1.0");

public class Ex9_9_1 {

	public static void main(String[] args) {

		
	}

}
