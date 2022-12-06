package steps;



import actions.CarsGuideHomePageActions;
import actions.CarsSearchPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.SeleniumDriver;

import java.util.List;

public class CarSearchSteps  {
  CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
  CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();


  @Given("I am on the Home Page {string} of CarsGuide website")
    public void iAmOnTheHomePageOfCarsGuideWebsite(String websiteUrl) {
        SeleniumDriver.openPage(websiteUrl);
    }

    @When("I move to the menu")
    public void iMoveToTheMenu(List<String> list) {

        String menu = list.get(1);
        System.out.println("Menu selected is: "+menu);
        carsGuideHomePageActions.moveToCarsForSaleMenu();

    }

    @And("click on {string} link")
    public void clickOnLink(String searchCars) {

            carsGuideHomePageActions.clickOnSearchCarsMenu();
    }

    @And("I select car brand as {string} from AnyMake dropdown")
    public void iSelectCarBrandAsFromAnyMakeDropdown(String carBrand) {

            carsSearchPageActions.selectCarMake(carBrand);

    }

    @And("I select car model as {string} from SelectModel dropdown")
    public void iSelectCarModelAsFromSelectModelDropdown(String carModel) {

        carsSearchPageActions.selectCarModel(carModel);

    }

    @And("I select location as {string} from SelectLocation dropdown")
    public void iSelectLocationAsFromSelectLocationDropdown(String location) {

        carsSearchPageActions.selectLocation(location);

    }

    @And("I select price as {string} from SelectPrice dropdown")
    public void iSelectPriceAsFromSelectPriceDropdown(String carPrice) {

        carsSearchPageActions.selectPrice(carPrice);

    }

    @And("I click on Find_My_Next_Car button")
    public void iClickOnFind_My_Next_CarButton() {

        carsSearchPageActions.clickOnFindMyNextCarButton();
    }

    @Then("I should see list of searched cars")
    public void iShouldSeeListOfSearchedCars() {
        System.out.println("Car list found");
    }

    @And("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {

      String actual_title = SeleniumDriver.getDriver().getTitle();
      Assert.assertEquals(actual_title,expectedTitle);

    }



}
