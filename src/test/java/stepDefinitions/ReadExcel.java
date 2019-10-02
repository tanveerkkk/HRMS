package stepDefinitions;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] ar) throws Exception {
		FileInputStream file = new FileInputStream("Excel1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);
		String value=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

	}
}
