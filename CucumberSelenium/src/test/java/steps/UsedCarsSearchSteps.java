package steps;

import actions.CarsGuideHomePageActions;
import actions.UsedCarsSearchPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class UsedCarsSearchSteps {
    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
    UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();


        @And("click on {string} link on Used Search Car page")
    public void clickOnLinkOnUsedSearchCarPage(String arg) {
            carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
    }

    @And("I select car brand as {string} from AnyMake dropdown on Used Search Cars  page")
    public void iSelectCarBrandAsFromAnyMakeDropdownOnUsedSearchCarsPage(String carBrand) {
            usedCarsSearchPageActions.selectCarMake(carBrand);
    }

    @And("I select car model on Used Search Car page")
    public void iSelectCarModelOnUsedSearchCarPage(List<String> list) {
        String menu = list.get(1);
        usedCarsSearchPageActions.selectCarModel(menu);
    }

    @And("I select location as {string} from SelectLocation dropdown on Used Search Car page")
    public void iSelectLocationAsFromSelectLocationDropdownOnUsedSearchCarPage(String location) {
        usedCarsSearchPageActions.selectLocation(location);

    }

    @And("I select price as {string} from SelectPrice dropdown on Used Search Car page")
    public void iSelectPriceAsFromSelectPriceDropdownOnUsedSearchCarPage(String carPrice) {
        usedCarsSearchPageActions.selectPrice(carPrice);

    }

    @And("I click on Find_My_Next_Car button on Used Search Car page")
    public void iClickOnFind_My_Next_CarButtonOnUsedSearchCarPage() {
        usedCarsSearchPageActions.clickOnFindMyNextCarButton();

    }

    @Then("I should see list of searched cars on Used Search Car page")
    public void iShouldSeeListOfSearchedCarsOnUsedSearchCarPage() {
        System.out.println("Used car list populated");
    }
}
