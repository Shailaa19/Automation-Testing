package stepdefintion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucu5 {
	WebDriver d;
	@Given("open login page")
	public void open_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("WebDriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/login.php");
	    d.manage().window().maximize();
	    
	}

	@When("user needs to click register button")
	public void user_needs_to_click_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	   
	}
	   


	@Then("user needs to get country names from dropdown")
	public void user_needs_to_get_country_names_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement a=d.findElement(By.name("country"));
	    List<WebElement> c=a.findElements(By.tagName("option"));
	    for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i).getText());
		}
	}
	

	@And("user navigates bck to home page")
	public void user_navigates_bck_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    d.navigate().back();
	    
	}
	    
	    
	    
	    
	

	@And("user close the window")
	public void user_close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}


}
