package page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderHistoryPage extends BaseClass {

	public OrderHistoryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//th[@class='first_item footable-first-column']")
	private WebElement tblOrderReference;

	@FindBy(xpath = "//th[.='Date']")
	private WebElement tblDate;

	@FindBy(xpath = "//th[.='Total price']")
	private WebElement tblTotalprice;

	@FindBy(xpath = "//th[@class='item footable-sortable footable-last-column']")
	private WebElement tblStatus;
	
	@FindBy (css = "#order-list .first_item > .history_link")
	private WebElement detailOrderReference;
	
	@FindBy (xpath = "//tr[@class='first_item footable-detail-show']/td[@class='history_date bold']")
	private WebElement dateDetailReference;
	
	@FindBy (css = ".footable-detail-show > .history_price")
	private WebElement  detailTotalPrice;
	
	@FindBy (css = ".footable-detail-show > .history_state")
	private WebElement detailStatus;
	
	@FindBy (css = "#order-list .first_item > .history_invoice")
	private WebElement detailInvoice;

	@FindBy(css = ".footable-detail-show > .history_state")
	private WebElement listOrderReference;
	
	@FindBy (css = "#order-list .first_item > .history_detail")
	private WebElement detailsButton;
	

	@FindBy(xpath = "//option[.='-- Choose --']")
	private WebElement dropDownRoomType;

	@FindBy(xpath = "//option[@value='3']")
	private WebElement dropdownExecutiveRooms;

	@FindBy(name = "msgText")
	private WebElement txtAreaComments;

	@FindBy(xpath = "//textarea[@name='msgText']")
	private WebElement txtAreaCommentsRoom;

	@FindBy(xpath = "//span[.='Send']")
	private WebElement btnSendComments;

	@FindBy(css = ".alert")
	private WebElement alertSuccessMessageSent;

	@FindBy(xpath = "//tr[@class='last_item ']//span[contains(.,'Details')]")
	private WebElement clickDetailsOrderHistory;

	@FindBy(xpath = "//option[.='General Rooms']")
	private WebElement dropdownGeneralRoom;

	public boolean getOrderHistory() {
		WaitUntilElementIsVisible(tblOrderReference);
		tblOrderReference.isDisplayed();
		WaitUntilElementIsVisible(tblDate);
		tblDate.isDisplayed();
		WaitUntilElementIsVisible(tblTotalprice);
		tblTotalprice.isDisplayed();
		WaitUntilElementIsVisible(detailOrderReference);
		detailOrderReference.isDisplayed();
		//WaitUntilElementIsVisible(dateDetailReference);
		//dateDetailReference.isDisplayed();
		//WaitUntilElementIsVisible(detailTotalPrice);
		//detailTotalPrice.isDisplayed();
		//WaitUntilElementIsVisible(detailStatus);
		//detailStatus.isDisplayed();
		//WaitUntilElementIsVisible(detailInvoice);
		//detailInvoice.isDisplayed();
		
		
		

		return true;
	}

	public void clicklistOrderReference() {
		listOrderReference.click();
	}

    public void clickDropdownType(){

        WaitUntilElementIsVisible(dropDownRoomType);
        dropDownRoomType.isDisplayed();
        WaitUntilElementIsClickable(dropDownRoomType);
        dropDownRoomType.isEnabled();
        dropDownRoomType.click();
        dropdownGeneralRoom.click();
    }

	public void commentExecutiveRooms(String comments) {
		txtAreaCommentsRoom.sendKeys(comments);
		;
	}

	public void clickBtnSendComments() {
		btnSendComments.click();
	}

	public void getSuccessCommentSent() {
		WaitUntilElementIsVisible(alertSuccessMessageSent);
		alertSuccessMessageSent.isDisplayed();
	}

	public void clickDetailsOrderHistory() {
		clickDetailsOrderHistory.click();

	}

	public void tesscrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("window.scroll(0,250)");
	}

}
