import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement switchTo = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Switch')]"));
		WebElement widgets = driver.findElement(By.xpath("//a[text()='Widgets']"));
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		WebElement fName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		//Actions act = new Actions(driver);
		Actions act = new Actions(driver);
		act.moveToElement(email).build().perform();
		act.moveToElement(email).build().perform();
		Thread.sleep(5000);
		act.moveToElement(fName).build().perform();  
		Thread.sleep(3000);
		act.moveToElement(switchTo).build().perform();
		Thread.sleep(3000);
		act.moveToElement(widgets).build().perform();
		Thread.sleep(3000);
		act.moveToElement(video).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}