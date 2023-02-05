/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask_1_to_3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.homework7.Task3.Calculator;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Parameterized test of multiplication function of calculator
 * 
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTestCalculatorMultiply extends Assert {

	private double valueA;
	private double valueB;
	private double expected;

	public ParameterizedTestCalculatorMultiply(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: {0} * {1} = {2}")
	public static Iterable<Double[]> parametersForTest() {
		return Arrays.asList(new Double[][] { { 1.3, 3.0, 3.9 }, { 1.1, 0.0, 0.0 }, { -1.3, 3.0, -3.9 } });
	}

	@Test
	public void testMultiplication() {
		assertEquals(expected, Calculator.multiply(valueA, valueB), 0.000000000000001);
	}
}
