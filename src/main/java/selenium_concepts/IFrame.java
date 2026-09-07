package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[contains(@class, 'content-active')]//iframe[@class='demo-frame']")));
		
		WebElement sourceEle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='gallery']//li[1]")));
		WebElement tarEle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='trash']")));
	
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceEle, tarEle).perform();

		driver.switchTo().defaultContent();
		
		driver.quit();

	}

}
