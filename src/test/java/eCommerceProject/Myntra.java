package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("opening myntra", true);
	  driver.get("https://www.myntra.com/");
	  driver.manage().deleteAllCookies();
	  //Assert.fail();
	  Thread.sleep(7000);
	  driver.close();
  }
}
