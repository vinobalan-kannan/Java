package selenium_concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2000);");

		WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));

		List<WebElement> link = footer.findElements(By.tagName("a"));

		SoftAssert a = new SoftAssert();

		for (WebElement l : link) {
			String cleanLink = l.getAttribute("href");

			URL url = URI.create(cleanLink).toURL(); // converting a string to URL

			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // Initializing HTTP connection

			conn.setRequestMethod("HEAD"); // setting our requirement(HEAD refers to accessing its links, status code)

			conn.connect(); // connect based on above requirements

			int i = conn.getResponseCode();

			System.out.println(i);

			a.assertTrue(i < 400, "'" + cleanLink + "'" + " is broken -- Code : " + i);

		}
		driver.quit();

		a.assertAll();

	}

}
