package selenium;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetDropdown {
	
	
	public static WebDriver driver;
	
	public void AutoSuggestdrop() throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();

	   driver = new ChromeDriver();
	   
	   driver.get("https://www.makemytrip.com/");
	   driver.manage().window().maximize();
	   
	   
	   /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
       WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("webklipper-publisher-widget-container-notification-close-div")));
       System.out.println("Close button found: " + closeButton);
       closeButton.click();*/
	   
	   Thread.sleep(3000);
	   
	   // Create Actions object
       Actions actions = new Actions(driver);

       // Perform a click at a specific location (e.g., x=100, y=200)
       actions.moveByOffset(1395, 483).click().build().perform();
	   
	   driver.findElement(By.xpath("//span[text()='From']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("sydney");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

}
	
	public void HandleMultipleWindow() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		   driver = new ChromeDriver();
		   
		   driver.get("https://www.salesforce.com/au/");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(3000);
		   
		   List<WebElement> cookiesPopup = driver.findElements(By.xpath("//div[contains(@class, 'otCenterRounded default ot-wo-title vertical-align-content')]"));

		// If the cookies popup is present, accept it
		if (!cookiesPopup.isEmpty()) {
		    WebElement acceptButton = driver.findElement(By.xpath("//button[contains(text(), 'Accept All Cookies')]"));
		    acceptButton.click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"1666820637520_9ph\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Test");
		driver.findElement(By.name("UserLastName")).sendKeys("data");
		
		driver.switchTo().window(parentwindow);
		
		
	}
	
	public void MouseOver() {		

		WebDriverManager.chromedriver().setup();

		   driver = new ChromeDriver();
		   
		   driver.get("https://www.ebay.com.au/");
		   driver.manage().window().maximize();
		   WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		   
		   Actions action = new Actions(driver);
		   
		   action.moveToElement(element).perform();		
		
	}
	
	public void DragandDrop() {
		
		WebDriverManager.chromedriver().setup();

		   driver = new ChromeDriver();
		   
		   driver.get("https://jqueryui.com/droppable/");
		   driver.manage().window().maximize();
		   WebElement drag =  driver.findElement(By.id("draggable"));
		   WebElement drop =  driver.findElement(By.id("droppable"));
		   
           Actions action = new Actions(driver);
		   
		   action.dragAndDrop(drag,drop).perform();	
		
		
		
	}
	
	 public static void main(String[] args) throws InterruptedException {
	        
		 AutoSuggetDropdown obj = new AutoSuggetDropdown();
	        //obj.AutoSuggestdrop();
		    //obj.HandleMultipleWindow();
		     obj.MouseOver();
	    }

}
