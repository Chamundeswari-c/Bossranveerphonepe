package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Frames  {
	public WebDriver driver;
	public Actions action;
  @Test
  public void clickable() throws Exception {
	  // iframe concept
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	// Element which needs to drag.
	  WebElement dragTo = driver.findElement(By.id("draggable"));
	// Element which needs to drop
	  WebElement dropTo = driver.findElement(By.id("droppable"));
	  
	// Using Action class for drag and drop.
	  action = new Actions(driver);
	// Dragged and dropped.*****
	  action.dragAndDrop(dragTo, dropTo).build().perform();
		//Back to Out of te frame
	  driver.switchTo().parentFrame();
	  Thread.sleep(3000);
	  //Back to demo window
	  driver.findElement(By.linkText("Demos")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
