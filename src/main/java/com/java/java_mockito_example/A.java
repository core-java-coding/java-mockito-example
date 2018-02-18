package com.java.java_mockito_example;

/**
 * Hello world!
 *
 */
public class A 
{
    B b;
    public A(B b)
    {
    	this.b=b;
    }
    
    public boolean findCount(int x)
    {
    	System.out.println(x);
    	int count=getRecordCount();
    	if(count > 0) {
    		return true;
    	}
    	return false;
    }

	public  int getRecordCount() {
		// TODO Auto-generated method stub
		System.out.println("same class");
		return 10;
	}
}
