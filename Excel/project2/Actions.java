package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;


public class Actions {

	public Actions(ChromeDriver d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://jqueryui.com/menu/#content");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
		Thread.sleep(2000);
		
		
		WebElement jazz =d.findElement(By.id("ui-id-13"));
		jazz.click();
		Thread.sleep(2000);
		
		WebElement bigband =d.findElement(By.id("ui-id-15"));
		bigband.click();
		Thread.sleep(2000);
		
		
		Actions act=new Actions(d);
		

		
		
	}		

	}