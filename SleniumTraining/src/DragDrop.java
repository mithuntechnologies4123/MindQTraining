import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://jqueryui.com");
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        WebElement linkDroppable = driver.findElement(By.linkText("Droppable"));
        linkDroppable.click();
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
        action.clickAndHold(drag).moveToElement(drop).release().build().perform();
 //       action.doubleClick().release().build().perform();
        
        Thread.sleep(3000);
	}

}