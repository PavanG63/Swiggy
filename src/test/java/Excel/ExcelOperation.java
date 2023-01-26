package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Procedure.DishSteps;

public class ExcelOperation {

	DishSteps st = new DishSteps();
	WebDriver driver = new EdgeDriver();

	public void readExcel() {

		st.login_page();
		st.my_location();
		st.choose_item();
		st.Item_name();
		st.Price_name1();
		String[] name = st.Item_name();
		String[] price = st.Price_name1();

		String excelFilePath = ".\\Excel\\Originaldata.xlsx";
		String Outputpath = ".\\Excel\\Result.xlsx";

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(Outputpath));
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			int lastRowNum = sheet.getLastRowNum();
			int cnt = 0;
			for (int indx = 1; indx <= lastRowNum; indx++) {
				Row row = sheet.getRow(indx);
				Cell cellname = row.createCell(1);
				Cell cellprice = row.createCell(2);
				String val = name[cnt];
				cellname.setCellValue(val);
				cellprice.setCellValue(price[cnt]);
				cnt++;
			}
			workbook.write(fileOutputStream);
			fileOutputStream.close();
			workbook.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
