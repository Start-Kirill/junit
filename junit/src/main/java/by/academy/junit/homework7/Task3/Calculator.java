/*
 * Homework #7. Task #3
 * 
 * Kirill Starovoitov
 */
package by.academy.junit.homework7.Task3;

/**
 * Implementation of task#3 of Homework #7
 * 
 * Calculator for testing
 * 
 * 
 * @version 1.0 04 Feb 2023
 * @author Kirill Starovoitov
 *
 */
public class Calculator {

	public static double sum(double addendOne, double addendTwo) {
		return addendOne + addendTwo;
	}

	public static double subtract(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

	public static double multiply(double multyplierOne, double multyplierTwo) {
		return multyplierOne * multyplierTwo;
	}

	public static double divide(double dividend, double divider) {
		return dividend / divider;
	}

}
