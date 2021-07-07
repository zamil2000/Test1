package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertequal {
String name= "agni";
boolean value=false;
@Test
public void Check()
{
	//Assert.assertEquals(name,"Agni");
	//Assert.assertNotEquals(name, "agni");
	//Assert.assertTrue(value,"this is false");
	Assert.assertFalse(value, "this is true");
}
  
}
