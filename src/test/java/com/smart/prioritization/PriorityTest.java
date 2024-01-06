package com.smart.prioritization;
import org.testng.annotations.Test;

public class PriorityTest {
	
	    @Test(priority = 7)
	    public void testMethod1() {
	        System.out.println("testMethod1 got executed.");
	    }

	    @Test(priority = 4)
	    public void testMethod2() {
	        System.out.println("testMethod2 got executed.");
	    }

	    @Test(priority = 6)
	    public void testMethod3() {
	        System.out.println("testMethod3 got executed.");
	    }

	    @Test(priority = 3)
	    public void testMethod4() {
	        System.out.println("testMethod4 got executed.");
	    }

	    @Test(priority = 5)
	    public void testMethod5() {
	        System.out.println("testMethod5 got executed.");
	    }

	    @Test(priority = 1)
	    public void testMethod6() {
	        System.out.println("testMethod6 got executed.");
	    }

	    @Test(priority = 2)
	    public void testMethod7() {
	        System.out.println("testMethod7 got executed.");
	    }
}

