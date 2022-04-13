package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkExample {
	@Test

	public void LinkDemo() {
		
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium\\SeleniumBrowserJars4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int NoLinks = Links.size();
		System.out.println("Number of links in Calculation is ...." + NoLinks);
		
		for(int i=0;i<=Links.size();i++) {
			System.out.println(Links.get(i).getText());
			
			String str = Links.get(i).getText();
			String str1 = "Love Calculator";
			
			if(str.equals(str1)) {
				driver.findElement(By.linkText("Love Calculator")).click();
				driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a"));
				
			}
		}
			
		
}
}
