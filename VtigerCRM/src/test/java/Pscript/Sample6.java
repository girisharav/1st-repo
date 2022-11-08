package Pscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91990/OneDrive/Desktop/link.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
