package testing;

import org.testng.annotations.Test;

public class SkipExample {
	@Test(priority = 0)
	public void carstart()
	{
		System.out.println("car started....");
	}
	@Test(priority = 3,enabled = false)
	public void onradio()
	{
		System.out.println("radio on ");
	}
	@Test(priority = 1)
	public void gotkey()
	{
		System.out.println("Get the key");
	}
	@Test(priority = 2)
	public void sit()
	{
		System.out.println("I AM SITTING");
	}
}
