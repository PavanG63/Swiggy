package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public String[] Excel() {

		String[] name = new String[11];

		String input = ".\\Excel\\Result.xlsx";

		try {
			FileInputStream inputStream = new FileInputStream(new File(input));
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			int lastRowNum = sheet.getLastRowNum();
			int cnt = 0;
			for (int indx = 1; indx <= lastRowNum; indx++) {
				Row row = sheet.getRow(indx);
				Cell cellname = row.getCell(1);
				String itemname = cellname.getStringCellValue();
				System.out.println(itemname);
				name[cnt] = itemname;
				cnt++;
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;

	}

	public String[] Price() {
		String price[] = new String[11];

		String Input = ".\\Excel\\Result.xlsx";


		try {
			FileInputStream inputStream = new FileInputStream(new File(Input));

			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			int lastRowNum = sheet.getLastRowNum();

			int cnt = 0;
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell cellprice = row.getCell(2);
				String pricename = cellprice.getStringCellValue();
				System.out.println(pricename);
				price[cnt] = pricename;
				cnt++;

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return price;

	}
	public static void main(String[] args) {
		ReadExcel res = new ReadExcel();
		res.Excel();
		res.Price();
	}
}
