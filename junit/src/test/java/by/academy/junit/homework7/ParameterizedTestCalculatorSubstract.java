package by.academy.junit.homework7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ParameterizedTestCalculatorSubstract extends Assert {

	private double valueA;
	private double valueB;
	private double expected;

	public ParameterizedTestCalculatorSubstract(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: {0} - {1} = {2}")
	public static Iterable<Double[]> parametersForTest() {
		return Arrays.asList(new Double[][] { { 2.3, 4.1, -1.8 }, { 3.1, 2.1, 1.0 }, { 0.0, 1.0, -1.0 } });
	}

	@Test
	public void testSubstraction() {
		assertEquals(expected, Calculator.substract(valueA, valueB), 0.000000000000001);
	}

}
