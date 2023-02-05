/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask5;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Listener that invoke when each test method id finished and print name of
 * finished method
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
public class CalculatorTestListener extends RunListener {

	@Override
	public void testFinished(Description description) throws Exception {
		System.out.println(description.getMethodName());
	}

}
