package selenium.project.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_LoginPage extends Amz_DDT
{
	WebDriver driver;
	
	@FindBy(name = "email")
	WebElement emailField;
	@FindBy(id = "continue")
	WebElement continue_button;
	@FindBy(name = "password")
	WebElement passwordField;
	@FindBy(id = "signInSubmit")
	WebElement signin_button;
	
	public void enter_email() throws EncryptedDocumentException, IOException
	{
		valid_cred();
		emailField.sendKeys(username);
	}
	public void continue_()
	{
		
		continue_button.click();
	}
	public void enterPassword() throws EncryptedDocumentException, IOException
	{
		valid_cred();
		passwordField.sendKeys(pass);
	}
	public void signin(WebDriver driver)
	{
		signin_button.click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Login failed");
		
	}
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
