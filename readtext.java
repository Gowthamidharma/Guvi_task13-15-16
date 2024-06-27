package javamavenpackage;

import java.awt.print.Book;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readtext {

	public static void main(String[] args) throws IOException {
		
		// open the excel book
		XSSFWorkbook workbook =new XSSFWorkbook("C:\\Users\\Lishanth\\eclipse-workspace\\MavenJavaproject\\src\\main\\java\\Data\\readfile.xlxs.xlsx");
		
		// open the sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//get the no of rows
		
		int rowcount = sheet.getLastRowNum();
		
		//get the no of columns
		
		int columncount=sheet.getRow(0).getLastCellNum();
		
		//iterating and get the cell value
		String[][] data =new String[rowcount][columncount];
		
		
		// get in row
		for( int i=1;i<=rowcount;i++) { // i-1 when want to ignore the heading in read excel
			XSSFRow row = sheet.getRow(i);
			// get in cell
		for (int j=0; j<columncount;j++) {
			XSSFCell cell = row.getCell(j);
			
			// get cell value
			
			//System.out.println(cell.getStringCellValue());
					
			// storing the array
			data[i-1][j]=cell.getStringCellValue(); // i-1 because we must start the array index from 0, so i =0, j=0 
		}
		
		//System.out.println();
			
		}
		
		// explain this for each
		for (String[] row : data) {
			
			for (String x: row) {
				System.out.println(x +  " ");
			}
		}
		workbook.close();
	}

}
