package selenium;

//import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class testdata {
	
	public void jagran() {
        // Set the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arjun\\Downloads\\chromedriver-win64latest\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://demoqa.com");
        
        WebElement linkElement = driver.findElement(By.cssSelector("a[href='https://www.toolsqa.com/selenium-training/']"));
       linkElement.click();
       
    // Get the current window handle
       String currentWindowHandle = driver.getWindowHandle();

       // Get all window handles
       Set<String> allWindowHandles = driver.getWindowHandles();

       // Switch to the new tab
       for (String windowHandle : allWindowHandles) {
           if (!windowHandle.equals(currentWindowHandle)) {
               driver.switchTo().window(windowHandle);
               break;
           }
       }

       // Now you are on the new tab, you can locate and interact with elements on this tab
       WebElement enrollFormLink = driver.findElement(By.cssSelector("a[href='#enroll-form']"));
       enrollFormLink.click();

       
       
        
      
     // Wait for the new page to load completely
   
       /// WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //String test = driver.findElement(By.tagName("a")).getText();
       // System.out.println(test);
        
       // String cssSelector = "a.btn.btn-primary-shadow.btn-block[href='#enroll-form']";
       // WebElement anchor = driver.findElement(By.cssSelector(cssSelector));

      //  anchor.click();
        //WebElement button = driver.findElement(By.className("btn btn-primary-shadow btn-block"));

        // Click the button
        
        //WebElement linkElement2 = driver.findElement(By.cssSelector("a[href='#enroll-form']"));
        
        //WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(button));
        
        //button.click();
     
        
       
    

        // Close the browser window
        //driver.quit();
    }

    public static void main(String[] args) {
        // Create an instance of the Login class and call the jagran method
    	testdata obj = new testdata();
        obj.jagran();
    }

}
