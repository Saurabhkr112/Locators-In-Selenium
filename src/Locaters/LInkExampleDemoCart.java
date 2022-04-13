package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LInkExampleDemoCart {
	@Test

	public void LinkDemo() {
		
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium\\SeleniumBrowserJars4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int NoLinks = Links.size();
		System.out.println("Number of links in Calculation is ...." + NoLinks);
		
		for(int i=0;i<=Links.size();i++) {
			System.out.println(Links.get(i).getText());
			
		}
}
}
