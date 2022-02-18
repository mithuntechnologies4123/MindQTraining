import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumProject\\Drivers\\GeckoDriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    String url ="http://www.amazon.in";
	    driver.get(url);
	    driver.manage().window().maximize();
	    int s1 = 5000;
	    int s2 = 2000;
	    Thread.sleep(s1);
	    WebElement searchbox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    Thread.sleep(s2);
	    WebElement searchbtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	    Thread.sleep(s2);
	    searchbox.sendKeys("Best Sellers");
	    Thread.sleep(s2);
	    searchbtn.click();
	    List <WebElement> links = driver.findElements(By.xpath("//a"));
	    Thread.sleep(s2);
	    int linkcount = links.size();
	    System.out.println(linkcount);
	    Thread.sleep(s2);
	    
	}

}
