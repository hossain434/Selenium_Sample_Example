package selenium_sample_example_2;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium_sample_example_test {

	//public static void main(String args[]) {
	@Test
	  public void verifyHomepageTitle() {
	  ChromeOptions chromeOptions = new ChromeOptions();
      WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.158:4444/wd/hub"), chromeOptions);
      driver.get("http://www.google.com");
      	  driver.quit();
	}
	}
