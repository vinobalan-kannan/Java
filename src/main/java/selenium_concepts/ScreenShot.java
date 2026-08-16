package selenium_concepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

//		File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(img, new File("E:\\img.png"));

		
		
		// File img =
		// (driver.findElement(By.xpath("//a[@class='w5hRs']"))).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(img, new File("E:\\img.png"));

		
		
		// Getting particular webelement[its different website]
		WebElement login = driver.findElement(By.cssSelector("div[id='login-box']"));
		File src = login.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("loginImg"));

		driver.quit();

	}

}
