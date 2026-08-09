package selenium_concepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_concepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Static Dropdown using select class
//		WebElement selectdrop = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
//		Select drop=new Select(selectdrop);
//		System.out.println(drop.getFirstSelectedOption().getText());  //To get txt of current option in dropdown
//		drop.selectByValue("USD");
//		
//		
//		//Chossing 5 adults in dropdown via loop
//		driver.findElement(By.id("divpaxinfo")).click();
//		
//		for(int i=1; i<5;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();	
//		}
//		driver.findElement(By.className("buttonN")).click();
//		driver.close();

		// parent child -- unique way to locate without index
//		driver.findElement(By.cssSelector(("span.red-arrow-btn"))).click();
//		
//		driver.findElement(By.xpath("//a[text()=' Goa (GOI)']")).click();
//		
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
//	

//		

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}
	}
}