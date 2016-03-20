package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExcutor {
@Test
public void Test()
{	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\latest sw\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
	driver.findElement(By.id("Email")).sendKeys("gowdb26@gmail.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("gowd2626");
	driver.findElement(By.id("signIn")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	 js.executeScript("window.scrollBy(0,-300)", "");  
	System.out.println("Excution completed");
}
}
