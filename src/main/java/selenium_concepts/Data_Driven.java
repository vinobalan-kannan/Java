package selenium_concepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven {

	
		@Test(dataProvider="TestData")
		public void testCase(String userName, String password, String mailID )
		{
			System.out.println(userName +" , " + password +" , " + mailID);
		}
	
	
		@DataProvider(name="TestData")
		public Object[][] testdata() throws IOException
		{
		FileInputStream fis = new FileInputStream("C:\\Users\\Vino\\Downloads\\Untitled spreadsheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet=workbook.getSheetAt(0);
		//System.out.println("all good");
		
		DataFormatter formatter=new DataFormatter();
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		//System.out.println(sheet.getLastRowNum());
		
		XSSFRow row=sheet.getRow(0);
		
		int columnCount=row.getLastCellNum();
		
		Object data[][]=new Object[rowCount-1][columnCount];
		
		for(int i=0;i<rowCount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++)
			{
				XSSFCell cell= row.getCell(j);
			
				data[i][j]=formatter.formatCellValue(cell);
			}
		
		}
		return data;
	}

}
