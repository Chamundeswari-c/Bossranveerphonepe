package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Autoit  {
	public WebDriver driver;
  @Test
  public void chooseoption() throws Exception {
	  WebElement ele = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  ele.sendKeys("C:\\Users\\Chamu\\Desktop\\Screenshots\\download.jfif");
	  
	  Thread.sleep(3000);
	//Autoit command.
	  Runtime.getRuntime().exec("\\C:\\Users\\Chamu\\Desktop\\BBQ.exe\\");
  }
 
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
