package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
@Test
public void Test()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.navigate().to("http://google.com/");
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hi");
	SoftAssert as=new SoftAssert();
	as.assertEquals("", "");
	
	
}
}
