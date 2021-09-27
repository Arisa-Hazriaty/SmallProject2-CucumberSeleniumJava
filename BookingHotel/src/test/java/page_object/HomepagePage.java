package page_object;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomepagePage extends BaseClass {

	public HomepagePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = ".user_login")
	private WebElement loginMenu;

	@FindBy(xpath = "//div[@class='shopping_cart']/a")
	private WebElement keranjangIcon;

	@FindBy(xpath = "//button[@class='nav_toggle']")
	private WebElement burgerMenu;

	@FindBy(xpath = "//button[@class='nav_toggle']")
	private WebElement homeMenu;

	@FindBy(xpath = "//a[.='Interior']")
	private WebElement interiorMenu;

	@FindBy(xpath = "//a[.='Amenities']")
	private WebElement amenitiesMenu;

	@FindBy(xpath = "//a[.='Rooms']")
	private WebElement roomMenu;

	@FindBy(xpath = "//a[.='Testimonials']")
	private WebElement testimoniMenu;

	@FindBy(xpath = "//li[6]/a")
	private WebElement kebijakanMenu;

	@FindBy(xpath = "//li[7]/a")
	private WebElement kamiMenu;

	@FindBy(xpath = "//a[.='Contact']")
	private WebElement contactMenu;

	@FindBy(css = ".user_login")
	private WebElement signinMenu;

	@FindBy(css = ".icon-close")
	private WebElement closeMenuBurger;

	@FindBy(css = ".header-hotel-name")
	private WebElement nameHotelLabel;

	@FindBy(xpath = "//span[.='Make Booking']")
	private WebElement makeBookingButton;

	@FindBy(id = "hotel_location")
	private WebElement txtHotelLocation;

	@FindBy(id = "id_hotel_button")
	private WebElement DropDownHotel;

	@FindBy(css = ".search_result_li")
	private WebElement DropdownTheHotelPrime;
	
	@FindBy(id = "hotel_cat_name")
	private WebElement hotelName;

	@FindBy(css = ".ui-datepicker-current-day > .ui-state-default")
	private WebElement checkInPicker;

	@FindBy(css = ".ui-icon-circle-triangle-e")
	private WebElement btnNextMonth;
	
	@FindBy(xpath = "//td")
	private List<WebElement> dateListCheckIn;

	@FindBy(id = "check_out_time")
	private WebElement checkOutTime;
	
	@FindBy(xpath = "//td")
	private List<WebElement> dateListCheckOut;

	@FindBy(xpath = "//span[.='Search Now']")
	private WebElement BtnSearchNow;

	@FindBy(xpath = "//i[@class='icon-angle-left']")
	private WebElement interiorsliderLeft;

	@FindBy(xpath = "//i[@class='icon-angle-right']")
	private WebElement interiorsliderRight;

	@FindBy(xpath = "//p[.='Amenities']")
	private WebElement amenitiesSection;

	@FindBy(xpath = "//p[.='Our Rooms']")
	private WebElement ourRoomSection;

	@FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/2-super-delux-rooms.html']")
	private WebElement bookingDeluxButton;
	
	@FindBy (id = "check_in_time")
	private WebElement checkInTime;
	
	@FindBy (css = "#check_in_time")
	private WebElement checkIndate;
	
	@FindBy (id = "ui-datepicker-div")
	private WebElement CheckInPicker;
	
	@FindBy (xpath = "//input[@id='check_in_time']")
	private WebElement checkInxpath;
	
	@FindBy (id = "check_out_time")
	private WebElement checkOutdate;

	public void clickSignIn() {
		signinMenu.click();
	}

	/*
	 * public boolean isDisplayed() { wait(loginMenu); wait(keranjangIcon);
	 * wait(burgerMenu); wait(signinMenu); return true; }
	 */
	public void setHotelLocation(String hotelLocation) {
		txtHotelLocation.sendKeys(hotelLocation);
	}

	public void clickSelectHotel() {
		WaitUntilElementIsVisible(DropDownHotel);
		DropDownHotel.isDisplayed();
		WaitUntilElementIsClickable(DropDownHotel);
		DropDownHotel.isEnabled();
		DropDownHotel.click();
	}

	public boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				webDriver.findElement(by).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickSelectHotelList() {
		WaitUntilElementIsVisible(DropdownTheHotelPrime);
		DropdownTheHotelPrime.isDisplayed();
		WaitUntilElementIsClickable(DropdownTheHotelPrime);
		DropdownTheHotelPrime.isEnabled();
		DropdownTheHotelPrime.click();
	}

	public void clickButtonCheckIn() {
		checkInPicker.click();
		WaitUntilElementIsVisible(btnNextMonth);
		btnNextMonth.isDisplayed();
		btnNextMonth.click();
		WaitUntilElementIsVisible(btnNextMonth);
		btnNextMonth.isDisplayed();
		btnNextMonth.click();

	}
	
	public void selectDateCheckIn()
	{
		for (WebElement cell: dateListCheckIn){
			   //Select 13th Date 
			   if (cell.getText().equals("20")){
			      cell.findElement(By.linkText("20")).click();
			      break;
			 }
		 
        }
	}
	

	public void clickButtonCheckOut() {
		checkOutTime.click();
		/*WaitUntilElementIsVisible(btnNextMonth);
		btnNextMonth.isDisplayed();
		btnNextMonth.click();*/
	}

	public void selectDateCheckOut()
	{
		for (WebElement cell: dateListCheckOut){
			   //Select 2th Date 
			   if (cell.getText().equals("21")){
			      cell.findElement(By.linkText("21")).click();
			      break;
			 }
		 
        }
	}
	public void clickSearchNow() {
		BtnSearchNow.click();
	}
	
	public String getHotel()
	{
		return hotelName.getText();
	}
	
//	public String getHotelLocation() {
//		
//		return txtHotelLocation.getText();
//		
//	}
	public String getDateCheckIn()
	{
		return checkInxpath.getText();
	}
	public String getDateCheckOut()
	{
		return checkOutdate.getText();
	}
	
	public void setCheckin(String checkin, String checkout)
	{
		 ((JavascriptExecutor) webDriver).executeScript(
	                "arguments[0].removeAttribute('readonly','readonly')",checkIndate);
		 ((JavascriptExecutor) webDriver).executeScript(
	                "arguments[0].removeAttribute('readonly','readonly')",checkOutdate);
		checkIndate.sendKeys(checkin);
		checkOutdate.sendKeys(checkout);
	}
	
	

}