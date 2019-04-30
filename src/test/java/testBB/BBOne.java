package testBB;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BBOne {
	

	@BeforeTest
	public void open() {
		System.out.println("open");
	}
	@Test
	public void BB1() {
		System.out.println("bb1");
	}
	@Test
	public void hh() {
		System.out.println("hhhh");
	}
	
	@AfterTest
	public void close() {
		System.out.println("close");
	}

	/*@Test(groups="good")
	public void BB2() {
		System.out.println("bb2");
	}


	@Test(groups="better")
	public void BB3() {
		System.out.println("bb3");
	}


	@Test(groups="good")
	public void BB4() {
		System.out.println("bb4");
	}*/

}
