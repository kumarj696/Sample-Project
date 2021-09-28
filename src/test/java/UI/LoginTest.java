package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static String browser = "Chrome"; // external configuration from excel or csv files

	//public static FirefoxDriver driver;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals(browser)) {

			WebDriverManager.firefoxdriver().setup();
			//FirefoxDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
		} else if (browser.equals(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000);
		driver.close();

	}

}
