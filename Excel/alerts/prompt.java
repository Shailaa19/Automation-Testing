package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title()
	{
		String c=d.getTitle();
		System.out.println(c);
	}
	public void url()
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void ppt() throws InterruptedException
	{
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("vaishnavi");
		Thread.sleep(2000);
		alt.accept();
		WebElement a1=d.findElement(By.id("promptResult"));
		System.out.println(a1.getText());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		prompt obj=new prompt();
		obj.opening_browser();
		obj.title();
		obj.url();
		obj.ppt();
		

	}

}
