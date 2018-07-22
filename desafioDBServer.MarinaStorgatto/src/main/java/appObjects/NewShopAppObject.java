package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewShopAppObject {

	private WebDriver driver;
	
	public NewShopAppObject(WebDriver driver) {
		this.driver = driver;	
	}
	
	public WebElement getAddDressToCartButton() {
		
		Actions action = new Actions(driver);
		WebElement pic = this.driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img"));
		action.moveToElement(pic, 199, 199).build().perform();
		
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
	}

	public WebElement getProceedToCheckoutButton1() {
		
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Proceed to checkout")));	
	}
	
	public WebElement getProceedToCheckoutButton2() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));	
	}
	
	public WebElement getEmailAddressTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"email_create\"]"));	
	}
	
	public WebElement getCreateAnAccountButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));	
	}
	
	public WebElement getFirstNameTextField() {
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer_firstname\"]")));	
	}
	
	public WebElement getLastNameTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));	
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}
	
	public WebElement getdropdownDay() {
		return this.driver.findElement(By.xpath("//*[@id=\"days\"]"));	
	}
	
	public WebElement getdropdownMonth() {
		return this.driver.findElement(By.xpath("//*[@id=\"months\"]"));	
	}
	
	public WebElement getdropdownYear() {
		return this.driver.findElement(By.xpath("//*[@id=\"years\"]"));	
	}
	
	public WebElement getFirstNameAddressTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"firstname\"]"));	
	}
	
	public WebElement getLastNameAddressTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"lastname\"]"));	
	}
	
	public WebElement getAddressTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"address1\"]"));	
	}
	
	public WebElement getCityTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"city\"]"));	
	}
	
	public WebElement getdropdownState() {
		return this.driver.findElement(By.xpath("//*[@id=\"id_state\"]"));	
	}
	
	public WebElement getZipTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"postcode\"]"));	
	}
	
	public WebElement getMobilePhoneTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));	
	}
	
	public WebElement getAddressAliasTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"alias\"]"));	
	}
	
	public WebElement getSubmitAccountButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));	
	}
	
	public WebElement getProceedToCheckoutButton3() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));	
	}
	
	public WebElement getAgreeToTheTermsButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"cgv\"]"));	
	}
	
	public WebElement getProceedToCheckoutButton4() {
		return this.driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));	
	}
	public WebElement getCheckPrice() {
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("$28.00")));
	}

	public WebElement getPayByBankwireButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));	
	}
	
	public WebElement getConfirmOrderButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));	
	}
}