package testing;

import org.testng.annotations.Test;

public class DependenciesMange {
//Dependendencies is manged by one by one ex:
	@Test(enabled = true)
	public void school()
	{
		System.out.println("school");
	}
	@Test(dependsOnMethods = "school")
	public void higherSchool()
	{
		System.out.println("Higer schhol");
	}
	@Test(dependsOnMethods = "higherSchool")
	public void collage()
	{
		System.out.println("This is collage");
	}
}
