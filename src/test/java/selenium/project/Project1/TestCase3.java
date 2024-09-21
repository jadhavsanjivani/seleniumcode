package selenium.project.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase3 extends Launch_Quit
{
	@Test
	public void valid_login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amazon_HomePage ah = new Amazon_HomePage (driver);
		ah.account_list(driver);
		ah.signin(driver);
		Amazon_LoginPage al = new Amazon_LoginPage( driver);
		al.enter_email();
		al.continue_();
		al.enterPassword();
		al.signin(driver);
	}

}
