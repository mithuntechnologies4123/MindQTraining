

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		String cdriver = "webdriver.chrome.driver";
		String cpath = "E:\\SeleniumProject\\Drivers\\chromedriver.exe";
		String url = "https://www.amazon.in/";
		System.setProperty(cdriver, cpath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		//driver.findElement(By.partialLinkText("Mobiles")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.tagName("a")).click();
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		System.out.println("Total links ..." + linkcount);
		for(int i=0; i<linkcount;i++)
		{
			String linkname = links.get(i).getText();
			System.out.println(linkname);
		}

	}

}
