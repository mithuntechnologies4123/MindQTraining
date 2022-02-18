import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbacccreate {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		String cdriver = "webdriver.chrome.driver";
		String cpath = "E:\\SeleniumProject\\Drivers\\chromedriver.exe";
		String url = "https://www.facebook.com/";
		System.setProperty(cdriver, cpath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement Surname = driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]"));
		WebElement Email = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@data-type=\"password\"]"));
		WebElement gender = driver.findElement(By.xpath("//input[@value=\"2\"]"));
		
		FirstName.sendKeys("Guru");
		Surname.sendKeys("RK");
		Email.sendKeys("8143275622");
		password.sendKeys("pass@123");
		gender.click();
		Select birthDay =new Select(driver.findElement(By.id("day")));
		Thread.sleep(2000);
		Select birthMonth =new Select(driver.findElement(By.id("month")));
		Thread.sleep(2000);
		Select birthYear =new Select(driver.findElement(By.id("year")));
		Thread.sleep(2000);
		birthDay.selectByIndex(29);
		Thread.sleep(2000);
		birthMonth.selectByVisibleText("Oct");
		Thread.sleep(2000);
		birthYear.selectByValue("1996");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
	}
	
}
