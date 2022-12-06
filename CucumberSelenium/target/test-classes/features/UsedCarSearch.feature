@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is working fine

  Scenario:In order to validate that
  the used search cars page is working fine
  we will do the acceptance testing

    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website
    When  I move to the menu
      | Menu        |
      | Search Cars |
      | Sell My Car |
    And click on "Used Search Cars" link on Used Search Car page
    And I select car brand as "Audi" from AnyMake dropdown on Used Search Cars  page
    And I select car model on Used Search Car page
      | carModel |
      | A4        |
      | A5       |
    And I select location as "Any Location" from SelectLocation dropdown on Used Search Car page
    And I select price as "$30,000" from SelectPrice dropdown on Used Search Car page
    And I click on Find_My_Next_Car button on Used Search Car page
    Then I should see list of searched cars on Used Search Car page
    And the page title should be "Used & Second Hand Audi A4 Under 30000 for Sale | carsguide"