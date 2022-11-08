package Pscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample8 {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=WebDriverManager.chromedriver().create();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/91990/OneDrive/Desktop/link4.html");
     Thread.sleep(3000);
     driver.findElement(By.tagName("input")).clear();
     Thread.sleep(4000);
     driver.quit();
     
	}

}
