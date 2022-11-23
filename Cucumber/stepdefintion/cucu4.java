package stepdefintion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucu4 {
	WebDriver d;
	FileInputStream f1;
	@Given("open newtours page")
	public void open_newtours_page() {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
	}

	@When("user needs to enter the name and password")
	public void user_needs_to_enter_the_name_and_password() throws IOException, InterruptedException {
		f1=new FileInputStream("C:\\Users\\bredd\\eclipse-workspace\\prjct1\\src\\test\\java\\stepdefintion\\p4.properties");
		Properties p4=new Properties();
		p4.load(f1);
		d.findElement(By.name("userName")).sendKeys(p4.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p4.getProperty("password"));
		Thread.sleep(5000);
		
		
		
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    d.findElement(By.name("submit")).click();
	}

	@And("user takes screenshot and close the page")
	public void user_takes_screenshot_and_close_the_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 File	a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		   Files.copy(a1,new File("C:\\Users\\bredd\\Desktop\\New folder//new2.png"));
		   }
	}



