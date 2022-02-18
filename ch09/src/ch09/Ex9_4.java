package ch09;



// equals(Object obj)
	// ��ü �ڽŰ� �־��� ��ü�� ���Ѵ�. ������ true �ٸ��� false
	// ObjectŬ������ equals()�� ��ü�� �ּҸ� ��(�������� �� ��)
public class Ex9_4 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
//		return this==obj; // �ּ� ��. ���� �ٸ� ��ü�� �׻� ����
		
		// ���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���.
		if(!(obj instanceof Value)) return false; // obj�� value ��ü�� �ƴ϶�� false�� ����
		
		Value v = (Value)obj; // obj�� value�� �� ��ȯ
		
		return this.value ==v.value;
	}
}
