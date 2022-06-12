Feature: TC25_Verify Scroll Up using Arrow Button Scroll Down
  @scroll_down @vip
  Scenario:  TC25_Verify Scroll using Up Arrow Button Scroll Down
            (Yukari ok dugmesini kullanarak asagi kaydirmayi dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici sayfada footer a erismek icin scroll down yapar
    And subscription(abonelik) textinin gorunur oldugunu test eder
    And kullanici yukari hareket etmek icin sag alttaki oka tiklar
    And kullanici sayfanin yukari kaydirildigini ve -practice website- text ekranda goruldugunu test eder

  @scroll_up
  Scenario:  TC26_Verify Scroll without using Up Arrow Button Scroll Down
  (Yukari ok dugmesini kullanmadan asagi kaydirmayi dogrulama)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici sayfada footer a erismek icin scroll down yapar
    And subscription(abonelik) textinin gorunur oldugunu test eder
    And kullanici yukari hareket etmek icin scroll up yapar
    And kullanici sayfanin yukari kaydirildigini ve -practice website- text ekranda goruldugunu test eder
