package TestCumber;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Excel.ExcelOperation;
import Excel.ReadExcel;
import Procedure.DishSteps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(Listener.class)
@CucumberOptions(features = { "Features\\Login.feature", "Features\\Dish.feature", "Features\\Cart.feature" }, glue = {
		"Procedure" })
public class TestRunner extends AbstractTestNGCucumberTests {
	

	WebDriver driver = new EdgeDriver();

	ExcelOperation rs = new ExcelOperation();
	DishSteps st = new DishSteps();
	ReadExcel excel = new ReadExcel();

	@Test
	public void test1() {

		rs.readExcel();
		st.login_page();
		st.my_location();
		st.choose_item();
		st.Item_name();
		st.Price_name1();
		String[] name = st.Item_name();
		String[] exel = excel.Excel();
		int cnt = 0;
		int cnt1 = 0;
		for (int indx = 0; indx < 11; indx++) {
			System.out.println(exel[indx] + " " + name[cnt]);
			if (exel[indx].equals(name[cnt])) {
				cnt1++;
				cnt++;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt + " " + cnt1);

		Assert.assertEquals(cnt, cnt1);
	}

	@Test
	public void test2() {
		
		String[] price = st.Price_name1();
		String[] exel = excel.Price();
		int cnt = 0;
		int cnt1 = 0;
		for (int indx = 0; indx < 11; indx++) {
			System.out.println(exel[indx] + " " + price[cnt]);
			if (exel[indx].equals(price[cnt])) {
				cnt1++;
				cnt++;

			} else {
				cnt++;
			}
		}
		System.out.println(cnt + " " + cnt1);
		Assert.assertEquals(cnt, cnt1);
		
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}
}
