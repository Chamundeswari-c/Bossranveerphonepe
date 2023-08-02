package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Enhancing_StudentQAForm {
	public WebDriver driver;
	
  @Test
  public void improvements() throws Exception {
	  //Firstname
	 /* driver.findElement(By.id("firstName")).sendKeys("Raksha");
	  Thread.sleep(3000);
	  //lastname
	  driver.findElement(By.id("lastName")).sendKeys("Moksha");
	  Thread.sleep(3000);
	  //USermail
	  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Rakshamoksha@gmail.com");
	  Thread.sleep(3000);
	  //gender ratio
	  driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
	  //driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]")).click();
	  Thread.sleep(3000);
	  //Mobilenumber
	  driver.findElement(By.id("userNumber")).sendKeys("9642608637");
	  Thread.sleep(3000);
	  //Calendar
	  
	 driver.findElement(By.id("dateOfBirthInput")).click();
	 Thread.sleep(3000);
	 //Selecting October
	 new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("October");
	 Thread.sleep(3000);
	 
	 //Selecting year
	 new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1989");
	 Thread.sleep(3000);
	 
	 //Click on OCt 19 Date.
	 driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, October 19th, 1989']")).click();
	 Thread.sleep(3000);
	 //Subjects
	 driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  Thread.sleep(3000);
	 // subject to enter
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  //hobbies
	  driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
	  Thread.sleep(3000);
	  //Upload a pictute*/
	  driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\download.jfif");
	  Thread.sleep(3000);
	  //Current address
	  driver.findElement(By.id("currentAddress")).sendKeys("Welcoem to tirupathi");
	  Thread.sleep(3000);
	  //click to next line
	  driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  //Selecting state 
	 driver.findElement(By.id("state")).sendKeys("Rajasthan");
	  Thread.sleep(3000);
	  driver.findElement(By.id("state")).sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
	  driver.findElement(By.id("state")).sendKeys(Keys.TAB);
	  Thread.sleep(5000);
	/*Selecting state 
	  driver.switchTo().activeElement().sendKeys("NCR");
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(5000);*/
	  
  }
  
  
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
