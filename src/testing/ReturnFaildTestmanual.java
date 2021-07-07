package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnFaildTestmanual {
	@Test()
public void test1(){
	Assert.assertEquals(true, false);
}
	@Test
public void test2(){
	Assert.assertEquals(false, true);
}

}
