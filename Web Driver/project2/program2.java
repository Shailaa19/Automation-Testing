
package project2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;



public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("http://www.amazon.com");
		d.manage().window().maximize();
	    WebElement dropdown =d.findElement(By.id("searchDropdownDescription"));
	   
	    
	    
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		
		
		d.findElement(By.id("nav-search-submit-button")).click();
		d.close();
		
		
				
			
		

	}

}
