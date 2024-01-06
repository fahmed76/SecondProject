package com.smart.group;
import org.testng.annotations.Test;

public class GroupTest {
	
	

	    @Test(groups = {"smoke", "regression"})
	    public void testMethod1() {
	        System.out.println("testMethod1 belongs to smoke and regression groups.");
	    }

	    @Test(groups = {"sanity", "functional"})
	    public void testMethod2() {
	        System.out.println("testMethod2 belongs to sanity and functional groups.");
	    }

	    @Test(groups = {"regression"})
	    public void testMethod3() {
	        System.out.println("testMethod3 belongs to regression group.");
	    }

	    @Test(groups = {"smoke", "functional"})
	    public void testMethod4() {
	        System.out.println("testMethod4 belongs to smoke and functional groups.");
	    }

	    @Test(groups = {"sanity"})
	    public void testMethod5() {
	        System.out.println("testMethod5 belongs to sanity group.");
	    }

	    @Test(groups = {"functional"})
	    public void testMethod6() {
	        System.out.println("testMethod6 belongs to functional group.");
	    }

	    @Test(groups = {"smoke"})
	    public void testMethod7() {
	        System.out.println("testMethod7 belongs to smoke group.");
	    }

	    @Test(groups = {"regression", "sanity"})
	    public void testMethod8() {
	        System.out.println("testMethod8 belongs to regression and sanity groups.");
	    }

	    @Test(groups = {"functional"})
	    public void testMethod9() {
	        System.out.println("testMethod9 belongs to functional group.");
	    }

	    @Test(groups = {"sanity"})
	    public void testMethod10() {
	        System.out.println("testMethod10 belongs to sanity group.");
	    }

	    @Test(groups = {"smoke", "regression"})
	    public void testMethod11() {
	        System.out.println("testMethod11 belongs to smoke and regression groups.");
	    }
	
}
