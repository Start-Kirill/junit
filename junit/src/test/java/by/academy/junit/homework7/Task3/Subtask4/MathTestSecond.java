/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Test of abs function of Math library
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
public class MathTestSecond extends Assert {

	@Test
	public void testAbs() {
		assertEquals(1, Math.abs(-1));
	}

}