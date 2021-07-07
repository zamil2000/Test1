package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testsuite2Shorttime {
WebDriver driver;
long Starttime;
long Endtime;
@BeforeSuite
public void lanchbrowser()
{
	Starttime=System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	 driver= new ChromeDriver();
}
@Test(priority = 0)
public void opengoogle()
{
	driver.get("http://www.google.co.in");
}
@Test(priority = 1)
public void openbing()
{
	driver.get("http://www.bing.com");
}
@Test(priority = 2)
public void openyahoo()
{
	driver.get("http://www.yahoo.com");
}
@AfterSuite
public void closeBrowser()
{
	driver.quit();
	Endtime=System.currentTimeMillis();
	long total=Starttime-Endtime;
	System.out.println("Total timing"+total);
}
}
