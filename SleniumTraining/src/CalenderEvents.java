import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderEvents {

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
	driver.findElement(By.xpath("//a[@href=\"/index.php/leave/viewLeaveModule\"]")).click();
	driver.findElement(By.xpath("//img[@class=\"ui-datepicker-trigger\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr[2]/td[2]")).click();
	Thread.sleep(3000);
     driver.findElement(By.xpath("//form[@id=\"frmFilterLeave\"]//ol//li[2]//img")).click();
     Thread.sleep(3000);
   WebElement leave= driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr[3]/td[4]"));
   leave.click();
	String ldate = leave.getText();
	System.out.println("The Leaving date is :" + ldate);
	
	Select SubUnit = new Select(driver.findElement(By.xpath("//select[@id=\"leaveList_cmbSubunit\"]")));
	SubUnit.selectByVisibleText("Administration");
driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
	}

}
