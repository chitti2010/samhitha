package firstPackage.pranathiFirstProject;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get("http://www.qaclickacademy.com");
		LandingPage lp=new LandingPage(driver);
		lp.getSignIn().click();
		driver.close();
		
		
	}

}
