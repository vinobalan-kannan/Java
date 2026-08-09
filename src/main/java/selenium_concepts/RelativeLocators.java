package selenium_concepts;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement chkBox = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		driver.findElement(with(By.tagName("input")).below(chkBox)).click();

		WebElement alert = driver.findElement(By.cssSelector("#alertbtn"));
		driver.findElement(with(By.tagName("input")).toRightOf(alert)).click();

		driver.quit();

	}

}
