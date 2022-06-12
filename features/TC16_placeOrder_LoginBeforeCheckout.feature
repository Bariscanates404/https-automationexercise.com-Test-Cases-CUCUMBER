@place_order_login_before_checkout
Feature:TC16_Place Order Login Before Checkout

  Scenario: TC16_Place Order Login Before Checkout
            (Odeme yapmadan once kayitli kullanici siparis girisi yapma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    Then kullanicinin Login to your account yazisinin gorunur oldugunu test eder
    Then kullanici dogru email ve sifreyi girer
      |email|password|
      |practicebatch44@gmail.com| 123456|
    Then kullanici login butonuna tiklar
    Then kullanici oturum actigini test eder(Logged in as username)
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
