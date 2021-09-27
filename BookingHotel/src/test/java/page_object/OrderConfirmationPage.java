package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	public OrderConfirmationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = ".alert")
	private WebElement alertSuccess;

	@FindBy(css = "td.cart_product")
	private WebElement lblRoomImage;

	@FindBy(css = "td.cart_description")
	private WebElement lblRoomDescription;

	@FindBy(css = ".table_body > td:nth-of-type(3)")
	private WebElement lblHotelName;

	@FindBy(css = "tfoot > tr:nth-of-type(1) > [colspan='2']")
	private WebElement lblRoomTaxIncL;

	@FindBy(css = ".totalprice > [colspan='2']")
	private WebElement lblFinalBookingTotal;

	@FindBy(css = "tr:nth-of-type(3) > [colspan='2']")
	private WebElement lblDueAmount;

	@FindBy(css = "td:nth-of-type(4)")
	private WebElement lblUnitPrice;

	@FindBy(css = "td:nth-of-type(5)")
	private WebElement lblRooms;

	@FindBy(css = "td:nth-of-type(6)")
	private WebElement lblCheckIn;

	@FindBy(css = "td:nth-of-type(7)")
	private WebElement lblCheckOut;

	@FindBy(css = "td:nth-of-type(8)")
	private WebElement lblTotal;

	public boolean getSuccessOrderConfirmation() {
		WaitUntilElementIsVisible(alertSuccess);
		alertSuccess.isDisplayed();
		WaitUntilElementIsVisible(lblRoomImage);
		lblRoomImage.isDisplayed();
		WaitUntilElementIsVisible(lblRoomDescription);
		lblRoomDescription.isDisplayed();
		WaitUntilElementIsVisible(lblHotelName);
		lblHotelName.isDisplayed();
		WaitUntilElementIsVisible(lblUnitPrice);
		lblUnitPrice.isDisplayed();
		WaitUntilElementIsVisible(lblRooms);
		lblRooms.isDisplayed();
		WaitUntilElementIsVisible(lblCheckIn);
		lblCheckIn.isDisplayed();
		WaitUntilElementIsVisible(lblCheckOut);
		lblCheckOut.isDisplayed();
		WaitUntilElementIsVisible(lblTotal);
		lblCheckOut.isDisplayed();
		WaitUntilElementIsVisible(lblRoomTaxIncL);
		lblRoomTaxIncL.isDisplayed();
		WaitUntilElementIsVisible(lblFinalBookingTotal);
		lblFinalBookingTotal.isDisplayed();
		WaitUntilElementIsVisible(lblDueAmount);
		lblDueAmount.isDisplayed();

		return true;
	}

	public String getRoomDescription()
	{
		return lblRoomDescription.getText();
	}
	public String getHotelName() {
		return lblHotelName.getText();
	}
	public String getUnitPrice()
	{
		return lblUnitPrice.getText();
	}
	public String getRooms()
	{
		return lblRooms.getText();
	}
	public String getCheckInDate()
	{
		return lblCheckIn.getText();
	}
	public String getCheckOutDate()
	{
		return lblCheckOut.getText();
	}
	public String getTotal()
	{
		return lblTotal.getText();
	}
	public String getRoomTaxInclude()
	{
		return lblRoomTaxIncL.getText();
	}
	public String getFinalBookingTotal()
	{
		return lblFinalBookingTotal.getText();
	}
	public String getDueAmount()
	{
		return lblDueAmount.getText();
	}

}
