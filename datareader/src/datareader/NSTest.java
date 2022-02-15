package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 줄별로 나누고 줄을 다시 split로 공백 기준으로 자른뒤에 그걸 array에 넣기
public class NSTest {
	public static void main(String[] args) {
//	ArrayList<String> NSList = new ArrayList<String>();

		try {
			// 파일 객체 생성
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
//				이렇게 해서 다 집어넣고 arraylist에다가 집어넣기 

//				System.out.println(cert.ceNum); // 잘라졌는지 확인용 나중에 왜 이렇게 알아서 잘 잘리는지 물어볼것
//				System.out.println(Arrays.toString(arr)); // 전체 출력 인데 이제 배열을 가미한.

				int item = 0;
				String item1 = "인증번호";
//				String item2 = "인증종류";
//				String item3 = "인증농가";
//				String item4 = "인증품목";
//				String item5 = "재배면적";
//				String item6 = "생산계획량";
//				String item7 = "인증기간 시작일";
//				String item8 = "인증기간 종료일";

				Scanner input = new Scanner(System.in);

				System.out.println("1. 인증번호");
				System.out.println("2. 인증종류");
				System.out.println("3. 인증농가");
				System.out.println("4. 인증품목");
				System.out.println("5. 재배면적");
				System.out.println("6. 생산 계획량");
				System.out.println("7. 인증기간 시작일");
				System.out.println("8. 인증기간 종료일");
				System.out.print("출력을 원하시는 종류(1~8)를 선택하세요.(종료:0)->");

				String ch = input.nextLine(); // 입력받은 내용을 ch에 저장
				item = Integer.parseInt(ch); // 입력받은 문자열(ch)을 숫자로 변환

				if (item == 0) {
					System.out.println("프로그램이 종료 됩니다..");
					break;
				} else if (!(1 <= item && item <= 8)) {
					System.out.println("0미만이나 8를 초과하는 숫자를 입력하실수 없습니다. 종료는 0 입니다.");
					continue;
				} else if (item == 1) {
					System.out.println("고르신 품목은 " + item1 + "입니다.");
					
					break;
				} // else if (item == 2) {
//					System.out.println("고르신 품목은 " + item2 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 3) {
//					System.out.println("고르신 품목은 " + item3 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 4) {
//					System.out.println("고르신 품목은 " + item4 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 5) {
//					System.out.println("고르신 품목은 " + item5 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 6) {
//					System.out.println("고르신 품목은 " + item6 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 7) {
//					System.out.println("고르신 품목은 " + item7 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				} else if (item == 8) {
//					System.out.println("고르신 품목은 " + item8 + "입니다.");
////						System.out.println(cert.ceNum);
//					break;
//				}
			}
			
			// .readLine()은 끝에 개행문자를 읽지 않는다.

			bufReader.close();
			

		} catch (FileNotFoundException e) {
			// System.in으로 입력 받은 값이 없는 값일때 출력할 문장
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