package com.makemytrip.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.base.Base;
import com.makemytrip.utility.ActionsClass;

public class Home extends Base {
	ActionsClass ac = new ActionsClass();
	{
		PageFactory.initElements(driver, this);
	}
	String day = "8";
	String month = "December";
	@FindBy(xpath = "(//span[contains(@class,'tabsCircle appendRight5')])[2]")
	private WebElement roundTrip;

	@FindBy(xpath = "(//input[contains(@id,'fromCity')])")
	private WebElement from;

	@FindBy(xpath = "//li[contains(@role,'option')]//p[contains(@class,'font14 appendBottom5 blackText')]")
	private List<WebElement> cityList;

	@FindBy(xpath = "//input[contains(@id,'toCity')]")
	private WebElement to;

	@FindBy(xpath = "//p[contains(@class,'font14 appendBottom5 blackText')]")
	private List<WebElement> cityList01;

	@FindBy(xpath = "//input[contains(@id,'departure')]")
	private WebElement departureDate;

	@FindBy(xpath = "(//div[contains(@class,'DayPicker-Month')])[2]//div//p[text()='18']")
	private WebElement dates;

	@FindBy(xpath = "//div//span[contains(text(),'Return')]")
	private WebElement returnDate;

	@FindBy(xpath = "(//div[contains(@class,'DayPicker-Month')])[3]//p[text()='4']")
	private WebElement date01;
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement Search;

	public void clickOnRoundTrip() {
		ac.clickAction(roundTrip);

	}

	public void clickOnFromOption()

	{

		ac.clickAndHoldAction(from);

	}

	public void selectElementFromList() {
		for (WebElement ele : cityList) {
			String s = ele.getText();
			System.out.println(s);
			if (ele.getText().equalsIgnoreCase("Goa - Dabolim Airport, India")) {
				ele.click();
				break;
			} else if (ele.getText().equalsIgnoreCase("Hyderabad, India")) {
				ele.click();
				break;

			}

		}
	}

	public void clickOnToOption() {

		ac.clickAndHoldAction(to);

	}

	public void selectElementToList() {
		for (WebElement ele : cityList01) {
			String s = ele.getText();
			System.out.println(s);
			if (ele.getText().equalsIgnoreCase("Bangkok, Thailand")
					|| ele.getText().equalsIgnoreCase("Chennai, India")) {
				ele.click();
				break;
			}

		}
	}

	public void selectDepartureDate() {

		ac.clickAndHoldAction(departureDate);
		ac.clickAction(dates);

	}

	public void selectreturnDate() {
		ac.doubleClickAction(returnDate);
		ac.clickAndHoldAction(returnDate);
		waitHelper();
		date01.click();

	}

	public void clickOnSearch() {
		Search.click();
	}
	/*
	 * Dry Run: Initialization:
	 * 
	 * The Home class extends Base class. The PageFactory is used to initialize the
	 * page elements. Round Trip:
	 * 
	 * clickOnRoundTrip() clicks on the round trip option. From City Selection:
	 * 
	 * clickOnFromOption() uses Actions to click and hold on the "From" element.
	 * Select From City:
	 * 
	 * selectElementFromList() iterates through the city list and selects either
	 * "Goa - Dabolim Airport, India" or "Hyderabad, India". To City Selection:
	 * 
	 * clickOnToOption() uses Actions to click and hold on the "To" element. Select
	 * To City:
	 * 
	 * selectElementToList() iterates through the city list and selects either
	 * "Bangkok, Thailand" or "Chennai, India". Departure Date Selection:
	 * 
	 * selectDepartureDate() uses Actions to click and hold on the departure date
	 * element and selects the date. Return Date Selection:
	 * 
	 * selectReturnDate() uses Actions to double-click and hold on the return date
	 * element, waits (assuming there's a custom waitHelper() method), and selects
	 * the date. Search:
	 * 
	 * clickOnSearch() clicks on the "Search" button. This code represents a set of
	 * methods for interacting with a flight search page. It uses the Page Object
	 * Model pattern to enhance code readability and maintainability. Each method
	 * corresponds to a specific action on the web page, making the code modular and
	 * easy to understand.
	 */

}
