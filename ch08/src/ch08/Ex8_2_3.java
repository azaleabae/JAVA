package ch08;

public class Ex8_2_3 {

// ���� �߻���Ű��
	
	// 1. ������ new�� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü�� ���� ����
		// Exception e = new Exception("���Ƿ� �߻�������);
	
	// 2. Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��.
		// throw e; 
	public static void main(String[] args) {

		try {
			Exception e = new Exception("���Ƿ� �߻�������"); // ()���� message
			throw e; // ���ܸ� �߻���Ŵ
		// throw new Exception("���Ƿ� �߻�������.");	  -> �� ������ ���ٷ� ǥ���Ѱ�.
		
		}catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage()); // e.getMessage�� ���Ƿ� �߻��������� ����Ŵ
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
