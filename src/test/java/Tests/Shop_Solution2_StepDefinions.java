package Tests;

import Pages.Shop_page;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shop_Solution2_StepDefinions {


    Shop_page shop_page;
    WebDriverWait wait;
    Select select;


    {
        shop_page = new Shop_page();
        wait = new WebDriverWait(Driver.getDriver(), 10);
    }


    @Given("L'utilisateur va sur homepage {string}")
    public void l_utilisateur_va_sur_homepage(String url) {
        Driver.getDriver().get(url);
    }

    @Given("L'utilisateur choisi un article et le clique")
    public void l_utilisateur_choisi_un_article_et_le_clique() {
        shop_page.pinkDropThisrt.click();
    }

    @Given("L'utilisateur choisi la couleur")
    public void l_utilisateur_choisi_la_couleur() {
        select = new Select(shop_page.selectCouleur_PD);
        select.selectByIndex(1);
    }

    @Given("L'utilisateur choisi la taille")
    public void l_utilisateur_choisi_la_taille() {
        select = new Select(shop_page.selectSize_PD);
        select.selectByVisibleText("37");
    }

    @Given("L'utilisateur clique sur le boutton 'add to cart'")
    public void l_utilisateur_clique_sur_le_boutton_add_to_cart() {
        shop_page.buttonAddtoCart.click();
    }

    @Then("L'utilisateur voit l'article a ete transmi au panier")
    public void l_utilisateur_voit_l_article_a_ete_transmi_au_panier() {
        String message = "“pink drop shoulder oversized t shirt” has been added to your cart.";
        Assert.assertTrue(shop_page.message_Cart.getText().contains(message));
    }

    @Then("L'utilisateur clique sur le boutton 'view cart'")
    public void l_utilisateur_clique_sur_le_boutton_view_cart() {
        shop_page.button_ViewCart.click();
    }

    @Then("L'utilisateur voit le prix dans le panier en haut")
    public void l_utilisateur_voit_le_prix_dans_le_panier_en_haut() {
        wait.until(ExpectedConditions.visibilityOf(shop_page.totalCartPrice));
        Assert.assertTrue(shop_page.totalCartPrice.isDisplayed());
    }

    @Given("L'utilisateur clique sur le boutton proceed to checkout")
    public void l_utilisateur_clique_sur_le_boutton_proceed_to_checkout() {
        shop_page.proceedLinkButton.click();
    }

    @Given("L'utilisateur tape le first name {string}")
    public void l_utilisateur_tape_le_first_name(String name) {
        shop_page.form_FirstName.sendKeys(name);
    }

    @Given("L'utilisateur tape le last name {string}")
    public void l_utilisateur_tape_le_last_name(String string) {
        shop_page.form_LastName.sendKeys(string);
    }

    @Given("L'utilisateur tape le company name {string}")
    public void l_utilisateur_tape_le_company_name(String string) {
        shop_page.form_CompanyName.sendKeys(string);
    }

    @Given("L'utilisateur tape le country {string}")
    public void l_utilisateur_tape_le_country(String country) {
        select = new Select(shop_page.select_Country);
        select.selectByValue(country);
    }

    @Given("L'utilisateur tape le adress line1 {string}")
    public void l_utilisateur_tape_le_adress_line1(String line1) {
        shop_page.address_Line1.sendKeys(line1);
    }

    @Given("L'utilisateur tape le adress line2 {string}")
    public void l_utilisateur_tape_le_adress_line2(String line2) {
        shop_page.address_Line2.sendKeys(line2);
    }

    @Given("L'utilisateur tape le city {string}")
    public void l_utilisateur_tape_le_city(String city) { shop_page.form_City.sendKeys(city);
    }

    @Given("L'utilisateur tape le pin code {string}")
    public void l_utilisateur_tape_le_pin_code(String postcode) {
        shop_page.form_Postcode.sendKeys(postcode);
    }

    @Given("L'utilisateur tape le phone {string}")
    public void l_utilisateur_tape_le_phone(String phone) {
        shop_page.form_Phone.sendKeys(phone);
    }

    @Given("L'utilisateur tape le e-mail {string}")
    public void l_utilisateur_tape_le_e_mail(String mail) {
        shop_page.form_Mail.sendKeys(mail);
    }

    @Given("L'utilisateur coche 'terms and conditions'")
    public void l_utilisateur_coche_terms_and_conditions() {
        shop_page.form_TermsCheckbox.click();

    }

    @Given("L'utilisateur clique sur le boutton place order")
    public void l_utilisateur_clique_sur_le_boutton_place_order() {
        shop_page.placeOrderButton.click();
    }

    @Then("L'utilisateur voit success message {string}")
    public void l_utilisateur_voit_success_message(String string) {

        String succes_Message = shop_page.succesMessage_Order.getText();
        Assert.assertEquals(string, succes_Message);
    }


}
