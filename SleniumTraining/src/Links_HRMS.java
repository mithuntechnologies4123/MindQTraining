import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_HRMS {

	public static void main(String[] args) throws Exception {
	//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "E:\\SeleniumProject\\Drivers\\GeckoDriver.exe");
    WebDriver driver= new FirefoxDriver();
	//WebDriver driver2 = new ChromeDriver();
	String url = "https://opensource-demo.orangehrmlive.com";
	driver.get(url);
driver.manage().window().maximize();
int s1 = 5000;
int s2 = 2000;
Thread.sleep(s1);
//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
Thread.sleep(s2);
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(s2);
driver.findElement(By.xpath("//a[@href=\"/index.php/pim/viewPimModule\"]")).click();
List <WebElement> LinkNames = driver.findElements(By.xpath("//table/tbody//a"));
int namescount = LinkNames.size();
System.out.println(namescount);
List <WebElement> AllRows = driver.findElements(By.xpath("//table/tbody//tr"));
int rc = AllRows.size();
System.out.println(rc);
Thread.sleep(s2);
driver.findElement(By.xpath("//a[@href=\"/index.php/admin/viewAdminModule\"]")).click();
Thread.sleep(s2);
List <WebElement> AllRows1 = driver.findElements(By.xpath("//table/tbody//tr"));
int rows = AllRows1.size();
System.out.println(rows);



	}

}
