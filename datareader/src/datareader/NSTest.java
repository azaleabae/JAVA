package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// �ٺ��� ������ ���� �ٽ� split�� ���� �������� �ڸ��ڿ� �װ� array�� �ֱ�
public class NSTest {
	public static void main(String[] args) {
//	ArrayList<String> NSList = new ArrayList<String>();

		try {
			// ���� ��ü ����
			File file = new File("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.txt");

			FileReader filereader = new FileReader(file);

			BufferedReader bufReader = new BufferedReader(filereader);

			String line = "";

			while ((line = bufReader.readLine()) != null) {

						
				String[] arr;
				arr = line.split("\t");
				Certification cert = new Certification();
				cert.ceNum = arr[0];
				
				
//				cert.ceType = arr[1];
//				cert.ceFarm = arr[2];
//				cert.ceItem = arr[3];
//				cert.cuArea = arr[4];
//				cert.prPlan = arr[5];
//				cert.ceStart = arr[6];
//				cert.ceEnd = arr[7];
//				�̷��� �ؼ� �� ����ְ� arraylist���ٰ� ����ֱ� 

//				System.out.println(cert.ceNum); // �߶������� Ȯ�ο� ���߿� �� �̷��� �˾Ƽ� �� �߸����� �����
//				System.out.println(Arrays.toString(arr)); // ��ü ��� �ε� ���� �迭�� ������.

				int item = 0;
				String item1 = "������ȣ";
//				String item2 = "��������";
//				String item3 = "������";
//				String item4 = "����ǰ��";
//				String item5 = "������";
//				String item6 = "�����ȹ��";
//				String item7 = "�����Ⱓ ������";
//				String item8 = "�����Ⱓ ������";

				Scanner input = new Scanner(System.in);

				System.out.println("1. ������ȣ");
				System.out.println("2. ��������");
				System.out.println("3. ������");
				System.out.println("4. ����ǰ��");
				System.out.println("5. ������");
				System.out.println("6. ���� ��ȹ��");
				System.out.println("7. �����Ⱓ ������");
				System.out.println("8. �����Ⱓ ������");
				System.out.print("����� ���Ͻô� ����(1~8)�� �����ϼ���.(����:0)->");

				String ch = input.nextLine(); // �Է¹��� ������ ch�� ����
				item = Integer.parseInt(ch); // �Է¹��� ���ڿ�(ch)�� ���ڷ� ��ȯ

				if (item == 0) {
					System.out.println("���α׷��� ���� �˴ϴ�..");
					break;
				} else if (!(1 <= item && item <= 8)) {
					System.out.println("0�̸��̳� 8�� �ʰ��ϴ� ���ڸ� �Է��ϽǼ� �����ϴ�. ����� 0 �Դϴ�.");
					continue;
				} else if (item == 1) {
					System.out.println("���� ǰ���� " + item1 + "�Դϴ�.");
					
					break;
				} // else if (item == 2) {
//					System.out.println("���� ǰ���� " + item2 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 3) {
//					System.out.println("���� ǰ���� " + item3 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 4) {
//					System.out.println("���� ǰ���� " + item4 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 5) {
//					System.out.println("���� ǰ���� " + item5 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 6) {
//					System.out.println("���� ǰ���� " + item6 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 7) {
//					System.out.println("���� ǰ���� " + item7 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 8) {
//					System.out.println("���� ǰ���� " + item8 + "�Դϴ�.");
////						System.out.println(cert.ceNum);
//					break;
//				}
			}
			
			// .readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.

			bufReader.close();
			

		} catch (FileNotFoundException e) {
			// System.in���� �Է� ���� ���� ���� ���϶� ����� ����
			System.out.println();

		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}

//class Certification {
//
//	String ceNum;
//	String ceType;
//	String ceFarm;
//	String ceItem;
//	String cuArea;
//	String prPlan;
//	String ceStart;
//	String ceEnd;

//}