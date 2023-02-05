/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import by.academy.junit.homework7.Task3.Subtask5.TestRunner;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Test of two function of Math library with listener
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
@RunWith(TestRunner.class)
public class MathTestFirst extends Assert {

	@Test
	public void testPow() {
		assertEquals(4, Math.pow(2, 2), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		Math.divideExact(2, 0);
	}
}
