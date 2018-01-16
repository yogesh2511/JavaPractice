package TestNgExample;

import org.testng.annotations.*;

public class AnnotationTest 
{
	int i=0;
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println(++i+")"+"Before_Suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println(++i+")"+"Before_Test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println(++i+")"+"Before_class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println(++i+")"+"After_class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println(++i+")"+"Before_Method");
	}
	@Test
	public void test1()
	{
		System.out.println(++i+")"+"Test_1");
	}
	@Test
	public void test2()
	{
		System.out.println(++i+")"+"Test_2");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println(++i+")"+"After_method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println(++i+")"+"After Test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println(++i+")"+"After suite");
	}

}
