package Pscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./src/main/resources/chromedriver.exe"; 
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//branch
	
		}

}
