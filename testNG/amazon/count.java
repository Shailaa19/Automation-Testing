package amazon;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class count extends Login{
	
	@Test(priority=2)
	public void url()
	{
		System.out.println(d.getCurrentUrl());
	}
	@Test(priority=3)
	public void dropdown()
	{
		d.findElement(By.id("searchDropdownBox")).click();
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=d.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText());
		}
	}
	@Test(priority=4)
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\bredd\\Desktop\\New folder//new2.png"));
	}
}
 

