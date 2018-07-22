package verificationPoints;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.Report;
import framework.ScreenShot;

public class NewShopVerificationPoint {
	
	private WebDriver driver;
	
	private static final String AUTOMATION_PRACTICE = "Pass.";
	
	public NewShopVerificationPoint (WebDriver driver) {
		 this.driver = driver;
	}
		 
	 public void checkNewShopMessage() {
		 
		 if(this.pageContains(AUTOMATION_PRACTICE)) {
			 Report.log(Status.FAIL, "Fail.", ScreenShot.capture(driver));
		 }
		 else{
			 Report.log(Status.PASS, "Pass.", ScreenShot.capture(driver));
		 }
	 }
	 
	 private boolean pageContains (String text) {
		return this.driver.getPageSource().contains(text);
		 
	 }
		 
 }