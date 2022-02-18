import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		//WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumProject\\Drivers\\GeckoDriver.exe");
		//driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		String url = "https://opensource-demo.orangehrmlive.com";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Welcome Juan")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}
}