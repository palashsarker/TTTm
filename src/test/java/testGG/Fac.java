package testGG;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import testAA.One;
import testBB.BBOne;
import testCC.CCC;
import testCC.CCOne;
import testDD.SeleniumOne;
import testDD.SeleniumOneFactory;

public class Fac {
	
	@Test
	@Factory
	public Object[] ff() {
		return new Object[] {new SeleniumOneFactory()};
	}

}
