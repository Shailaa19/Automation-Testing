package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
	WebDriver d;
	By First=By.name("firstName");
	By Last=By.name("lastName");
	By Phone=By.name("phone");
	By Uname=By.name("userName");
	By count=By.name("country");
	pom1(WebDriver d){
		this.d=d;
	}
	public void First() {
		d.findElement(First).sendKeys("shailu");
	}
	public void Last() {
		d.findElement(Last).sendKeys("sunkesula");
	}
	public void Phone() {
		d.findElement(Phone).sendKeys("8919957456");
	}
	public void Uname() {
		d.findElement(Uname).sendKeys("shailusunkesula");
	}
	public void count() {
		d.findElement(count).sendKeys("India");
	}
}

	