package testing;

import org.testng.annotations.Test;

public class Example2 {
	//test are check the oreder but we will give priority which is frst
	@Test(priority = 0)
public void carStart()
{
	System.out.println("car Started");
}
	@Test(priority = 1)
	public void putfirstgear()
	{
		System.out.println("put the frst gear");
	}
	@Test(priority = 2)
	public void putsecondtgear()
	{
		System.out.println("put the frst gear");
	}
	@Test(priority = 3)
	public void putthirdgear()
	{
		System.out.println("put the frst gear");
	}
}
