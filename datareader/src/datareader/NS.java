package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// �ٺ��� ������ ���� �ٽ� split�� ���� �������� �ڸ��ڿ� �װ� array�� �ֱ�
public class NS {
	public static void main(String[] args) {
//	ArrayList<String> NSList = new ArrayList<String>();

		try {
			// ���� ��ü ����
			File file = new File("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			
			while ((line = bufReader.readLine()) != null) {
				
				String[] arr;
				arr = line.split("\t");
				Certification cert = new Certification();
				cert.ceNum = arr[0];  
				cert.ceType = arr[0];  
				cert.ceFarm = arr[0];  
				cert.ceItem = arr[0];  
				cert.cuArea = arr[0];  
				cert.prPlan = arr[0];  
				cert.ceStart = arr[0];  
				cert.ceEnd = arr[0];  
				
//				�̷��� �ؼ� �� ����ְ� arraylist���ٰ� ����ֱ� 

				System.out.println(cert.ceEnd); // �߶������� Ȯ�ο� ���߿� �� �̷��� �˾Ƽ� �� �߸����� �����
				
			}
			// .readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.
			bufReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			System.out.println(e);
		}
			
	}
}


class Certification{
	String ceNum;
	String ceType;
	String ceFarm;
	String ceItem;
	String cuArea;
	String prPlan;
	String ceStart;
	String ceEnd;
}
