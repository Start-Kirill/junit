/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask_1_to_3;

import org.junit.runner.JUnitCore;

import by.academy.junit.homework7.Task3.Subtask5.CalculatorTestListener;

/**
 * Implementation of task#3 of Homework #7
 * 
 * The second way to add a listener to suite of parameterized test
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
public class TestWithListener {

	public static void main(String... args) {
		JUnitCore core = new JUnitCore();
		core.addListener(new CalculatorTestListener());
		core.run(TestSuiteForCalculator.class);
	}
}
