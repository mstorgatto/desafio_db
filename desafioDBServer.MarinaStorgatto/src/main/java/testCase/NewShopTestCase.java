package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import task.NewShopTask;
import verificationPoints.NewShopVerificationPoint;

public class NewShopTestCase {
	
	private WebDriver driver;
	
	public NewShopTask homePage;
	private NewShopVerificationPoint verificationPoint;
	
	@Before
	public void setup() {
		Report.startTest("Valid new shop.");
		driver = Drivers.getChromeDriver();
		homePage = new NewShopTask (driver);
		verificationPoint = new NewShopVerificationPoint(driver);
	}
	@Test
	public void testMain() throws InterruptedException {
		this.driver.get("http://automationpractice.com");
		this.driver.manage().window().maximize();
		
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.AddDressToCart();
		Report.log(Status.INFO,"Add a dress to cart", ScreenShot.capture(driver));
		homePage.ProceedToCheckout1();
		verificationPoint.checkNewShopMessage();
		homePage.ProceedToCheckout2();
		homePage.EmailAddress("testemarina@hotmail.com");
		Report.log(Status.INFO,"Add a new e-mail.", ScreenShot.capture(driver));
		homePage.CreateAnAccount();
		homePage.Name("Marina","Storgatto","senha1234");
		homePage.BirthDay("28");
		homePage.BirthDayMonth("12");
		homePage.BirthDayYear("1992");
		homePage.Address("Marina","Storgatto","Rua Dona Larissa, 45, Centro","Cidadela");
		homePage.State("6");
		homePage.Zip("54126");
		homePage.Phone("5486512365");
		homePage.AddresAlias("Home");
		Report.log(Status.INFO,"New registration completed.", ScreenShot.capture(driver));
		homePage.SubmitAccount();
		Report.log(Status.INFO,"New registration accepted.", ScreenShot.capture(driver));
		homePage.ProceedToCheckout3();
		homePage.AgreeToTheTerms();
		Report.log(Status.INFO,"Agree to the terms.", ScreenShot.capture(driver));
		homePage.ProceedToCheckout4();
		homePage.PayByBankwire();
		Report.log(Status.INFO,"Payment method selected: Pay by Bankwire.", ScreenShot.capture(driver));
		homePage.ConfirmOrder();
		Report.log(Status.INFO,"Confirmed order.", ScreenShot.capture(driver));
		
		verificationPoint.checkNewShopMessage();
	}

	@After
		public void tearDown() {
		driver.quit();
	}
}