package handleExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class WriteData {

	public static void main(String[] args) {

		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready fo read operation
		Sheet sh = (Sheet) wb.getSheet("citytour");//go to specified sheet
		Row row = sh.getRow(4);//go to the specified row
		
		Cell cell = (Cell) row.createCell(4);
		((org.apache.poi.ss.usermodel.Cell) cell).setCellValue("automation");	
		
		FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);

	}

}
