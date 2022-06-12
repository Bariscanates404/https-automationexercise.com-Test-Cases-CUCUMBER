@add_review
Feature: TC21_Add Review on Product

  Scenario: TC21_Add Review on Product
            (urune yorum ekleme)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici Products butonuna tiklar
    Then kullanici ALL PRODUCTS sayfasina basariyla yonlendirildigini test eder
    Then kullanici View Product butonuna tiklar
    Then kullnaici Write Your Review gorunur oldugunu test eder
    Then kullanici name, email ve review bilgilerini gider
    Then kullanici yorum gondermek icin Submit butonuna tiklar
    Then kullanici Thank you for your review mesajinin gorunur oldugunu test eder