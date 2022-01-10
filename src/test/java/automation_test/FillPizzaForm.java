package automation_test;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Pizza;
import utilities.ReadConfigFiles;

public class FillPizzaForm {
    private static final Logger LOGGER = LogManager.getLogger(FillPizzaForm.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitializations(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("----------Start Test(FillPizzaForm)-----------");
        String url = ReadConfigFiles.getPropertyValues("PizzaFormUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with the URL: " + url);

    }

    @Test
    public void fillPizzaForm(){
        new Pizza(driver)
                .choosePizza1("Large 10 Slices - 2 toppings")
                .chooseTopping1("Diced Mango")
                .chooseTopping2("Mozzarella cheese")
                .selectQuantity("1")
                .enterName("Nibir Hasan")
                .enterEmail("nibirw@gmail.com")
                .enterPhone("5164050726")
                .selectCreditCard("card")
                .selectCash("cash")
                .placeOrder()
                .resetOrder();





    }
}

