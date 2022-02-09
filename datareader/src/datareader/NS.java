package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// 줄별로 나누고 줄을 다시 split로 공백 기준으로 자른뒤에 그걸 array에 넣기
public class NS {
	public static void main(String[] args) {
//	ArrayList<String> NSList = new ArrayList<String>();

		try {
			// 파일 객체 생성
			File file = new File("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
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
				
//				이렇게 해서 다 집어넣고 arraylist에다가 집어넣기 

				System.out.println(cert.ceEnd); // 잘라졌는지 확인용 나중에 왜 이렇게 알아서 잘 잘리는지 물어볼것
				
			}
			// .readLine()은 끝에 개행문자를 읽지 않는다.
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
