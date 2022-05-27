package selenium_sample_example_2;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_sample_example_test {
	
  @Test
    public void login() throws MalformedURLException{
        DesiredCapabilities dr = DesiredCapabilities.chrome();
//specify the browser
        dr.setBrowserName("firefox");  
//specify the environment                
        dr.setPlatform(Platform.WINDOWS);     
     
  //specify the hub URL           
        RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.0.0.158:4444/wd/hub"), dr);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.close();

}
}
