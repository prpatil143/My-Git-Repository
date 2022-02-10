package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import academy.Base;

public class HomePage extends Base {
	
	@Test
	public void HomePageNevigation() throws IOException
	{
		driver=InitiateBrowser();
		driver.get("http://qaclickacademy.com");
	}

}
