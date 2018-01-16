package TestNgExample;

import org.testng.annotations.Test;

public class ParellalTestExample {
	@Test(threadPoolSize=2,invocationCount=2)
	public void ParellelTest1() {

		System.out.println("Test Case 1 with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test(threadPoolSize=2,invocationCount=2)
	public void ParellelTest2() {

		System.out.println("Test Case 2 with Thread Id:- "
				+ Thread.currentThread().getId());

	}

	@Test(threadPoolSize=2,invocationCount=2)
	public void ParellelTest3() {

		System.out.println("Test Case 3 with Thread Id:- "
				+ Thread.currentThread().getId());

	}

	@Test(threadPoolSize=2,invocationCount=2)
	public void ParellelTest4() {

		System.out.println("Test Case 4 with Thread Id:- "
				+ Thread.currentThread().getId());

	}

}
