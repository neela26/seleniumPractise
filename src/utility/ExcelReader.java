package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String excelReadData(int row ,int col) throws IOException {
		
		File fin= new File(System.getProperty("user.dir")+"\\sampledata.xlsx");
		//to load file
		FileInputStream fis=new FileInputStream(fin);
		//to load xcel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		 XSSFSheet sh = wb.getSheetAt(0);
		    CellType type = sh.getRow(row).getCell(col).getCellType();
		 System.out.println(type.toString());
		 if(type==CellType.NUMERIC) {
			 double colunmvalues=sh.getRow(row).getCell(col).getNumericCellValue();
			 String colunmvalue=String.valueOf(colunmvalues);
			 return colunmvalue;
		 }
		 else {
		 String colunmvalue=sh.getRow(row).getCell(col).getStringCellValue();
		System.out.println(colunmvalue);
		return colunmvalue;
		 }
	}
}
