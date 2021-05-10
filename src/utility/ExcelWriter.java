package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter{
//	public static int rowCount;
//	public static void excelWriteData(String[] value) throws IOException  {
//		
//		File fin= new File(System.getProperty("user.dir")+"\\sampledata.xlsx");
//	//	
//		//to load file
//		FileInputStream fis=new FileInputStream(fin);
//		//to load xcel file
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		
//		
//		//fis.close();
//		 XSSFSheet sheet = wb.getSheetAt(0);
//			File fout= new File(System.getProperty("user.dir")+"\\sampledata.xlsx");
//		 rowCount = sheet.getLastRowNum();
//		 
//		 System.out.println(rowCount);
//
//		FileOutputStream fos=new FileOutputStream(fout);
//		
//		//sheet.getRow(rowCount++).getCell(col).setCellValue(value);       
//       
//		for(int i=0;i<2;i++) {
//	   sheet.createRow(rowCount).createCell(i).setCellValue(value[i]);
//		}
//		rowCount++;
//   wb.write(fos);
//   fos.close();
////       wb.close();
//       
//		
//		
//	}
//	
	
	
	public static void excelWriteData(String[] value) throws IOException {
		File fin= new File(System.getProperty("user.dir")+"\\sampledata.xlsx");
		//to load file
		FileInputStream fis=new FileInputStream(fin);
		//to load xcel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	     XSSFSheet sheet = wb.getSheetAt(0);
	     
	     //Get the current count of rows in excel file
		 int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();    
		 
		//Get the first row from the sheet
		 XSSFRow row1=sheet.getRow(0); 
		 
		 System.out.println(row1.getLastCellNum());
		    XSSFRow newRow = sheet.createRow(rowCount+1);
		    
		    for(int j=0;j<row1.getLastCellNum();j++) {
		    	
		    	//Cell
		    	Cell cell=newRow.createCell(j);
		    	cell.setCellValue(value[j]);
		    	
		    }
		     
		   // fis.close();
			File fout= new File(System.getProperty("user.dir")+"\\sampledata.xlsx");
 
		    FileOutputStream fos=new FileOutputStream(fout);
		    wb.write(fos);
		    
		 
		
		
	}

}
