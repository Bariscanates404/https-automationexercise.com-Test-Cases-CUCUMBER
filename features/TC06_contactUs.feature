Feature: User contactUs with fill form
  @contact
  Scenario: TC06_User can contact us
            (Kullanicinin bizimle iletisime gecebilmesi)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici Contact Us butonuna tiklar
    Then kullanici GET IN TOUCH in gorunur oldugunu test eder
    Then kullanici name, email, subject ve message bilgilerini girer
    Then kullanici dosya sec butonundan dosya yukler
    Then kullanici Submit butonuna tiklar
    Then kullanici acilan pencerede OK butonuna tiklar
    Then kullanici 'Success! Your details have been submitted successfully.'mesajini test eder
    Then kullanici Home butonuna tiklar ve sonrasinda anasayfanin acildigini test eder



