import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDropdowns {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		String cdriver = "webdriver.chrome.driver";
		String cpath = "E:\\SeleniumProject\\Drivers\\chromedriver.exe";
		String url = "http://www.facebook.com/";
		System.setProperty(cdriver, cpath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//img[@src=\"enter.png\"]")).click();
		Thread.sleep(2000);
		List <WebElement> textboxes = driver.findElements(By.tagName("div"));
		Thread.sleep(2000);
		int txtcount = textboxes.size();
		Thread.sleep(2000);
		System.out.println("The textboxes are ..." + txtcount);
		Thread.sleep(2000);
		for(int i=0; i<txtcount;i++)
		{
			String txtname = textboxes.get(i).getText();
			System.out.println(txtname);
		}
	}

}
