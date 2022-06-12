Feature: TC23_Verify Address Details In checkoutPage
  @verify_address_details
  Scenario: TC23_Verify Address Details In checkoutPage
            (CheckoutPage'de Adres Ayrintilarini Dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici signup-login butonuna tiklar
    Then kullanici olarak isim ve maili girer
    Then signup butonuna tiklar
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici adress bilgilerini doldurur
    Then kullanici Create Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular
    Then kullanici Continue butonuna tiklar
    Then kullanici oturum actigini dogrulamasi gerekir(Logged in as username)
    Then kullanici sepete urun ekler
    Then kullanici cart butona tiklar
    Then kullanici cart page in gorunur oldugunu test eder
    Then kullanici sayfadaki Proceed To Checkout a tiklar
    Then kullanici girilen adres bilgilerinin ayni oldugunu test eder
    Then kullanici Delete Account butonuna tiklar
    Then kullanici hesabin silindigini test eder

