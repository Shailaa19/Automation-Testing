package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	 
		// TODO Auto-generated method stub
		WebDriver d;
		public void opening_browser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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
		public void alert_message() throws InterruptedException
		{
			d.findElement(By.id("alertButton")).click();
			Alert alt=d.switchTo().alert();
			System.out.println(alt.getText());
			Thread.sleep(2000);
			alt.accept();
		}
		public static void main(String[] args) throws InterruptedException
		{
			alertbox obj=new alertbox();
			obj.opening_browser();
			obj.title();
			obj.url();
			obj.alert_message();
		}


	}

	
		



