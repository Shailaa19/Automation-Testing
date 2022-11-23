package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucu1 {
	WebDriver d;

	@Given("open home page")
	public void open_home_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d =new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/login.php");
	    d.manage().window().maximize();
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void enter_username_and_password() {
		d.findElement(By.name("userName")).sendKeys("uname");
		d.findElement(By.name("password")).sendKeys("Password");
	}

	@Then("click button")
	public void click_button() {
		d.findElement(By.name("submit")).click();
		
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
		d.close();
	}

}
