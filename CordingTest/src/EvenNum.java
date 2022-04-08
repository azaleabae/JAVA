
//모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.) 로직을 이용하면 쉬운데 정규식으로는 어려울거 같아요.
//
//Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
public class EvenNum {

	public static void main(String[] args) {

		String str = "a1b2cde3~g45hi6";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '2' || ch[i] == '4' || ch[i] == '6' || ch[i] == '8') {
				ch[i] = '*';
			}
		}
		String result = new String(ch);
		System.out.println(result);
	}
}
