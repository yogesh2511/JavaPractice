package TestNgExample;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParatmeterExample 
{
	int i=0;
	
	//@Parameters({"username","password"})
	@Parameters({ "username", "password" })
	@Test	
	public void test1(String username, String password)
	{
		//System.out.println("vadodara");
		System.out.println(++i+")"+username);
		System.out.println(++i+")"+password);
	}
	@Parameters({ "username", "password" })
	@Test	
	public void test2(String username, String password)
	{
		//System.out.println("vadodara");
		System.out.println(++i+")"+username);
		System.out.println(++i+")"+password);
		Assert.assertEquals(true, false);
	}
	

}
