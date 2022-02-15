package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class input {
	public static void main(String[] args) {

		File file = new File("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.txt");

		FileReader filereader = null;
		try {
			filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader bufReader = new BufferedReader(filereader);

		String line = "";

		try {
			while ((line = bufReader.readLine()) != null) {

				String[] arr;
				arr = line.split("\t");
				Certification cert = new Certification();
				cert.ceNum = arr[0];
				
				System.out.println(cert.ceNum); // ���������� arr[0]��°��� �ѵ� �� if �������� �ȵǴ��� �𸣰���

				
				int item = 0;
				String item1 = "������ȣ";
				String item2 = "��������";
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("1. ������ȣ");
				System.out.println("2. ������");
				System.out.println("����� ���Ͻô� ��ȣ�� �������ֽʽÿ� - >");
				
				String ch = scan.nextLine(); // �Է¹��� ������ ch�� ����
				item = Integer.parseInt(ch); // �Է¹��� ���ڿ�(ch)�� ���ڷ� ��ȯ
				
				

				if (item == 1) {
					System.out.println(item1 + "�� �����ϼ̽��ϴ�.");
					System.out.println(arr[0]);
					break;
				}else if(item == 2) {
					System.out.println(item2 + "�� �����ϼ̽��ϴ�.");
					System.out.println(arr[1]);
					break;
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	ArrayList<Certification> ItemList = new ArrayList<>();
	
}

class Certification {

	String ceNum;
	String ceType;
	String ceFarm;
	String ceItem;
	String cuArea;
	String prPlan;
	String ceStart;
	String ceEnd;
	

}