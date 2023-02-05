/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3.Subtask_1_to_3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Test suite for parameterized test
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ParameterizedTestCalculatorDivide.class, ParameterizedTestCalculatorMultiply.class,
		ParameterizedTestCalculatorSubstract.class, ParameterizedTestCalculatorSum.class })
public class TestSuiteForCalculator {

}
