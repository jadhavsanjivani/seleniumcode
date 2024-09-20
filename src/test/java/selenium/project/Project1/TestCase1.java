package selenium.project.Project1;
import selenium.project.Project1.Amazon_ResistarionPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends Launch_Quit
{
	//WebDriver driver;


	@Test
	public void registration() throws InterruptedException
	{
		Amazon_HomePage ah = new Amazon_HomePage(driver);
		ah.account_list(driver);
		ah.click_start_here();
		Amazon_ResistarionPage ar = new Amazon_ResistarionPage(driver);
		ar.name_field();
		ar.mobile_number_field();
		ar.password_field();
		ar.verify_button(driver);
		//ar.solve_puzzle_box(driver);
		
	}

}
