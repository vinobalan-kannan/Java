package selenium_concepts;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingLinksWithinPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));

		List<WebElement> element = footer.findElements(By.cssSelector("div[id='gf-BIG']  td:nth-child(1) a"));

		System.out.println(element.size());

		for (int i = 0; i < element.size(); i++) {
			// element.get(i).click();
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			element.get(i).sendKeys(clickOnLinkTab);
		}
		// set <String> win = footer.get
		System.out.println(driver.getWindowHandles().size());

		Set<String> tabs = driver.getWindowHandles();

		// Using loops to navigate different windows & getting it title
		List<String> tabsList = new ArrayList<>(tabs);

		for (int j = 0; j < tabsList.size(); j++) {
			System.out.println(driver.switchTo().window(tabsList.get(j)).getTitle());
		}

		// Using iterator
//		Iterator <String> it =tabs.iterator(); 
//		while(it.hasNext())
//		{
//			
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}
		driver.quit();
	}

}
