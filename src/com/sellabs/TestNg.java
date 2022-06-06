package com.sellabs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg 

{
	@Test (priority = 4)

	public void B()
	{
		System.out.println("10");
	}
	@Test
	public void C()
	{
		System.out.println("C");
	}
	@Test
	public void D()
	{
		System.out.println("D");
	}
	@Test
	public void A()
	{
		System.out.println("A");
	}
	
	@BeforeMethod
	public void precond ()
	{
		System.out.println("Before Method");
	}
	
     @AfterMethod
     public void postcond()
     {
    	 System.out.println("After Method");
     }
}
