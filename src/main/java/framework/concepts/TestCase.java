package framework.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

	int a = 10;
	int b = 6;

	@Test
	public void add() {
		System.out.println(a + b);
	}

	@Test
	public void sub() {
		System.out.println(a - b);
		Assert.fail("Intentional failure to prevent multiplication");
	}

	@Test(dependsOnMethods = "sub")
	public void multiply() {
		System.out.println(a * b);
	}
}
