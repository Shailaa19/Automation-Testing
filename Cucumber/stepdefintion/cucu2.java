package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucu2 {
	WebDriver d;
	@Given("open new tours")
	public void open_new_tours() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
	}

	@When("click on register window")
	public void click_on_register_window() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	    Thread.sleep(5000);
	}

	@Then("select India from the dropdown")
	public void select_india_from_the_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.name("country")).sendKeys("India");
	    Thread.sleep(5000);
	}

	@And("close the window")
	public void close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	   d.close();
	}

}
