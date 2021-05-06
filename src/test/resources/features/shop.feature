@Demoqashop
Feature: Shopping


  @TC001
  Scenario: Le client achéte un article


    Given L'utilisateur va sur homepage "http://shop.demoqa.com/"
    And   L'utilisateur choisi un article et le clique


    And   L'utilisateur choisi la couleur
    And   L'utilisateur choisi la taille
    And   L'utilisateur clique sur le boutton 'add to cart'
    Then  L'utilisateur voit l'article a ete transmi au panier


    And   L'utilisateur clique sur le boutton 'view cart'
    Then  L'utilisateur voit le prix dans le panier en haut


    And   L'utilisateur clique sur le boutton proceed to checkout
    And   L'utilisateur tape le first name "Edith"
    And   L'utilisateur tape le last name "Piaf"
    And   L'utilisateur tape le company name "Chanel"
    And   L'utilisateur tape le country "FR"
    And   L'utilisateur tape le adress line1 "75 avenue de Paris"
    And   L'utilisateur tape le adress line2 "12. arrondissement"
    And   L'utilisateur tape le city "Paris"
    And   L'utilisateur tape le pin code "75000"
    And   L'utilisateur tape le phone "0655239874"
    And   L'utilisateur tape le e-mail "edith@piaf.com"
    And   L'utilisateur coche 'terms and conditions'
    And   L'utilisateur clique sur le boutton place order
    Then  L'utilisateur voit success message "Thank you. Your order has been received."

