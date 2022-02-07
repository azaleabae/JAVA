package datareader;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//��ó: https://junghn.tistory.com/entry/JAVA-�ڹ�-POI-��-�̿��Ͽ�-����-�ٿ�ε�-����-�б�-3 [�ڵ� �ñ׳�]
public class Datas{
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:\\dev\\JAVA\\datareader\\exceltest\\nongsan.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			int rowindex = 0;
			int columnindex = 0;
			// ��Ʈ �� (ù��°���� �����ϹǷ� 0�� �ش�)
			// ���� �� ��Ʈ�� �б����ؼ��� FOR���� �ѹ��� �����ش�
			XSSFSheet sheet = workbook.getSheetAt(0);
			// ���� ��
			int rows = sheet.getPhysicalNumberOfRows();
			
			for (rowindex = 0; rowindex < rows; rowindex++) {
				// �����д´�
				XSSFRow row = sheet.getRow(rowindex);
				
				if (row != null) {
					// ���� ��
					int cells = row.getPhysicalNumberOfCells();
					
					for (columnindex = 0; columnindex <= cells; columnindex++) {
						// ������ �д´�
						XSSFCell cell = row.getCell(columnindex);
						String value = "";
						// ���� ���ϰ�츦 ���� ��üũ
						
						if (cell == null) {
							continue;
						} else {
							// Ÿ�Ժ��� ���� �б�
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
						System.out.println(rowindex + "�� �� : " + columnindex + "�� �� ����: " + value);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace(); //���� �޼����� �߻� �ٿ����� ã�Ƽ� �ܰ躰�� ������ ����ϴ� �޼���

		}

	}
}
