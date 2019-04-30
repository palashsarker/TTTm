package testAA;

import org.testng.annotations.Test;

public class Three {
	
	

	@Test(groups="smoke")
	public void m() {
		System.out.println("MMMM");
	}

	@Test(groups="good")
	public void n() {
		System.out.println("NNNN");
	}


	@Test(groups="better")
	public void o() {
		System.out.println("OOOO");
	}


	@Test(groups="good")
	public void p() {
		System.out.println("PPPP");
	}

}
