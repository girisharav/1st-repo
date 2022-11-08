package Pscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample7 {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/SanjayBabu/Desktop/link.html");
      Thread.sleep(3000);
      driver.findElement(By.tagName("input")).click();
      Thread.sleep(5000);
      driver.quit();
      
      
	}

}
