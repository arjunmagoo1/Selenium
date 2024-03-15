package selenium;



import org.openqa.selenium.By;


//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;	

public class LoginTest {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}		

		/*driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String curentURL = driver.getCurrentUrl();
		System.out.println(curentURL);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(webelements);
				//driver.close();
		
		*/
		
		driver.navigate().to("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize(); 
		
		WebElement acceptCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        acceptCookiesButton.click();
		
		WebElement ddown = driver.findElement(By.id("how-select"));
		Select select = new Select(ddown);
		select.selectByValue("Event");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Previously Used");
		Thread.sleep(2000);
		
		select.selectByIndex(5);
		

		
	}

}
