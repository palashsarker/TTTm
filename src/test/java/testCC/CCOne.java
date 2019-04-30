package testCC;

import org.testng.annotations.Test;

public class CCOne {
	

	@Test(groups="smoke")
	public void CC1() {
		System.out.println("cc1");
	}

	@Test(groups="good")
	public void CC2() {
		System.out.println("cc2");
	}


	@Test(groups="better")
	public void CC3() {
		System.out.println("cc3");
	}


	@Test(groups="good")
	public void CC4() {
		System.out.println("cc4");
	}

}
