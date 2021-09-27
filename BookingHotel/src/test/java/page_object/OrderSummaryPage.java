package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderSummaryPage extends BaseClass {

	public OrderSummaryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (css = ".page-subheading")
	private WebElement lblPembayaranViaTransfer;
	
	@FindBy (xpath = "//strong[contains(.,'You have chosen to pay by bank wire. Here is a short summary of your order:')]")
	private WebElement lblTransferSelected;
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement btnConfirmOrder; 
	
	public void clickBtnKonfirmasiPembelian()
	{
		btnConfirmOrder.click();
	}
	public void getInformationTransfer()
	{
		WaitUntilElementIsVisible(lblPembayaranViaTransfer);
		lblPembayaranViaTransfer.isDisplayed();
		WaitUntilElementIsVisible(lblTransferSelected);
		lblTransferSelected.isDisplayed();
	}
	

}
