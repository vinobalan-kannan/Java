package selenium_concepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		String[] veggies = { "Cucumber", "Beetroot" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) 
		{
			
			String[] p = products.get(i).getText().split("-");

			String finalName = p[0].trim();

			List<String> requirementList = Arrays.asList(veggies);

			if (requirementList.contains(finalName)) 
				{
				
					System.out.println(finalName);
	
					driver.findElements(By.cssSelector(".product-action > button")).get(i).click();
				
				}
		}
		driver.findElement(By.cssSelector(".cart-icon > img")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector("input[class=\"promoCode\"]")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='promoWrapper'] //span")));
		
		System.out.println(driver.findElement(By.xpath("//div[@class ='promoWrapper'] /span")).getText());
		
		driver.quit();
	}
}
