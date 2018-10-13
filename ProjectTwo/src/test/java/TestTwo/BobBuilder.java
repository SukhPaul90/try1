package TestTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BobBuilder {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/sukhsingh/Desktop/ProjectTwo/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		WebElement userBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		userBox.sendKeys("sjhfgfgh");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("asdfasdfa");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		login.click();

	}

}
