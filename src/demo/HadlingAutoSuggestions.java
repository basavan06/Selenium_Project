package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HadlingAutoSuggestions {
@Test
public void Test()
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	java.util.List<WebElement> allOptions = driver.findElements(By.xpath("//*[text()='selenium']"));
	for (int i = 0; i < allOptions.size(); i++) {
		String option = allOptions.get(i).getText();
		System.out.println(option);
		allOptions.get(3).click();
	}
	driver.close();
}
}
