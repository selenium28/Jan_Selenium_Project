package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser has Launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximize");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
		loginButton.click();
		
		System.out.println("Login Successfully");
		
		WebElement myInfo = driver.findElement(By.xpath("//*[text()='My Info']"));
		myInfo.click();
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.clear();
		firstName.sendKeys("Nishi");
		
		WebElement middleName = driver.findElement(By.name("middleName"));
		middleName.clear();
		middleName.sendKeys("Test");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.clear();
		lastName.sendKeys("Demo");
		
	}

}
