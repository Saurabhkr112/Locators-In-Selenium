package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountRadioButtons {
	@Test

	public void IdDemo() {
		
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium\\SeleniumBrowserJars4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91620/AppData/Local/Temp/Rar$EXa15732.16842/RadioButtons.html");
		List<WebElement> Buttons = driver.findElements(By.xpath("/html/body/form/div/input[1]"));
		int totalnobuttons = Buttons.size();
		System.out.println("Number of Buttons...." + totalnobuttons);
		
}
}
