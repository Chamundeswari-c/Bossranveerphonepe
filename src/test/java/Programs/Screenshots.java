
package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Screenshots {
	public WebDriver driver;

	@Test
	public void alertscreen() throws Exception {

		/*driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Facebook");
		Thread.sleep(3000);
		
		String GA = "Shankar";
		File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Scr, new File("\\\\C:\\\\Users\\\\Chamu\\\\Desktop\\\\Screenshots\\\\" +GA+ ".png"));		
		
		 
		
 /* String ATM = "Raksha";
  File Scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(Scrfile, new File("\\C:\\Users\\Chamu\\Desktop\\Screenshots\\" +ATM+ ".png"));*/ 
		
	
			}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//driver.get("https://demoqa.com/alerts");
		
		
	    /*String ATM = "Moksha";
	    File Scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(Scrfile, new File("\\\\C:\\\\Users\\\\Chamu\\\\Desktop\\\\Screenshots\\\\" +ATM+ ".png"));*/
			
		
		}

	
			
  

  @AfterTest
  public void afterTest() {
  }

}
