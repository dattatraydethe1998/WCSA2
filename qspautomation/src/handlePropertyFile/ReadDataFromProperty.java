package handlePropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadDataFromProperty {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready fo read operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("citytour");//go to specified sheet
		Row row = sh.getRow(4);//go to the specified row
		
		org.apache.poi.ss.usermodel.Cell cell = row.createCell(4);
		cell.setCellValue("automation");	
		
		FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);
	}

}
