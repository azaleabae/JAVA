package datareader;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//출처: https://junghn.tistory.com/entry/JAVA-자바-POI-를-이용하여-엑셀-다운로드-엑셀-읽기-3 [코딩 시그널]
public class Datas{
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			int rowindex = 0;
			int columnindex = 0;
			// 시트 수 (첫번째에만 존재하므로 0을 준다)
			// 만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
			XSSFSheet sheet = workbook.getSheetAt(0);
			// 행의 수
			int rows = sheet.getPhysicalNumberOfRows();
			
			for (rowindex = 0; rowindex < rows; rowindex++) {
				// 행을읽는다
				XSSFRow row = sheet.getRow(rowindex);
				
				if (row != null) {
					// 셀의 수
					int cells = row.getPhysicalNumberOfCells();
					
					for (columnindex = 0; columnindex <= cells; columnindex++) {
						// 셀값을 읽는다
						XSSFCell cell = row.getCell(columnindex);
						String value = "";
						// 셀이 빈값일경우를 위한 널체크
						
						if (cell == null) {
							continue;
						} else {
							// 타입별로 내용 읽기
							switch (cell.getCellType()) {
							
							case FORMULA:
								value = cell.getCellFormula();
								break;
							
							case NUMERIC:
								value = cell.getNumericCellValue() + "";
								break;
							
							case STRING:
								value = cell.getStringCellValue() + "";
								break;
							
							case BLANK:
								value = cell.getBooleanCellValue() + "";
								break;
							
							case ERROR:
								value = cell.getErrorCellValue() + "";
								break;
							default:
								break;
							}
						}
						System.out.println(rowindex + "번 행 : " + columnindex + "번 열 값은: " + value);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace(); //에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력하는 메서드

		}

	}
}
