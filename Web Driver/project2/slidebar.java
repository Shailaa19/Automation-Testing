package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class slidebar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/slider/#content");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement slide=d.findElement(By.id("slider"));
		Actions act=new Actions(d);
		int y=slide.getLocation().y;
		act.draganddrop(slide,y,500).build().perform();
		

	}

}
