@place_order_before
Feature: TC14_Place Order Register Before Checkout

  Scenario: C14_Place Order Register Before Checkout
            (Odeme yapmadan once siparis ile kayit olma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    Then kullanici olarak isim ve maili girer
    Then signup butonuna tiklar
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici ayrintilari (ikinci bolum) doldurur
    Then kullanici Create Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular
    Then kullanici Continue butonuna tiklar
    Then kullanici oturum actigini dogrulamasi gerekir(Logged in as username)
    Then kullanici sepete urun ekler
    Then kullanici view cart butona tiklar
    Then kullanici cart page in gorunur oldugunu test eder
    And kullanici sayfadaki Proceed To Checkout a tiklar
    And kullanici adres detaylarini ve siparisini gorur
    And kullanici description in comment text areaya yorum girer ve place order a tiklar
    And kullanici odeme bilgilerini; Name on Card, Card Number, CVC, Expiration date doldurur
    And kullanici Pay and Confirm Order butona tiklar
    And kullanici success message Your order has been placed successfully
    And kullanici Delete Account butana tiklar
    Then kullanici hesabin silindigini test eder

# bu test icin hic step defs olusturmaya gerek kalmadi..butun adimlar var, yasasin resuability :)
# hic yazmasak da olurdu bu featue i ancak butun sitenin Test caseleri tam olsun diye ekledim