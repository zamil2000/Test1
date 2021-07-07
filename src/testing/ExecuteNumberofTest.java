package testing;

import org.testng.annotations.Test;

public class ExecuteNumberofTest {
@Test(invocationCount = 4)
	public void test() {
		System.out.println("Testing......");
	}
}
