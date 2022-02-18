import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyTicket {

	public static void main(String[] args) throws Exception {
		String cpath = "webdriver.chrome.driver";
		String cdriver = "E:\\SeleniumProject\\Drivers\\chromedriver.exe";
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty(cpath, cdriver);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

}
