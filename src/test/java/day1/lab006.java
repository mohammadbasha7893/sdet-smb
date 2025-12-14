package day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test

public class lab006 {

	public void one() {

		System.out.println("Test");

	}

	@AfterTest

	public void one1() {
		System.out.println("AfterTest");

	}

	@BeforeTest

	public void one2s() {

		System.out.println("BeforeTest");

	}

}
