package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IplTable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("ipl points table 2026",Keys.ENTER);
		
		Thread.sleep(10000);
		
		System.out.println(driver.findElement(By.xpath("//tr[@aria-label='RCB']/child::td[8]/div")).getText());
	}

}
