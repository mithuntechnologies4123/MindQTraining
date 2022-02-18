import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver98.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.redbus.in/";
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys("Hyderabad");
	 driver.findElement(By.xpath("//input[@data-message=\"Please enter a destination city\"]")).sendKeys("Chennai");
	 driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
	 
	 driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]//table//tbody//tr[6]//td[3]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	 Thread.sleep(4000);
	 driver.close();
	}
}

	/* String year = "2022";
	 String month = "April";
	 String date = "20";
	// driver.findElement(By.id("onward_cal")).click();
	 
	 while(true)
	 {
		 String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		 String arr[] = monthyear.split("");
		 String mon = arr[0];
		 String yr= arr[1];
		 
	if(mon.equalsIgnoreCase(month) && yr.equals(year))
		break;
	
	else
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		 
	 }
  List<WebElement> alldates = (List<WebElement>) driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td"));
  
  for(WebElement ele:alldates)
  {
	  String dt=ele.getText();
	 if(dt.equals(date))
	 {
		 ele.click();
		 break;
	 }
     }
  }*/

