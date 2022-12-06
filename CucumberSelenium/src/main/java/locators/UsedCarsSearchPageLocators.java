package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {
    @FindBy(how = How.XPATH,using="//*[@id='makes']")
    public WebElement carMakeDropDown;

    @FindBy(how = How.XPATH,using="//*[@id='models']")
    public WebElement selectModelDropDown;

    @FindBy(how = How.XPATH,using="//*[@id=\"locations\"]")
    public WebElement selectLocationDropDown;

    @FindBy(how = How.XPATH,using="//*[@id=\"priceTo\"]")
    public WebElement priceDropDown;

    @FindBy(how = How.XPATH,using="//*[@id=\"search-submit\"]")
    public WebElement findMyNextCarBtn;

    @FindBy(how = How.LINK_TEXT,using="Used Cars Search")
    public WebElement usedCarsSearchLink;


}
