package org.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.CustomListener;
import org.utils.TestBase;
@Listeners(CustomListener.class)
public class TestCase extends TestBase {

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
	}
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
