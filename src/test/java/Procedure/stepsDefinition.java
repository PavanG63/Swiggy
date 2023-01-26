package Procedure;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class stepsDefinition {

	WebDriver driver;

	@Given("I am on the LoginPage")
	public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
	}
	@Given("I click on locate my location")
	public void i_click_on_locate_my_location() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[@class=\"LukWG\"]")).click();
	}
	@Then("I set my location")
	public void i_set_my_location() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@class=\"icon-downArrow kVKTT\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"_381fS _1oTLG _1H_62\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[2]/div[1]")).click();
		driver.close();
		System.out.println("Set The location");
	}
	@Then("I change the location")
	public void i_change_the_location() {
//	     Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@class=\"icon-downArrow kVKTT\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"_381fS _1oTLG _1H_62\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[2]/div[1]")).click();
		driver.close();
		System.out.println("Change the location");
	}
}
