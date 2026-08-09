package selenium_concepts;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhandles {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

//		driver.findElement(By.partialLinkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
//		
//		Set<String> win =driver.getWindowHandles();
//		
//		Iterator<String> it= win.iterator();
//		
//		String parent =it.next();
//		
//		String child =it.next();
//		
//		driver.switchTo().window(child);
//		
//		String id=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
//		
//		driver.switchTo().window(parent);
//		
//		driver.findElement(By.cssSelector("#username")).sendKeys(id);

//		driver.findElement(By.cssSelector("p[class='im-para red']"));

//		for(String s:win)
//		{
//			System.out.println(s);
//		}

		// creating new tab or window & taking screenshot of particular element

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> win = driver.getWindowHandles();

		Iterator<String> iter = win.iterator();

		String parent = iter.next();

		System.out.println(iter.hasNext());

		String child = iter.next();

		driver.switchTo().window(child);

		driver.get("https://rahulshettyacademy.com/");

		driver.switchTo().window(parent);

		WebElement login = driver.findElement(By.cssSelector("div[id='login-box']"));

		File src = login.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("loginImg"));

	}

}
