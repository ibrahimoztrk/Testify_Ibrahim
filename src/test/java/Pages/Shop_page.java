package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_page {

    public Shop_page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='pink drop shoulder oversized t shirt']")
    public WebElement pinkDropThisrt;
    @FindBy(id = "pa_color")
    public WebElement selectCouleur_PD;
    @FindBy(id = "pa_size")
    public WebElement selectSize_PD;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement buttonAddtoCart;
    @FindBy(xpath = "//*[text()=' “pink drop shoulder oversized t shirt” has been added to your cart.\t']")
    public WebElement message_Cart;
    @FindBy(xpath = "//a[.='View cart']")
    public WebElement button_ViewCart;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement totalCartPrice;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedLinkButton;
    @FindBy(id = "billing_first_name")
    public WebElement form_FirstName;
    @FindBy(id = "billing_last_name")
    public WebElement form_LastName;
    @FindBy(id = "billing_company")
    public WebElement form_CompanyName;
    @FindBy(id = "billing_country")
    public WebElement select_Country;
    @FindBy(id = "billing_address_1")
    public WebElement address_Line1;
    @FindBy(id = "billing_address_2")
    public WebElement address_Line2;
    @FindBy(id = "billing_city")
    public WebElement form_City;
    @FindBy(id = "billing_state")
    public WebElement select_State;
    @FindBy(id = "billing_postcode")
    public WebElement form_Postcode;
    @FindBy(id = "billing_phone")
    public WebElement form_Phone;
    @FindBy(id = "billing_email")
    public WebElement form_Mail;
    @FindBy(id = "createaccount")
    public WebElement form_Checkbox;
    @FindBy(id = "place_order")
    public WebElement placeOrderButton;
    @FindBy(id = "terms")
    public WebElement form_TermsCheckbox;
    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    public WebElement succesMessage_Order;

}
