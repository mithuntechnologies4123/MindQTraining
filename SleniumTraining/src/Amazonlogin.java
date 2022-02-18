import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonlogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "E:\\SeleniumProject\\Drivers\\GeckoDriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		driver.get(url);
		driver.manage().window().maximize();
		int s1 = 5000;
		int s2 = 2000;
		Thread.sleep(s1);
		//Select login= new Select(driver.findElement(By.xpath("//a[@href=\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\"]")));
		//login.selectByVisibleText("Sign in");
		//driver.findElement(By.xpath("//a[@]"))
		//WebElement signin = driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]"));
		//signin.click();
		WebElement email= driver.findElement(By.xpath("//input[@type=\"email\"]"));
		
		Thread.sleep(s2);
		email.sendKeys("+918143275622");
		Thread.sleep(s2);
		WebElement continu = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		Thread.sleep(s2);
		continu.click();
		Thread.sleep(s2);
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Thread.sleep(s2);
		password.sendKeys("Ekasila$3496");
		WebElement signin = driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		signin.click();
		Thread.sleep(s2);
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(s2);
		search.sendKeys("Mobiles");
		Thread.sleep(s2);
		WebElement btn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		Thread.sleep(s2);
		btn.click();
		Thread.sleep(s1);
	//	driver.close();	
		
	}
}
