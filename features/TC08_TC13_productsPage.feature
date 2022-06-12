Feature: Products page feature
  @verifyAllProduct  @vip
  Scenario: TC08_verify all products product detail page
            (Tum urunleri dogrulama ve urun detay sayfasi)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    Then kullanici ALL PRODUCTS sayfasina basariyla yonlendirildigini test eder
    Then kullanici urun listesini gorur
    Then kullanici ilk urunde View Product a tiklar
    Then kullanici, urun detay sayfasina yonlendirilir
    Then kullanici ayrintilarin(urun adi, kategori, fiyat, bulunabilirlik, durum, marka) gorunur oldugunu test eder

  @verifyProductQuantityCart
  Scenario: TC13_verify product quantity in cart

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then ana sayfada herhangi bir urune tiklar
    Then kullanici urun detayinin acildigini gorur
    Then kullanici miktari dorde cikarir
    Then kullanici add to cart butona tiklar
    Then kullanici Added olunca view cart butona tiklar
    Then kullanici urunun sepet sayfasinda artirilan miktar kadar goruntulendigini test eder