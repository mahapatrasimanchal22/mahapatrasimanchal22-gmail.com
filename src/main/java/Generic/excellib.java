package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellib implements Autoconstant{

	public static String getcellvalue(String path,int row,int cell,String sheet) throws IOException {
		
		FileInputStream fi=new FileInputStream(excel_path);
		
		XSSFWorkbook xf=new XSSFWorkbook(fi);
		
		String cellvalue =xf.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
		
	


		
	}

}
