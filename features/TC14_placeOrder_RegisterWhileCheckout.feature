@place_order_while
Feature: TC14_Place Order Register while Checkout

  Scenario: C14_Place Order Register while Checkout
            (Odeme sirasinda siparis ile kayit olma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici sepete urun ekler
    Then kullanici continue shopping butona tiklar
    Then kullanici anasayfadaki cart butona tiklar
    Then kullanici sepet sayfasina urunun eklendigini test eder
    And kullanici sayfadaki Proceed To Checkout a tiklar
    And kullanici acilan pencerede Register-Login e tiklar
    And kullanici New User Signup daki name ve email bilgilerini girer
    And kullanici signup butona tiklar
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici ayrintilari (ikinci bolum) doldurur
    Then kullanici Create Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular
    When kullanici Continue butonuna tiklar
    Then kullanici oturum actigini dogrulamasi gerekir(Logged in as username)
    And kullanici anasayfadaki cart butona tiklar
    And kullanici sayfadaki Proceed To Checkout a tiklar
    And kullanici adres detaylarini ve siparisini gorur
    And kullanici description in comment text areaya yorum girer ve place order a tiklar
    And kullanici odeme bilgilerini; Name on Card, Card Number, CVC, Expiration date doldurur
    And kullanici Pay and Confirm Order butona tiklar
    And kullanici success message Your order has been placed successfully
    And kullanici Delete Account butana tiklar
    Then kullanici hesabin silindigini test eder