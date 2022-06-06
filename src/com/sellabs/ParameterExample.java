package com.sellabs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterExample 
{   
	@Parameters({"value1"})
	@Test
   public void ops(int a)
   {
	   System.out.println("value is:"+a);
   }
}
