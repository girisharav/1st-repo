package Pscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample9 
{
	@Test
	public void Test1()
	{
		System.out.println("hi");
	}

 @Test
 public void Test2()
 {
	 System.out.println("hello");
 }
 @Test
 public void Test3()
 {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://www.flipkart.com");
 }
}


