package javamavenpackage;



import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Writeandread {

	public static void main(String[] args) throws IOException  {
		//get into the workbook
		XSSFWorkbook book = new XSSFWorkbook();
		//create the sheet
		XSSFSheet sheet = book.createSheet("Sheet1");
		// store the data in the excel sheet
		Object[][] data = {
				{"Name","Age", "Email"},
				{"John Doe","30", "john@test.com"},				
				{"Jane Doe","28","john@test.com"},
				{"Bob Smith","35","jacky@example.com"},
				{"Swapnil","37", "swapnil@example.com"}
				
		};
		// give input to the sheet, first get into the row
		int rowc=0;
		// to get to row use for each 
		for(Object[] row1: data) {
			XSSFRow row = sheet.createRow(rowc++);
			
			int col =0;
		// to get to the columns
			
		for(Object column: row1) {
			XSSFCell cell =row.createCell(col++);
		
			if (column instanceof String) {
				cell.setCellValue((String)column);
			
			}
			else if (column instanceof Integer) {
				cell.setCellValue((Integer)column);
				
			}
			
			
		}
			
			
		}
		try {
			FileOutputStream outputStream =new FileOutputStream("C:\\Users\\Lishanth\\eclipse-workspace\\MavenJavaproject\\src\\main\\java\\javamavenpackage\\writeread.xlsx");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		book.close();	
	}
	
	
	

}
