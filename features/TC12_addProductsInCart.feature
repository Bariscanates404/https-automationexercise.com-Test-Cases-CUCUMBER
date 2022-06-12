Feature: Add Products in Cart

  @add_products_to_cart
  Scenario: TC12_Add Products in Cart
            (sepete urun ekleme)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    And kullanici Products butonuna tiklar
    And kullanici ilk urune hover over yapar ve tiklayarak sepete ekler
    And kullanici continue shopping butona tiklar
    And kullanici ikinci urune hover over yapar ve tiklayarak sepete ekler
    And kullanici view cart butona tiklar
    Then kullanici her iki urunun de sepete eklendigini test eder
    Then kullanici prices, quantity ve total price degerlerini test eder