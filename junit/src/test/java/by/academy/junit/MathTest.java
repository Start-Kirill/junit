package by.academy.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import by.academy.junit.listeners.TestRunner;

@RunWith(TestRunner.class)
public class MathTest extends Assert {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@Test
	public void assertEquals() {
		System.out.println("@Test assertEquals 2+2=4");
		assertEquals(3, Math.min(3, 78));
	}

	@Test(timeout = 100)
	public void timeoutTest() {
		int i = 0;
		while (i++ < 101) {
			System.out.println("Test won't pass");
		}
	}

	@Test(expected = ArithmeticException.class)
	public void testMathDivide() {
		System.out.println("@testMathDivide");
		System.out.println(1 / 0);
	}

	@Ignore
	@Test(expected = ArithmeticException.class)
	public void testIgnor() {
		System.out.println("@testIgnor");
		int[] a = new int[1];
		a[20] = 10;

	}
}
