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
				
				System.out.println(cert.ceNum); // 정상적으로 arr[0]출력가능 한데 왜 if 문에서는 안되는지 모르겠음

				
				int item = 0;
				String item1 = "인증번호";
				String item2 = "인증종류";
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("1. 인증번호");
				System.out.println("2. 인증농가");
				System.out.println("출력을 원하시는 번호를 선택해주십시오 - >");
				
				String ch = scan.nextLine(); // 입력받은 내용을 ch에 저장
				item = Integer.parseInt(ch); // 입력받은 문자열(ch)을 숫자로 변환
				
				

				if (item == 1) {
					System.out.println(item1 + "를 선택하셨습니다.");
					System.out.println(arr[0]);
					break;
				}else if(item == 2) {
					System.out.println(item2 + "를 선택하셨습니다.");
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