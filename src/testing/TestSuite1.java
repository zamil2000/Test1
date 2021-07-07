package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuite1 {
	@Test
   public void opengoogle()
   {
		long start=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
		long end=System.currentTimeMillis();
		long total=start-end;
		System.out.println("Total Time google"+total);
   }
	@Test
	public void getBing()
	{
		long start=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
		long end=System.currentTimeMillis();
		long total=start-end;
		System.out.println("Total Time bing"+total);
	}
	@Test
	public void getyahoo()
	{
		long start=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.yahoo.com");
		driver.quit();
		long end=System.currentTimeMillis();
		long total=start-end;
		System.out.println("Total Time yahoo"+total);
	}
}
