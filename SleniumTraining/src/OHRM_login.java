import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("PIM")).click();
Thread.sleep(2000);
driver.findElement(By.name("btnAdd")).click();
Thread.sleep(2000);
driver.findElement(By.name("firstName")).sendKeys("Ram");
driver.findElement(By.name("lastName")).sendKeys("Mitta");
String empID = driver.findElement(By.name("employeeId")).getAttribute("value");
driver.findElement(By.name("chkLogin")).click();
driver.findElement(By.name("user_name")).sendKeys("kevvvu");
driver.findElement(By.name("user_password")).sendKeys("Nagkk@111");
driver.findElement(By.name("re_password")).sendKeys("Nagkk@111");
driver.findElement(By.id("btnSave")).click();
System.out.println("Employee Id ---"+empID);
driver.findElement(By.linkText("Welcome Paul")).click();
driver.findElement(By.partialLinkText("Welcome ")).click();
driver.findElement(By.linkText("Logout")).click();
driver.close();
		
	}

}
