import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9441774");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wwwwiiiii65");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5900);
		driver.close();
	}

}
