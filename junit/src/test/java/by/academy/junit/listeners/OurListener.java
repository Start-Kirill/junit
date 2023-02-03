package by.academy.junit.listeners;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class OurListener extends RunListener {

	@Override
	public void testRunFinished(Result result) throws Exception {
		System.out.println("Test cases executed: " + result.getRunCount());
		System.out.println("Test cases failured: " + result.getFailureCount());
//		System.out.println("Test cases executed: " + result.getRunCount());
	}

}
