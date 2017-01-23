package GenrickLibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibs {
	
		//String file="E:\\MGlobally\\ProdTestData.xlsx";
	String file="E:\\oneFxZone.xlsx";
	
		/*
		 * @provide Sheet Name RowNum and celNum
		 */
		/* Fetching data from Excel Sheet */
		public String getExcelData(String sheetName,int rowNum,int celnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
			
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			Cell cel=row.getCell(celnum);
			String data="";
			/*if(cel.getCellType()==0){
				double data1=cel.getNumericCellValue();
				
				//System.out.println(data1);
				data= String.valueOf(data1);
				
				
			}*/  if(cel.getCellType()==1){
				data=cel.getStringCellValue();
				
			}
			else if(cel.getCellType()==0){
				long data1=(long) cel.getNumericCellValue();
				data= String.valueOf(data1);
				
				
			}
			return data;
			
			}
		
		public void setExcelData(String sheetName, int rowNum , 
                int colNum, String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			Cell cel = row.createCell(colNum);
			cel.setCellType(cel.CELL_TYPE_STRING);
			FileOutputStream fos = new FileOutputStream(file);
			cel.setCellValue(data);
			wb.write(fos);
}
	}


