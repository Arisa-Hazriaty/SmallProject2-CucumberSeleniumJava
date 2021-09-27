package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.MyAccountPage;
import page_object.OrderHistoryPage;

public class ViewOrderHistorySteps {
	
	public WebDriver driver;
	
	public ViewOrderHistorySteps(){
		super();
		this.driver = Hooks.driver;
	}

	@Given("The User Logged \"(.*)\"  as email, \"(.*)\" as password")
	public void the_user_logged_as_email_as_password(String username, String password) 
	{
	    BookingRoomsviaTransferSteps bookingroomsviatransfersteps = new BookingRoomsviaTransferSteps();
	    bookingroomsviatransfersteps.the_user_login_as_email_as_password(username, password);
	}

	@When("^The User choose Order History and Details$")
	public void the_user_choose_order_history_and_details() {
	    MyAccountPage myaccountpage = new MyAccountPage(driver);
	    myaccountpage.clickBtnOrderHistory();
	}

	@Then("The User verified order history")
	public void the_user_verified_order_history() throws InterruptedException {
	    OrderHistoryPage orderhistorypage = new OrderHistoryPage(driver);
	    Thread.sleep(10000);
	    orderhistorypage.getOrderHistory();
	    Assert.assertTrue(orderhistorypage.getOrderHistory());
	}

}
