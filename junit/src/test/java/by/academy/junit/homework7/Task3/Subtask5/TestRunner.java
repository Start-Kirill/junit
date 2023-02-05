/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask5;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Runner for testing with listener
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
public class TestRunner extends BlockJUnit4ClassRunner {

	private CalculatorTestListener listener;

	public TestRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
		listener = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(listener);
		super.run(notifier);
	}

}
