Feature:TC22_Add to Cart of from Recommended Items

  @recommended_items
  Scenario: TC22_Add to Cart of from Recommended Items
            (Onerilen urunlerden sepete ekleme)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici sayfada scroll down yapar
    Then kullanici RECOMMENDED ITEMS in gorunur oldugunu test eder
    Then kullanici onerilen urun icin Add To Cart a tiklar
    Then kullanici sonrasinda view cart butona tiklar
    Then kullanici sepet sayfasina urunun eklendigini test eder