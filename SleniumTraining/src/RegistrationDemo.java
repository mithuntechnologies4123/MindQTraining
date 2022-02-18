import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.automationtesting.in";
		int s2 = 2000;
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement imgNextButton = driver.findElement(By.xpath("//img[@src='enter.png']"));
		imgNextButton.click();
		Thread.sleep(2000);
		WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder= 'First Name']"));
		WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		WebElement rdbmale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement rdbfemale = driver.findElement(By.xpath("//input[@value='FeMale']"));
		WebElement password = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		WebElement confirmpass = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		WebElement btnSUbmit = driver.findElement(By.xpath("//button[@id='Button1']"));

		WebElement cricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		WebElement movies = driver.findElement(By.xpath("//input[@value='Movies']"));
		WebElement hockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
		//WebElement Languages = driver.findElement(By.xpath("//a[text()='English']"));
		Select drpSkills =new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		Select drpyear	= new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
		Select drpMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		Select drpDate = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		
		txtFname.sendKeys("Ramana");
		Thread.sleep(2000);
		txtLname.sendKeys("Chary");
		Thread.sleep(2000);
		address.sendKeys("Hyderabad");
		Thread.sleep(2000);
		email.sendKeys("ramanaricky@gmail.com");
		Thread.sleep(2000);
		phone.sendKeys("900010020");
		Thread.sleep(2000);
		rdbmale.click();
		Thread.sleep(2000);
		cricket.click();
		Thread.sleep(2000);
	//Languages.sendKeys("English");
		Thread.sleep(2000);
		drpSkills.selectByVisibleText("Python");
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		drpyear.selectByVisibleText("2000");
		Thread.sleep(2000);
		drpMonth.selectByVisibleText("April");
		Thread.sleep(2000);
		drpDate.selectByVisibleText("20");
		Thread.sleep(2000);
		password.sendKeys("password");
		confirmpass.sendKeys("password");
		Thread.sleep(5000);
		btnSUbmit.click();
		
	}
}
