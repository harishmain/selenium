package com.demo.jenkins;
import org.testng.annotations.Test;
import org.openqa.grid.selenium.*;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.*;
@Test
public class RegistrationTest {
	WebDriver webdriver ;
	DesiredCapabilities capability = DesiredCapabilities.firefox();
//String baseUrl,nodeURL;
private static RemoteWebDriver driver;
 //This is TestNG annotation

@Test public void testRegister() throws MalformedURLException{

	
	capability.setCapability("binary", "C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe");
	capability.setPlatform(Platform.ANY);
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);

driver.navigate().to("http://localhost:8191/HelloWorld/HelloWorld/WebContent/");
driver.manage().window().maximize();

driver.findElement(By.id("num1")).clear();
driver.findElement(By.id("num1")).sendKeys("4");
driver.findElement(By.id("num2")).clear();
driver.findElement(By.id("num2")).sendKeys("4");
driver.findElement(By.id("add")).click();
//String searchHeader = driver.findElement(By.cssSelector("H1")).getText().toLowerCase();
//Assert.assertTrue(searchHeader.contains("ipod nano"));
driver.close();


}

}
