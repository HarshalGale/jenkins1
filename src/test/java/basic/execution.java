package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution {

	@Test (groups="Food")
	public void swiggy() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
	}
		@Test
		public void Facebook () {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
		}

			@Test (groups="Food")
			public void  Zomato() {
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.zomato.com/pune/collections");
	}
	
}
