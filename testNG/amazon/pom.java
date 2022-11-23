package amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class pom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pom1 obj=new pom1(d);
		obj.First();
		obj.Last();
		obj.Phone();
		obj.Uname();
		obj.count();
	

	}

}
