package stepdefintion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucu3 {
	WebDriver d;
	@Given("open dezlearn page")
	public void open_dezlearn_page() {
	   System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
	   d=new ChromeDriver();
	   d.get("https://www.dezlearn.com/javascript-alerts");
	   d.manage().window().maximize();
	   System.out.println(d.getTitle());
	   System.out.println(d.getCurrentUrl());
	}

	@When("click on simple alert button")
	public void click_on_simple_alert_button()  {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//*[@id=\"s_alert1\"]")).click();
		
		
		
	    
	}


	@Then("get the text and click ok")
	public void get_the_text_and_click_ok() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	   
	}

	@And("close the page")
	public void close_the_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	   File	a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	   Files.copy(a1,new File("C:\\Users\\bredd\\Desktop\\New folder//new1.png"));
	   }

}
