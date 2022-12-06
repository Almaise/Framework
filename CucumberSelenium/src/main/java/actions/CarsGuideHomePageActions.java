package actions;

import locators.CarsGuideHomePageLocators;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumDriver;



public class CarsGuideHomePageActions {

    CarsGuideHomePageLocators carsGuideHomePageLocators = null;


    public  CarsGuideHomePageActions(){
        this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
    }

    public void moveToCarsForSaleMenu() {
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();


    }
    //moveToCarsForSaleMenu
    public void clickOnSearchCarsMenu(){
        carsGuideHomePageLocators.searchCarsLink.click();
    }


    //moveToCarsForSaleMenu
    public void clickOnUsedCarsSearchMenu(){

        carsGuideHomePageLocators.usedCarsSearchLink.click();
    }
//
//    //moveToCarsForSaleMenu
//    public void moveToSellMyCarMenu(){
//        Actions action = new Actions(SeleniumDriver.getDriver());
//        action.moveToElement(carsGuideHomePageLocators.sellMyCarLink).perform();
//    }
}
