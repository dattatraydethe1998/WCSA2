package handleExcel;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadData {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready fo read operation
		Sheet sh = (Sheet) wb.getSheet("citytour");//go to specified sheet
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(4);//go to the specified row
		Cell cell = (Cell) row.getCell(0);//go to specified column
		String data = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();//get the data from the cell
		System.out.println(data);//print the data
	}

}
