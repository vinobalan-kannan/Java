package selenium_concepts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = createInstance();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

		driver.findElement(By.cssSelector("div[class='login-box'] :nth-child(2) >input")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//div[@class='form_group'][1]/following-sibling::input")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Products']")).getText(), "Products");

		driver.findElement(By.xpath("//option[text()='Price (low to high)']")).click();

		List<WebElement> prod_name = driver.findElements(By.cssSelector(".inventory_item_name"));

		List<WebElement> prod_price = driver.findElements(By.cssSelector(".inventory_item_price"));

		List<WebElement> add_to_cart = driver.findElements(By.cssSelector("button[class*='btn_primary']"));

		String name = prod_name.get(0).getText();

		String price = prod_price.get(0).getText();

		System.out.println("After sorting price (low to high) product is " + name + "its price is " + price);

		add_to_cart.get(0).click();

		driver.findElement(By.cssSelector(".shopping_cart_badge")).click();

		boolean checkout = driver.findElement(By.xpath("//span[text()='Your Cart']")).getText().contains("Your Cart");

		Assert.assertTrue(checkout);

		driver.findElement(By.cssSelector(".bm-burger-button")).click();

		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

		driver.quit();

	}

	public static WebDriver createInstance() {
		ChromeOptions options = new ChromeOptions();

		// Create a map to control Chrome's internal profile preferences
		Map<String, Object> prefs = new HashMap<String, Object>();

		// 1. Disable the "Change your password" leak detection warning dialog
		prefs.put("profile.password_manager_leak_detection", false);

		// 2. Turn off the "Save password?" prompt service completely
		prefs.put("credentials_enable_service", false);

		// 3. Prevent Chrome from storing or handling any auto-fill passwords
		prefs.put("profile.password_manager_enabled", false);

		// Apply the preferences profile mapping to your ChromeOptions configuration
		options.setExperimentalOption("prefs", prefs);

		// Optional: Suppress extra command-line warning infobars if they pop up
		options.addArguments("--disable-infobars");

		// Initialize the browser driver utilizing these parameters
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		return driver;

	}
}
