Feature: Test cases page
  @verifytc
  Scenario: TC07_verify Test cases page
            (Testcase pageleri dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then Test Cases butonuna tiklar
    Then kullanicinin test page sayfalarina dogru yoneldiginin basarili oldugunu test eder

