Feature: Login existing Mail and Logout user
  @login
  Scenario: TC04_TC05_Login_User_With_Correct_email_and_password_and_logout
  (Dogru e-posta ve sifre ile kullanici oturum acma ve cikis yapma)

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
    Then kullanici logout butonuna basar
