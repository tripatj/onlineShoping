package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class StartBrowser {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeclass (){
		System.setProperty("webdrver.chrome.driver", "C:/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();		
	}
	
	@AfterClass
	public void afterclass (){
		driver.quit();		
	}
	




}
