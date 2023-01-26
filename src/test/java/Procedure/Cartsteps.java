package Procedure;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Cartsteps {
	
	WebDriver driver;
	
	@Given("I am on the LoginPage of app")
	public void i_am_on_the_login_page_of_swiggy() {
	    // Write code here that turns the phrase above into concrete actions
		this.driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
	}
	@Given("I can locate my location")
	public void i_locate_my_location() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[@class=\"LukWG\"]")).click();
	}
	
	@Then("I remove the item from cart")
	public void i_remove_the_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//*[@class=\"_2FkHZ\"]")).sendKeys("Chicken Biryani");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]/div[2]/div[1]/b")).click();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[5]/div[1]/div/a/div/div[1]")).click();
 	    driver.findElement(By.xpath("//*[@id=\"h1633584607\"]/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")).click();
 	    driver.findElement(By.xpath("//*[@class=\"_38xdN\"]")).click();
 	    driver.findElement(By.xpath("//*[@class=\"_1gPB7\"]")).click();
 	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[3]")).click();
		System.out.println("Successfully removed the item from cart");
//		driver.close();
	}
	@Given("I am on the restaurats page")
	public void i_am_on_the_restaurats_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//*[@class=\"_2FkHZ\"]")).sendKeys("Chicken Tikka");
 	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]")).click();
	}
	@And("again I Search for another item")
	public void again_i_search_for_another_item() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[5]/div[1]/div/a/div/div[1]")).click();
	}
	@Then("I select one other item")
	public void i_select_one_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div[4]/div[1]/div/div[2]/div[2]/div/div[1]")).click(); //for rara biryani	     
	}
	@Then("I click on add to cart")
	public void i_click_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
 	    driver.findElement(By.xpath("//*[@class=\"_3coNr\"]")).click();
 	    driver.findElement(By.xpath("//*[@class=\"_1gPB7\"]")).click();
 	    System.out.println("Successfully added the another item to cart");
// 	    driver.close();
	}

}
