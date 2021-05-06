$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/shop.feature");
formatter.feature({
  "name": "Shopping",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Demoqashop"
    }
  ]
});
formatter.scenario({
  "name": "Le client achéte un article",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demoqashop"
    },
    {
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "name": "L\u0027utilisateur va sur homepage \"http://shop.demoqa.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_va_sur_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur choisi un article et le clique",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_choisi_un_article_et_le_clique()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur choisi la couleur",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_choisi_la_couleur()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur choisi la taille",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_choisi_la_taille()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur clique sur le boutton \u0027add to cart\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_clique_sur_le_boutton_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur voit l\u0027article a ete transmi au panier",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_voit_l_article_a_ete_transmi_au_panier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur clique sur le boutton \u0027view cart\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_clique_sur_le_boutton_view_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur voit le prix dans le panier en haut",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_voit_le_prix_dans_le_panier_en_haut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur clique sur le boutton proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_clique_sur_le_boutton_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le first name \"Edith\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le last name \"Piaf\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le company name \"Chanel\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_company_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le country \"FR\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_country(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le adress line1 \"75 avenue de Paris\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_adress_line1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le adress line2 \"12. arrondissement\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_adress_line2(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le city \"Paris\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_city(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le pin code \"75000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_pin_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le phone \"0655239874\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_phone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur tape le e-mail \"edith@piaf.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_tape_le_e_mail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur coche \u0027terms and conditions\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_coche_terms_and_conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur clique sur le boutton place order",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_clique_sur_le_boutton_place_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "L\u0027utilisateur voit success message \"Thank you. Your order has been received.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.Shop_Solution2_StepDefinions.l_utilisateur_voit_success_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});