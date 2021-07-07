package testing;

import org.testng.annotations.Test;

public class Alwaysrun {
	@Test(timeOut = 2000)
public void parentspermission() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println("permision given");
}
	@Test(dependsOnMethods = "parentspermission",alwaysRun = true)
public void lovemarrage()
{
	System.out.println("marrage Happened");
}
}
