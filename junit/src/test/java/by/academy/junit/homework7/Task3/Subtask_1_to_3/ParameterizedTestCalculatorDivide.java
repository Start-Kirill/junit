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
 * Parameterized test of division function of calculator
 * 
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTestCalculatorDivide extends Assert {

	private double valueA;
	private double valueB;
	private double expected;

	public ParameterizedTestCalculatorDivide(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: {0} / {1} = {2}")
	public static Iterable<Double[]> parametersForTest() {
		return Arrays.asList(new Double[][] { { 1.0, 3.0, 0.33333333 }, { 1.0, 0.0, Double.POSITIVE_INFINITY },
				{ 5.0, 2.5, 2.0 }, { -1.0, 0.0, Double.NEGATIVE_INFINITY }, { -0.0, 0.0, Double.NaN } });
	}

	@Test
	public void testDivide() {
		assertEquals(expected, Calculator.divide(valueA, valueB), 0.000003);
	}

}
