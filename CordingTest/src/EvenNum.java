
//��� ¦����° ���ڸ� * �� ġȯ�Ͻÿ�.(Ȧ����° ����,�Ǵ� ¦����° ���ڸ� ġȯ�ϸ� �ȵ˴ϴ�.) ������ �̿��ϸ� ��� ���Խ����δ� ������ ���ƿ�.
//
//Example: a1b2cde3~g45hi6 �� a*b*cde*~g4*hi6
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
