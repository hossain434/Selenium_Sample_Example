package selenium_sample_example_2;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium_sample_example_test {

	//public static void main(String args[]) {
	@Test
	  public void verifyHomepageTitle() {
		//System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.158:4444/wd/hub"), options);
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed: Title is - " +actualTitle);
		} else {
			System.out.println("Test Failed" );
		}
		driver.close();
	}
}
