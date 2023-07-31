package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meeshow {
  @Test
  public void EC_123_meeshoTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("opening meeshow", true);
	  driver.get("https://www.meesho.com/");
	  driver.manage().deleteAllCookies();
	  //Assert.fail();
	  Thread.sleep(7000);
	  driver.close();
  }
}
