package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafromExcel {

	@Test
	public void vtigerexcel() throws IOException {
		
		FileInputStream fis = new FileInputStream ("src\\test\\resources\\vtigerexcel.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
          Row rw = sh.getRow(1);	
          
          Cell cl = rw.getCell(1);
          
          String data = cl.getStringCellValue();
          
          System.out.println(data);
          
	}
	
	
}
