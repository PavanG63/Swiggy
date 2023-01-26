package Procedure;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DishSteps {

	WebDriver driver;
	
	@Given("I am on the LoginPage of swiggy")
	public void login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
	}
	@Given("I locate my location")
	public void my_location() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[@class=\"LukWG\"]")).click();
	}
	@Then("I search for one item")
	public void choose_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//*[@class=\"_2FkHZ\"]")).sendKeys("Chicken Biryani");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]/div[2]/div[1]/b")).click();
		System.out.println("Item was found");
	}
	@When("title of the dish is Chicken biryani")
	public String[] Item_name() {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> Productname1 = driver.findElements(By.xpath("//div[@class=\"styles_restaurantName__5VIQZ styles_restaurantNameBold__2OmFY\"]"));



	    String[] Pro_name = new String[Productname1.size()];

	    int cnt = 0;
	    for (WebElement Product_Name : Productname1) {

	        String strname = Product_Name.getText();
	        Pro_name[cnt] = strname;
	        cnt++;
	        
	    }
	    
	    System.out.println("---------------");
	    System.out.println("Produt Name");
	    System.out.println("---------------");
	    
	    for (int i = 0; i < Productname1.size(); i++) {
	        System.out.println(Pro_name[i]);
	    }
	    return Pro_name;
	    
	        }
	@When("title of the page is Chicken biryani")
	public String[] Price_name1() {
		
	    List<WebElement> ProductPrice = driver.findElements(By.xpath("//span[@class='rupee']"));


	    String[] Price_name = new String[ProductPrice.size()];

	            int cnt = 0;
	    	    for (WebElement Product_Name1 : ProductPrice) {
	    	    	
	    	        String strname = Product_Name1.getText();
	    	        Price_name[cnt] =strname;
	    	        cnt++;
	    	        
	    	    }
	    	    System.out.println("---------------");
	    	    System.out.println("Price");
	    	    System.out.println("---------------");
	    	    
	    	    
	    	    for (int i = 0; i < ProductPrice.size() ; i++) {
	    	    	System.out.println(Price_name[i]);
	    	    }
	    	    return Price_name;
	    	    
	}
	@Then("I choose one restaurant")
	public void i_choose_one_restaurant() {
	    // Write code here that turns the phrase above into concrete actions
 	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[4]/div[1]/div/a/div/div[1]")).click();
	}
	@Then("I select one item")
	public void i_select_one_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\\\"h1633584607\\\"]/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")).click();	     
	}
	@Then("I click on add item")
	public void i_click_on_add_item() {
	    // Write code here that turns the phrase above into concrete actions
 	    driver.findElement(By.xpath("//*[@class=\"_38xdN\"]")).click();
 	    driver.findElement(By.xpath("//*[@class=\"_1gPB7\"]")).click();
 	    System.out.println("Item added to cart successfully");
// 	    driver.close();
	}
}
