package testMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test

public class MavenCheck {
	
	public void m1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hsengar\\Downloads\\chromedriver.exe");
	WebDriver obj = new ChromeDriver();
	obj.get("https://www.javatpoint.com/selenium-maven");
	
	}
}
