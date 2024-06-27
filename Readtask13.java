package javamavenpackage;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readtask13 {

	public static void main(String[] args) throws IOException {
		// open the excel book
				XSSFWorkbook workbook1 =new XSSFWorkbook("C:\\Users\\Lishanth\\eclipse-workspace\\MavenJavaproject\\src\\main\\java\\javamavenpackage\\writetask013.xlsx");
				
				// open the sheet, wen the sheet name is available else else use sheetat(0) to get into the sheet by index value
				XSSFSheet sheet = workbook1.getSheet("Sheet1");
				
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
					
					System.out.println(cell.getStringCellValue());
							
					
				}
				
				//System.out.println();
					
				}
				
				
				workbook1.close();
			}

		


	}


