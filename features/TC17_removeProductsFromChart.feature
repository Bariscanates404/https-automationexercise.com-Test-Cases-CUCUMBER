Feature: TC17_Remove Product Cart
  @remove_product
  Scenario: TC17_Remove Product Cart
            (Urunu sepetten kadirma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici sepete urun ekler
    Then kullanici Added olunca view cart butona tiklar
    Then kullanici cart page in gorunur oldugunu test eder
    Then kullanici belirli bir urune gelen X butonuna tiklar
    Then kullanici urunun sepetten cikarildigini test eder
