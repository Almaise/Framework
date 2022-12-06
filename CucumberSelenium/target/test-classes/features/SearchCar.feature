@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine

  Scenario:In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website
    When  I move to the menu
      | Menu        |
      | Search Cars |
      | Sell My Car |
    And click on "Search Cars" link
    And I select car brand as "BMW" from AnyMake dropdown
    And I select car model as "1 Series" from SelectModel dropdown
    And I select location as "Any Location" from SelectLocation dropdown
    And I select price as "$45,000" from SelectPrice dropdown
    And I click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 45000 for Sale | carsguide"