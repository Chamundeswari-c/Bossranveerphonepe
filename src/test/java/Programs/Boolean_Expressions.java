package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean_Expressions {
	public WebDriver driver;
	
  @Test
  public void otpions() throws Exception {
	  //Switching to Roundtrip
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	  Thread.sleep(3000);
	  
	  //Print condition True/False
	  boolean printcondition = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
	  System.out.println(printcondition);
	  
	  WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	  
	  //Condition has to check
	  if (ele.isDisplayed()) {
		System.out.println("Round trip is displayed");
	} else {
		System.out.println("Round trip is not displayed");

	}
	  
	  
	  
  }
 
  
  @BeforeTest
  public void beforeTest() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://savaari.com/");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
