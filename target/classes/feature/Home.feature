@Retesting
Feature: Booking

  Scenario: Book Flight
    Given User laungh the browser
    When user enters the url
    And User select the from city and to city
    And User select the deprature date and return date
    And User click on search
    Then Page title should be "MakeMyTrip"
    And Close the browser
