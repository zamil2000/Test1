package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExam {
	@Test
public void opengoogle() {
     System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe" );
     WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
}
	@Test
public void openbing() {
    System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe" );
    WebDriver driver= new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
}

}
