package testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import framework.Report;
import testCase.NewShopTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	NewShopTestCase.class
})
public class NewShopTestSuite {
	@BeforeClass
	public static void initTest() {
		Report.create("My store", "Shopping a new product.");
	}
	
	@AfterClass
	public static void endTest() {
		Report.close();
	}
}