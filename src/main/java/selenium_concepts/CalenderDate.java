package selenium_concepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderDate {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String year = "2022";

		String month = "01";

		String date = "19";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__calendar-button > svg")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()=" + year + "]")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();

		driver.findElement(By.xpath(
				"//button[contains(@class,'react-calendar__tile') and not(contains(@class,'neighboringMonth'))] /abbr[text()= "
						+ date + "]"))
				.click();

		Assert.assertEquals(
				(driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[@name='date']"))
						.getAttribute("value")),
				"2022-01-19");

		driver.quit();

		// interview qn uhh -- free ah vitru
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.get("https://www.amazon.in/");
//		
//
//
//		driver.findElement(By.cssSelector(".nav-search-field > #twotabsearchtextbox")).sendKeys("iphone");
//
//		driver.findElement(By.cssSelector(".nav-search-submit.nav-sprite")).click();
//
//		List<WebElement> names=driver.findElements(By.xpath("//div[@data-cy='title-recipe']/a/h2/span"));
//		
//		for(WebElement a : names )
//		{
//			System.out.println(a.getText());
//			System.out.println();
//		}
//		

	}

}
