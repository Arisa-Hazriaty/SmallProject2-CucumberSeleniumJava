package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.CategoryRoomPage;
import page_object.HomepagePage;
import page_object.LoginAuthentication;
import page_object.MyAccountPage;
import page_object.OrderConfirmationPage;
import page_object.OrderSummaryPage;
import page_object.QuickOrderDetailPage;

public class BookingRoomsviaTransferSteps {

	public WebDriver driver;

	String hotellocation;
	String hotelName;
	String datecheckin;
	String datecheckout;
	
	
	public BookingRoomsviaTransferSteps() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("The User Login \"(.*)\"  as email, \"(.*)\" as password")
	public void the_user_login_as_email_as_password(String username, String password) {
		HomepagePage homepage = new HomepagePage(driver);
		homepage.clickSignIn();

		LoginAuthentication login = new LoginAuthentication(driver);
		login.inputEmailAddress(username);
		login.inputPassword(password);
		login.clickButtonSubmitLogin();
	}

	@When("^The User go to HomePage$")
	public void the_user_go_to_home_page() {
		MyAccountPage myaccountpage = new MyAccountPage(driver);
		myaccountpage.clickBtnHome();
	}

//	@When("^The User set \"(.*)\", select The Hotel Prime, set CheckIn and Checkout$")
//	public void setHotel(String hotellocation) throws Throwable {
//		HomepagePage homepage = new HomepagePage(driver);
//		homepage.setHotelLocation(hotellocation);
//		homepage.clickSelectHotel();
//		// homepage.retryingFindClick(by);
//		homepage.clickSelectHotelList();
//		homepage.clickButtonCheckIn();
//		homepage.selectDateCheckIn();
//		homepage.clickButtonCheckOut();
//		homepage.selectDateCheckOut();
//		hotelName = homepage.getHotel();
//		datecheckin = homepage.getDateCheckIn();
//		datecheckout = homepage.getDateCheckOut();
//		
//		
//	}
	
	@When("The User set \"(.*)\", select The Hotel Prime, set \"(.*)\" as date Check In and \"(.*)\" as date Check Out")
	public void setHotelDateDynamic(String hotellocation, String checkin, String checkout) throws Throwable {
		HomepagePage homepage = new HomepagePage(driver);
		homepage.setHotelLocation(hotellocation);
		homepage.clickSelectHotel();
		// homepage.retryingFindClick(by);
		homepage.clickSelectHotelList();
		homepage.setCheckin(checkin, checkout);
		hotelName = homepage.getHotel();
		datecheckin = homepage.getDateCheckIn();
		datecheckout = homepage.getDateCheckOut();
		
	}

	@When("^The User search hotel$")
	public void the_user_search_hotel() {
		HomepagePage homepage = new HomepagePage(driver);
		homepage.clickSearchNow();
	}

	@When("^The User choose how many room input$")
	public void setQuantity() throws InterruptedException {
		CategoryRoomPage categoryroompage = new CategoryRoomPage(driver);
		Thread.sleep(3000);
		// categoryroompage.clickAddQtyExecutiveRooms();
		categoryroompage.clickButtonBookingNowExececutive();
		categoryroompage.getSucceessAddtoCart().contains("Room successfully added to your cart");

	}

	@Then("The User continue process payment")
	public void clickButtonContinueProcess() {
		CategoryRoomPage categoryroompage = new CategoryRoomPage(driver);
		categoryroompage.switchToFrame();
		categoryroompage.clickCheckOutButton();

	}

	@When("^The User validate Rooms & Summary$")
	public void the_User_see_Order_Total_as_Order_Confirmation() throws InterruptedException {
		QuickOrderDetailPage quickorderdetailpage = new QuickOrderDetailPage(driver);
		Thread.sleep(10000);
		quickorderdetailpage.GetPaymentDetail();
		quickorderdetailpage.clickBtnProceed();
		quickorderdetailpage.ClickbtnProceedTnc();
		quickorderdetailpage.ClickCheckBoxTnc();
		Thread.sleep(3000);
		quickorderdetailpage.ClickbtnBankWire();

	}

	@When("^The User Confirmation Order via Transfer as payment method$")
	public void viewOrderSummary() throws InterruptedException {
		OrderSummaryPage ordersummarypage = new OrderSummaryPage(driver);
		Thread.sleep(10000);
		ordersummarypage.getInformationTransfer();
		ordersummarypage.clickBtnKonfirmasiPembelian();
	}

	@Then("^The User see Order, Total as Order Confirmation$")
	public void OrderConfirmation() throws InterruptedException {
		OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
		Thread.sleep(10000);
		System.out.println("1"+hotelName);
		System.out.println("2"+orderConfirmationPage.getHotelName());		
		System.out.println("3"+datecheckin);
		System.out.println("4"+orderConfirmationPage.getCheckInDate());
		Assert.assertTrue(orderConfirmationPage.getSuccessOrderConfirmation());
		Assert.assertEquals(hotelName, orderConfirmationPage.getHotelName());
		Assert.assertEquals(datecheckin, orderConfirmationPage.getCheckInDate()) ;
		Assert.assertEquals(datecheckout, orderConfirmationPage.getCheckOutDate());
		
	}
}
