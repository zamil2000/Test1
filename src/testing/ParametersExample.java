package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
// to give user input in xml
	@Test
	@Parameters("Name")
	public void getparameter(String name)
	{
		System.out.println("get parameter from"+name);
	}
}
