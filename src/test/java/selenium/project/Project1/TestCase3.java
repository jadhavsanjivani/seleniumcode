package selenium.project.Project1;

import org.testng.annotations.Test;

public class TestCase3 extends Launch_Quit
{
	@Test
	public void valid_login() throws InterruptedException
	{
		Amazon_HomePage ah = new Amazon_HomePage (driver);
		ah.account_list(driver);
		ah.signin(driver);
		Amazon_LoginPage al = new Amazon_LoginPage( driver);
		al.email();
		al.continue_();
		al.pass();
		al.signin();
	}

}
