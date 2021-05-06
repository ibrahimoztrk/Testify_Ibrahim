package Tests;

import Pages.Shop_page;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shop_Solution1 {


    Shop_page shop_page;
    WebDriverWait wait;
    Select select;

    {
        shop_page = new Shop_page();
        wait = new WebDriverWait(Driver.getDriver(), 10);
    }


    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_demoqa"));
        shop_page.pinkDropThisrt.click();

    }

    @Test
    public void TC01() {
        select = new Select(shop_page.selectCouleur_PD);
        select.selectByIndex(1);
        select = new Select(shop_page.selectSize_PD);
        select.selectByVisibleText("37");

        shop_page.buttonAddtoCart.click();
        Assert.assertTrue(shop_page.message_Cart.getText().contains(ConfigurationReader.getProperty("message_cart")));

    }

    @Test
    public void TC02() {

        shop_page.button_ViewCart.click();
        wait.until(ExpectedConditions.visibilityOf(shop_page.totalCartPrice));
        Assert.assertTrue(shop_page.totalCartPrice.isDisplayed());

        shop_page.proceedLinkButton.click();

    }

    @Test
    public void TC03() {

        shop_page.form_FirstName.sendKeys(ConfigurationReader.getProperty("first_name"));
        shop_page.form_LastName.sendKeys(ConfigurationReader.getProperty("last_name"));
        shop_page.form_CompanyName.sendKeys(ConfigurationReader.getProperty("company_name"));
        select = new Select(shop_page.select_Country);
        select.selectByValue(ConfigurationReader.getProperty("country"));

        shop_page.address_Line1.sendKeys(ConfigurationReader.getProperty("address_line1"));
        shop_page.address_Line2.sendKeys(ConfigurationReader.getProperty("address_line2"));
        shop_page.form_Postcode.sendKeys(ConfigurationReader.getProperty("postcode"));
        shop_page.form_City.sendKeys(ConfigurationReader.getProperty("city"));

        shop_page.form_Phone.sendKeys(ConfigurationReader.getProperty("phone"));
        shop_page.form_Mail.sendKeys(ConfigurationReader.getProperty("mail"));
        shop_page.form_TermsCheckbox.click();
        shop_page.placeOrderButton.click();

    }

    @Test
    public void TC04() {

        String success_Message = shop_page.succesMessage_Order.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("expected_message"), success_Message);
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
