package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import configuration.Confi;

public class Demo {  
	
	@Test
	@Parameters("browserName")
	public void tc01(String str) throws InterruptedException {
		if(str.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Confi.geckodriverpath);
			WebDriver driver =new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}else {
			System.setProperty("webdriver.chrome.driver", Confi.diverpath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		
	}
	
	
	
	
	
	
	

}
