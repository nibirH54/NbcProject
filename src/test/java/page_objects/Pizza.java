package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pizza {
    private static final Logger LOGGER = LogManager.getLogger(Pizza.class);

    private final By Pizza1 = By.id("pizza1Pizza");
    private final By Topping1 = By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
    private final By Topping2 = By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
    private final By Quantity = By.id("pizza1Qty");
    private final By PizzaCost = By.id("pizza1Cost");

    private final By Name = By.id("name");
    private final By Email = By.id("email");
    private final By Phone = By.id("phone");

    private final By Credit = By.id("ccpayment");
    private final By Cash = By.id("cashpayment");

    private final By PlaceOrderButton = By.id("placeOrder");
    private final By ResetButton = By.id("reset");

    private final By DialogBox = By.id("dialog");
    private final By DialogText = By.xpath("//div[@id='dialog']/p");

    public WebDriver driver;
    public Pizza(WebDriver driver){

    }

    //Choose pizza1
    public Pizza choosePizza1(String value){
        LOGGER.debug("Choose pizza1 is: " + value);
        ActOn.element(driver, Pizza1).selectValue(value);
        return this;
    }
    //Choose Topping1
    public Pizza chooseTopping1(String value){
        LOGGER.debug("Choose topping1 is: " + value);
        ActOn.element(driver, Topping1).selectValue(value);
        return this;
    }
    //Choose Topping2
    public Pizza chooseTopping2(String value){
        LOGGER.debug("Choose topping 2: " + value);
        ActOn.element(driver, Topping2).selectValue(value);
        return this;
    }
    //Select Pizza Quantity
    public Pizza selectQuantity(String value){
        LOGGER.debug("Select pizza quantity: " + value);
        ActOn.element(driver, Quantity).setValue(value);
        return this;
    }
    //Get pizza Price
    public Pizza getPizzaCost(String value){
        LOGGER.debug("Get pizza value: " + value);
        ActOn.element(driver, PizzaCost).equals(value);
        return this;
    }
    //Enter name
    public Pizza enterName(String value){
        LOGGER.debug("Enter customer name: " + value);
        ActOn.element(driver, Name).setValue(value);
        return this;
    }
    //Enter Email
    public Pizza enterEmail(String value){
        LOGGER.debug("Enter email for customer: " + value);
        ActOn.element(driver, Email).setValue(value);
        return this;
    }
    //Enter Phone number
    public Pizza enterPhone(String value){
        LOGGER.debug("Enter customer phone number: " + value);
        ActOn.element(driver, Phone).setValue(value);
        return this;
    }
    //Enter Payment by credit card
    public Pizza selectCreditCard(String card){
        LOGGER.debug("Enter Payment by card: " + card);
        ActOn.element(driver, Credit).selectValue(card);
        return this;
    }
    //Enter Payment by cash
    public Pizza selectCash(String cash){
        LOGGER.debug("Enter Payment By cash: " + cash);
        ActOn.element(driver, Cash).selectValue(cash);
        return this;
    }
    //Click on place order button
    public Pizza placeOrder(){
        LOGGER.debug("Click on place order button");
        ActOn.element(driver, PlaceOrderButton).click();
        return this;
    }
    //Click on Reset button
    public Pizza resetOrder(){
        LOGGER.debug("Click on reset button");
        ActOn.element(driver, ResetButton).click();
        return this;
    }
    //Check dialog box
    public Pizza checkDialogBox(String value){
        LOGGER.debug("Check dialogue box: " + value);
        ActOn.element(driver, DialogBox).getElement().isDisplayed();
        return this;
    }
    //Check dialog text
    public Pizza checkDialogText(String value){
        LOGGER.debug("Check dialog text is shown: " + value);
        ActOn.element(driver, DialogText).getElement().getText();
        return this;
    }

}
