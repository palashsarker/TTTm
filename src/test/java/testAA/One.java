package testAA;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class One {
	
	@Test
	public void soft() {
		int a=90;
		int aa=10;
		int b=a+aa;
		Assert.assertEquals(b, 1001);
		System.out.println("after test");
		
		
	}
	
	/*
	@Test(expectedExceptions=Throwable.class)
	//@Test
	public void dada() {
		int a=90;
		int b=0;
		int c=a/b;
		System.out.println(c);
		String a="pal";
		
		System.out.println(a.charAt(3));
		System.out.println("this is for dada");
		
	}
	*/
	
/*	
	@Test(groups="good")
	public void A() {
		System.out.println("AAAAA");
	}

	@Test(groups="good")
	public void B() {
		System.out.println("BBBB");
	}


	@Test(groups="smoke")
	public void C() {
		System.out.println("CCCC");
	}


	@Test(groups="better")
	public void D() {
		System.out.println("DDDDD");
	}*/


}
