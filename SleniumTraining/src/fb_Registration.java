import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_Registration
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://amazon.in";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Japan")).click();
		Thread.sleep(3000);
		String currurl = driver.getCurrentUrl();
		String codeurl = driver.findElement(By.linkText("Japan")).getAttribute("href");
		System.out.println(currurl);
		System.out.println(codeurl);
		driver.close();
	}
}
