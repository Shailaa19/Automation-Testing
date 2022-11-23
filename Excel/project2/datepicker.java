package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/#content");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
		

	}

}
