package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver intializeDriver() throws IOException  
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ashok\\eclipse-workspace\\pranathiFirstProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashok\\eclipse-workspace\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
	}
