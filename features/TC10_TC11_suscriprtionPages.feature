Feature: Verify Subscription In Home Page

  @verify_subscription_in_homepage
  Scenario: TC10_Verify Subscription In Home Page
            (Anasayfada aboneligi dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    And kullanici sayfada footer a erismek icin scroll down yapar
    And subscription(abonelik) textinin gorunur oldugunu test eder
    And kullanici girise e-posta adresini girer ve arrow butona tiklar
    And you have been successfully subscribed! basari mesajini gorundugunu test eder

  @verify_subscription_in_cart_page
  Scenario: TC11_Verify Subscription In Cart
            (sepette aboneligi dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    And kullanici cart butona tiklar
    And subscription(abonelik) textinin gorunur oldugunu test eder
    And kullanici girise e-posta adresini girer ve arrow butona tiklar
    And you have been successfully subscribed! basari mesajini gorundugunu test eder
