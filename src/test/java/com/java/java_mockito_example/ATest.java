package com.java.java_mockito_example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ATest {
	
	A a;
	B b;
	@Before
	public void before()
	{
		b=Mockito.mock(B.class);
		//b=new B();
	    a=new A(b);
	}
	@Test
	public void testFindCount() {
		//Mockito.when(b.getRecordCount()).thenReturn(2);
	    A aSpy=Mockito.spy(a);
	    Mockito.doReturn(2).when(aSpy).getRecordCount();
		boolean flag=aSpy.findCount(20);
		assertTrue(flag);
		
		//Mockito.when(b.getRecordCount()).thenReturn(-1);
		  Mockito.doReturn(-1).when(aSpy).getRecordCount();
		flag=aSpy.findCount(10);
		assertFalse(flag);
		System.out.println("DEV1 changes in test");
	}

}
