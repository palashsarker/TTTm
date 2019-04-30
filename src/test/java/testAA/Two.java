package testAA;

import org.testng.annotations.Test;

public class Two {
	

	@Test(groups="good")
	public void v() {
		System.out.println("VVVV");
	}

	@Test(groups="good")
	public void w() {
		System.out.println("WWWW");
	}


	@Test(groups="smoke")
	public void x() {
		System.out.println("XXXX");
	}


	@Test(groups="smoke")
	public void y() {
		System.out.println("YYYYYY");
	}

}
