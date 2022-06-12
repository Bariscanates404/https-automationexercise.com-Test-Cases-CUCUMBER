Feature: Search product

  @search_product
  Scenario: TC_09 search product
  (aranan urunu dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    Then kullanici ALL PRODUCTS sayfasina basariyla yonlendirildigini test eder
    And kullanici arama girisine urun adini girer ve arama dugmesine tiklar
    And kullanici SEARCHED PRODUCTS gorunur oldugunu test eder
    And aramayla ilgili tum urunlerin gorunur oldugunu test eder

  @search_product_verify
  Scenario: TC_20 search product verify
            (aranan urunu dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    Then kullanici ALL PRODUCTS sayfasina basariyla yonlendirildigini test eder
    And kullanici arama girisine urun adini girer ve arama dugmesine tiklar
    And kullanici ilk urune hover over yapar ve tiklayarak sepete ekler
    And kullanici continue shopping butona tiklar
    And kullanici signup-login butonuna tiklar
    Then kullanicinin Login to your account yazisinin gorunur oldugunu test eder
    Then kullanici dogru email ve sifreyi girer
      |email|password|
      |practicebatch44@gmail.com| 123456|
    Then kullanici login butonuna tiklar
    Then kullanici oturum actigini test eder(Logged in as username)
