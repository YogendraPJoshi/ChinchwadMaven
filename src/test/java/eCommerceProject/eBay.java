package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class eBay {
  @Test
  public void eBayTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("opening ebay", true);
	  driver.get("https://www.ebay.com/");
	  driver.manage().deleteAllCookies();
	  //Assert.fail();
	  Thread.sleep(7000);
	  driver.close();
  }
}
