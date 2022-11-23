package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox2 {
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
	public void confirmation() throws InterruptedException
	{
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.dismiss();
		WebElement a1=d.findElement(By.id("confirmResult"));
		System.out.println(a1.getText());
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alertbox2 obj=new alertbox2();
		obj.opening_browser();
		obj.title();
		obj.url();
		obj.confirmation();
		
	}


	
		

	}


