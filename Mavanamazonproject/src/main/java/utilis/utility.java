package utilis;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {
                            
	       
	public static String getDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		
		String data="";
		String path="C:\\Users\\win10\\OneDrive\\Documents\\Book1.xlsx";
		FileInputStream file =new FileInputStream(path);
		
		
		Workbook book =WorkbookFactory.create(file);
	
		try{
			data=book.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(IllegalStateException abcd){
			double value=book.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue(); 
	         long num = (long)value;
	         data = Long.toString(num);
}
		return data;
	}
}
