package exclReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream  fis = new FileInputStream("TestData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		for (int i = 0; i<= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			 for(int j =0; j<cols; j++) {
				 XSSFCell cell = row.getCell(j);
				 switch(cell.getCellType()) {
				 case STRING:
					 System.out.print(cell.getStringCellValue()); break;
				 case NUMERIC:
					 System.out.print(cell.getStringCellValue()); break;
				 case BOOLEAN:
					 System.out.print(cell.getNumericCellValue()); break;
				 case FORMULA: 
					 System.out.print(cell.getNumericCellValue()); break;
			
				 }
				 System.out.println("|");
			 }
		} System.out.println();
		
		
		
		
	}

}
