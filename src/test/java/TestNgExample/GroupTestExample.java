package TestNgExample;

import org.testng.annotations.*;

public class GroupTestExample 
{
	@Test(groups={"Regression"})
	public void Regressiontest1()
	{
		System.out.println("Regression Test 1");
	}
	@Test(groups={"smoke"})
	public void smoketest2()
	{
		System.out.println("smoke Test 2");
	}
	@Test(groups={"Regression"})
	public void Regressiontest3()
	{
		System.out.println("Regression Test 3");
	}
	@Test(groups={"smoke"})
	public void smoketest4()
	{
		System.out.println("smoke Test 4");
	}


}
