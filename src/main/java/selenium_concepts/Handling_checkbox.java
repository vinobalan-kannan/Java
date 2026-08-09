package selenium_concepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		closeLoginPopup(driver);

		driver.findElement(By.xpath("//form[contains(@action,'/search')]//input[contains(@title,'Search for Products')]"))
				.sendKeys("soap");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
	}

	 public static void closeLoginPopup(WebDriver driver) {
	        // Short 4-second timeout so the test doesn't stall when the popup is absent
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	        
	        try {
	            System.out.println("Looking for Flipkart login popup...");
	            
	            // CSS equivalent of your working XPath: //span[@role='button']
	            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(
	                By.cssSelector("span[role='button']")
	            ));
	            
	            closeButton.click();
	            System.out.println("Success: Login popup closed using span[role='button'].");
	            
	        } catch (Exception e) {
	            // Catches TimeoutException seamlessly if the popup didn't show up on this run
	            System.out.println("Popup not visible on this session. Continuing safely.");
	        }
	    }
}
