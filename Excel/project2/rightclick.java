package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/?gws_rd=ss1");
		d.manage().window().maximize();
		WebElement link=d.findElement(By.linkText("gamil"));
		Actions act=new Actions(d);
		act.contextClick(link).sendKeys("L").build().perform();

	}

}
