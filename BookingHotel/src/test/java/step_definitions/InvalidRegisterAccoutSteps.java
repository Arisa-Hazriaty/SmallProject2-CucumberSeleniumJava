package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.AccountCreationPage;

public class InvalidRegisterAccoutSteps {
	
	public WebDriver driver;
	
	public InvalidRegisterAccoutSteps()
	{
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("^User Open the Homepage$")
	public void user_Open_the_Homepage() throws Throwable {
		
	    CreateAccountSteps createaccountsteps = new CreateAccountSteps();
	    createaccountsteps.clickSignInMenu();
	    
	}

	@When("^User create account \"([^\"]*)\" as Email Address on Login Authentication$")
	public void user_create_account_as_Email_Address_on_Login_Authentication(String email) throws Throwable {
		
		CreateAccountSteps createaccountsteps = new CreateAccountSteps();
		createaccountsteps.registerEmailAddress(email);
	}

	@When("^User input invalid data such as \"([^\"]*)\" as firstname, \"([^\"]*)\" as lastname, \"([^\"]*)\" as password$")
	public void user_input_invalid_data_such_as_as_firstname_as_lastname_as_password(String firstname, String lastname, String password) throws Throwable {
		AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
    	assertTrue(accountCreationPage.isDisplayed());
    	accountCreationPage.setfirstName(firstname);
    	accountCreationPage.setlastName(lastname);
    	accountCreationPage.setPassword(password);
    	accountCreationPage.clickRegister();
	}

	@Then("^User see error notification$")
	public void user_see_error_notification() throws InterruptedException {
		
		AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
		Thread.sleep(10000);
		accountCreationPage.clickRegisterInvalid();
		Assert.assertTrue(accountCreationPage.clickRegisterInvalid());
	    
	}

}
