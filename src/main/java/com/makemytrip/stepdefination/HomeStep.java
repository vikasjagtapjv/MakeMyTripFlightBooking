package com.makemytrip.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import com.makemytrip.base.Base;
import com.makemytrip.pom.Home;

import io.cucumber.java.en.*;
import junit.framework.Assert;
public class HomeStep extends Base {
	public Home hm;
	@Given("User laungh the browser")
	public void user_laungh_the_browser() {
		driver=new ChromeDriver();
		hm=new Home();
	    }

	@When("user enters the url")
	public void user_enters_the_url() {
		driver.manage().window().maximize();
		
		launchWebUrl();
	    }

	@When("User select the from city and to city")
	public void user_select_the_from_city_and_to_city() {
		waitHelper();
		hm.clickOnFromOption();
		hm.selectElementFromList();
		hm.clickOnToOption();
		hm.selectElementToList();
		
		
		
		
	}

	@When("User select the deprature date and return date")
	public void user_select_the_deprature_date_and_return_date() {
		hm.selectDepartureDate();
		hm.selectreturnDate();
	}

	@When("User click on search")
	public void user_click_on_search() {
		hm.clickOnSearch(); 
  
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			Assert.assertTrue(true);
		}
	   }

	@Then("Close the browser")
	public void close_the_browser() {
	driver.close();
	}



}
